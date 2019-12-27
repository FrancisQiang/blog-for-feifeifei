package com.lgq.dto;

import com.lgq.domain.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author lgq
 * @date 2019/12/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogGetDTO {
    private Integer blogId;

    private Date blogCreateTime;

    private Date blogUpdateTime;

    private String blogTitle;

    private Integer blogViews;

    private String blogCover;

    private Integer blogReply;

    private Boolean blogRecommend;

    private Integer blogCategoryId;

    private String blogCategoryName;

    private String blogSummary;

    private List<Tag> blogTags;
}
