package com.lgq.service.impl;

import com.lgq.constant.Constants;
import com.lgq.dao.SiteMapper;
import com.lgq.domain.Site;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.util.RedisUtil;
import com.lgq.vo.SiteAndPageViewVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
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

    private final RedisUtil redisUtil;

    @Autowired
    @SuppressWarnings("all")
    public SiteServiceImpl(SiteMapper siteMapper, RedisUtil redisUtil) {
        this.siteMapper = siteMapper;
        this.redisUtil = redisUtil;
    }

    @Override
    public SiteAndPageViewVO getSiteInfo() {
        Site site = siteMapper.selectByExample(null).get(0);
        SiteAndPageViewVO siteAndPageViewVO = new SiteAndPageViewVO();
        BeanUtils.copyProperties(site, siteAndPageViewVO);
        siteAndPageViewVO.setTotalPageView(redisUtil.incr(Constants.RedisKey.TOTAL_PAGE_VIEW));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        StringBuilder stringBuilder = new StringBuilder(Constants.RedisKey.DAY_PAGE_VIEW_PREFIX);
        stringBuilder.append("-").append(calendar.get(Calendar.YEAR)).append("-")
                .append(calendar.get(Calendar.MONTH) + 1).append("-")
                .append(calendar.get(Calendar.DAY_OF_MONTH));
        log.info(stringBuilder.toString());
        siteAndPageViewVO.setTodayPageView(redisUtil.incr(stringBuilder.toString()));
        return siteAndPageViewVO;
    }

    @Override
    public String updateSiteInfo(Site site) throws BlogException {
        site.setSiteId(1);
        int row = siteMapper.updateByPrimaryKey(site);
        return CodeMessageUtil.updateMessage(row);
    }
}
