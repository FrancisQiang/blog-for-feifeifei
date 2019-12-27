package com.lgq.service.impl;

import com.lgq.dao.TagMapper;
import com.lgq.domain.Tag;
import com.lgq.exception.BlogException;
import com.lgq.service.TagService;
import com.lgq.util.CodeMessageUtil;
import com.lgq.vo.TagAddVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/24
 */
@Service
public class TagServiceImpl implements TagService {

    private final TagMapper tagMapper;

    @Autowired
    @SuppressWarnings("all")
    public TagServiceImpl(TagMapper tagMapper) {
        this.tagMapper = tagMapper;
    }

    @Override
    public String addTag(TagAddVO tagAddVO) throws BlogException {
        Tag tag = new Tag();
        BeanUtils.copyProperties(tagAddVO, tag);
        int row = tagMapper.insertSelective(tag);
        return CodeMessageUtil.addMessage(row);
    }

    @Override
    public List<Tag> getAll() {
        return tagMapper.selectByExample(null);
    }

    @Override
    public String deleteTagById(Integer tagId) throws BlogException {
        int row = tagMapper.deleteByPrimaryKey(tagId);
        return CodeMessageUtil.deleteMessage(row);
    }

    @Override
    public String updateTagById(Tag tag) throws BlogException {
        int row = tagMapper.updateByPrimaryKeySelective(tag);
        return CodeMessageUtil.updateMessage(row);
    }
}
