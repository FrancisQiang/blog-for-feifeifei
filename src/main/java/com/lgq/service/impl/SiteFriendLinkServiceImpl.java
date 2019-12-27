package com.lgq.service.impl;

import com.lgq.dao.SiteFriendLinkMapper;
import com.lgq.domain.SiteFriendLink;
import com.lgq.exception.BlogException;
import com.lgq.service.SiteFriendLinkService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.SiteFriendLinkAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class SiteFriendLinkServiceImpl implements SiteFriendLinkService {

    private final SiteFriendLinkMapper siteFriendLinkMapper;

    @Autowired
    @SuppressWarnings("all")
    public SiteFriendLinkServiceImpl(SiteFriendLinkMapper siteFriendLinkMapper) {
        this.siteFriendLinkMapper = siteFriendLinkMapper;
    }

    @Override
    public String addSiteFriendLink(SiteFriendLinkAddVO siteFriendLinkAddVO) throws BlogException {
        SiteFriendLink siteFriendLink = new SiteFriendLink();
        BeanUtils.copyProperties(siteFriendLinkAddVO, siteFriendLink);
        int row  = siteFriendLinkMapper.insertSelective(siteFriendLink);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public String deleteSiteFriendLinkById(Integer siteFriendLinkId) throws BlogException{
        int row = siteFriendLinkMapper.deleteByPrimaryKey(siteFriendLinkId);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    public List<SiteFriendLink> getAll() {
        return siteFriendLinkMapper.selectByExample(null);
    }

    @Override
    public String updateSiteFriendLinkById(SiteFriendLink siteFriendLink) throws BlogException {
        int row  = siteFriendLinkMapper.updateByPrimaryKeySelective(siteFriendLink);
        return CodeMessageUtil.updateMessage(row);
    }
}
