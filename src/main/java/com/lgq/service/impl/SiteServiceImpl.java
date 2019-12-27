package com.lgq.service.impl;

import com.lgq.constant.Constants;
import com.lgq.dao.SiteMapper;
import com.lgq.domain.Site;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteService;
import com.lgq.util.CodeMessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class SiteServiceImpl implements SiteService {

    private final SiteMapper siteMapper;

    @Autowired
    @SuppressWarnings("all")
    public SiteServiceImpl(SiteMapper siteMapper) {
        this.siteMapper = siteMapper;
    }

    @Override
    public Site getSiteInfo() {
        return siteMapper.selectByExample(null).get(0);
    }

    @Override
    public String updateSiteInfo(Site site) throws BlogException {
        int row = siteMapper.updateByPrimaryKeySelective(site);
        return CodeMessageUtil.updateMessage(row);
    }
}
