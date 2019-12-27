package com.lgq.service.impl;

import com.lgq.constant.Constants;
import com.lgq.dao.SiteMapper;
import com.lgq.domain.Site;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.util.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
@Slf4j
public class SiteServiceImpl implements SiteService {

    private final SiteMapper siteMapper;

    private final RedisService redisService;

    @Autowired
    @SuppressWarnings("all")
    public SiteServiceImpl(SiteMapper siteMapper, RedisService redisService) {
        this.siteMapper = siteMapper;
        this.redisService = redisService;
    }

    @Override
    public Site getSiteInfo() {
        redisService.incr(Constants.RedisKey.TOTAL_PAGE_VIEW, 1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        StringBuilder stringBuilder = new StringBuilder(Constants.RedisKey.DAY_PAGE_VIEW_PREFIX);
        stringBuilder.append(calendar.get(Calendar.YEAR))
                .append(calendar.get(Calendar.MONTH))
                .append(calendar.get(Calendar.DAY_OF_MONTH));
        log.info(stringBuilder.toString());
        redisService.incr(stringBuilder.toString(), 1);
        return siteMapper.selectByExample(null).get(0);
    }

    @Override
    public String updateSiteInfo(Site site) throws BlogException {
        site.setSiteId(1);
        int row = siteMapper.updateByPrimaryKey(site);
        return CodeMessageUtil.updateMessage(row);
    }
}
