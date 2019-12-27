package com.lgq.service.impl;

import com.lgq.dao.SiteIconMapper;
import com.lgq.domain.SiteIcon;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteIconService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.SiteIconAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class SiteIconServiceImpl implements SiteIconService {

    private final SiteIconMapper siteIconMapper;

    @Autowired
    @SuppressWarnings("all")
    public SiteIconServiceImpl(SiteIconMapper siteIconMapper) {
        this.siteIconMapper = siteIconMapper;
    }

    @Override
    public String addSiteIcon(SiteIconAddVO siteIcon) throws BlogException {
        SiteIcon targetSiteIcon = new SiteIcon();
        BeanUtils.copyProperties(siteIcon, targetSiteIcon);
        int row = siteIconMapper.insertSelective(targetSiteIcon);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public List<SiteIcon> getAll() {
        return siteIconMapper.selectByExample(null);
    }

    @Override
    public String deleteSiteIconById(int siteIconId) throws BlogException {
        int row = siteIconMapper.deleteByPrimaryKey(siteIconId);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    public String updateSiteIconById(SiteIcon siteIcon) throws BlogException{
        int row = siteIconMapper.updateByPrimaryKeySelective(siteIcon);
        return CodeMessageUtil.updateMessage(row);
    }
}
