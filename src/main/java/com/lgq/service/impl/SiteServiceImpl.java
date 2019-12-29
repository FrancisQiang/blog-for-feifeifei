package com.lgq.service.impl;

import com.lgq.constant.Constants;
import com.lgq.dao.SiteMapper;
import com.lgq.domain.Site;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.util.DateUtil;
import com.lgq.util.RedisUtil;
import com.lgq.vo.SiteAndPageViewVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String todayPageView = Constants.RedisKey.DAY_PAGE_VIEW_PREFIX + sdf.format(new Date());
        log.info(todayPageView);
        siteAndPageViewVO.setTodayPageView(redisUtil.incr(todayPageView));
        return siteAndPageViewVO;
    }

    @Override
    public String updateSiteInfo(Site site) throws BlogException {
        site.setSiteId(1);
        int row = siteMapper.updateByPrimaryKey(site);
        return CodeMessageUtil.updateMessage(row);
    }

    @Override
    public Map<String, List<Object>> getSiteViewTrend() {
        Date date = new Date();
        List<Object> timeList = new ArrayList<>();
        List<Object> viewList = new ArrayList<>();
        for (int i = 6; i >= 0; i--) {
            String pastDate = DateUtil.getPastDate(date, i);
            timeList.add(pastDate);
            pastDate = Constants.RedisKey.DAY_PAGE_VIEW_PREFIX + pastDate;
            Integer viewTime = redisUtil.get(pastDate, Integer.class);
            if (viewTime == null) {
                viewTime = 0;
            }
            viewList.add(viewTime);
        }
        Map<String, List<Object>> returnValue = new HashMap<>();
        returnValue.put(Constants.MapKey.SITE_VIEW_TREND_DATE, timeList);
        returnValue.put(Constants.MapKey.SITE_VIEW_TREND_COUNT, viewList);
        return returnValue;
    }
}
