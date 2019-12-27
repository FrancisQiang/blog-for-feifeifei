package com.lgq.util;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author lgq
 * @date 2019/12/27
 */
@Component
public class RedisUtil {

    private final StringRedisTemplate stringRedisTemplate;

    private final RedisTemplate redisTemplate;

    @Autowired
    public RedisUtil(StringRedisTemplate stringRedisTemplate, RedisTemplate redisTemplate){
        this.stringRedisTemplate = stringRedisTemplate;
        this.redisTemplate = redisTemplate;
    }

    /**
     * 往redis中缓存数据
     */
    public <T> void set(String key, T value) {
        //将value对象转换为json字符串
        String jsonString = beanToString(value);
        ValueOperations<String, String> stringValueOperations = stringRedisTemplate.opsForValue();
        stringValueOperations.set(key, jsonString);
    }

    /**
     * 往redis中缓存数据并加上过期时间
     *
     * @param time 过期时间，秒
     */
    public <T> void set(String key, T value, long time) {
        String jsonString = beanToString(value);
        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
        valueOperations.set(key, jsonString, time, TimeUnit.SECONDS);
    }


    /**
     * 从redis中获取数据
     */
    public <T> T get(String key, Class<T> clazz) {
        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
        String string = valueOperations.get(key);
        if (string != null) {
            return stringToBean(string, clazz);
        }
        return null;
    }

    public Long incr(String key) {
        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
        return valueOperations.increment(key);
    }

    public String getString(String key) {
        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
        String string = valueOperations.get(key);
        if (string != null) {
            return string;
        }
        return null;
    }

    /**
     * 将对象转换为json
     *
     * @param value 对象
     * @param <T> 泛型
     * @return json数据
     */
    private static <T> String beanToString(T value) {
        if (value == null) {
            return null;
        }
        Class<?> clazz = value.getClass();
        //如果value是int类型或者Integer类型的直接返回
        if (clazz == int.class || clazz == Integer.class) {
            return "" + value;
        } else if (clazz == String.class) {
            return (String) value;
        } else if (clazz == long.class || clazz == Long.class) {
            return "" + value;
        } else {
            return JSON.toJSONString(value);
        }
    }

    /**
     * 将jsonString转换为java的对象
     *
     * @param jsonString json字符串
     * @param clazz 类
     * @param <T> 泛型
     * @return java对象
     */
    @SuppressWarnings("unchecked")
    private static <T> T stringToBean(String jsonString, Class<T> clazz) {
        if (jsonString == null || jsonString.length() <= 0 || clazz == null) {
            return null;
        }
        if (clazz == int.class || clazz == Integer.class) {
            return (T) Integer.valueOf(jsonString);
        } else if (clazz == String.class) {
            return (T) jsonString;
        } else if (clazz == long.class || clazz == Long.class) {
            return (T) Long.valueOf(jsonString);
        } else {
            return JSON.toJavaObject(JSON.parseObject(jsonString), clazz);
        }
    }

}
