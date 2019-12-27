package com.lgq.service;

import com.lgq.domain.Tag;
import com.lgq.exception.BlogException;
import com.lgq.vo.TagAddVO;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
public interface TagService {

    /**
     * 添加标签
     * @param tagAddVO 标签
     * @return 添加结果
     * @throws BlogException 异常
     */
    String addTag(TagAddVO tagAddVO) throws BlogException;

    /**
     * 获取所有标签
     * @return 所有标签
     */
    List<Tag> getAll();

    /**
     * 删除标签
     * @param tagId 标签id
     * @return 删除结果
     * @throws BlogException 异常
     */
    String deleteTagById(Integer tagId) throws BlogException;

    /**
     * 更新标签
     * @param tag 标签
     * @return 更新结果
     * @throws BlogException 异常
     */
    String updateTagById(Tag tag) throws BlogException;
}
