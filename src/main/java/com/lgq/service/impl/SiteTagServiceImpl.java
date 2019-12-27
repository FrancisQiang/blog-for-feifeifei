package com.lgq.service.impl;

import com.lgq.constant.Constants;
import com.lgq.dao.SiteTagMapper;
import com.lgq.domain.SiteTag;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteTagService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.SiteTagAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class SiteTagServiceImpl implements SiteTagService {

    private final SiteTagMapper siteTagMapper;

    @Autowired
    @SuppressWarnings("all")
    public SiteTagServiceImpl(SiteTagMapper siteTagMapper) {
        this.siteTagMapper = siteTagMapper;
    }

    @Override
    public String addSiteTag(SiteTagAddVO siteTag) throws BlogException{
        SiteTag targetSiteTag = new SiteTag();
        BeanUtils.copyProperties(siteTag, targetSiteTag);
        int row = siteTagMapper.insertSelective(targetSiteTag);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public List<SiteTag> getAll() {
        return siteTagMapper.selectByExample(null);
    }

    @Override
    public String deleteSiteTagById(int siteTagId) throws BlogException{
        int row = siteTagMapper.deleteByPrimaryKey(siteTagId);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    public String updateSiteTag(SiteTag siteTag) throws BlogException {
        int row = siteTagMapper.updateByPrimaryKeySelective(siteTag);
        return CodeMessageUtil.updateMessage(row);
    }
}
