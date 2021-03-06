package com.lgq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lgq
 * @date 2019/12/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogPreGetDTO {
    private Integer blogId;

    private Date blogCreateTime;

    private Date blogUpdateTime;

    private String blogTitle;

    private Integer blogViews;

    private Integer blogReply;

    private String blogCover;

    private Boolean blogRecommend;

    private Integer blogCategoryId;

    private String blogCategoryName;

    private String blogSummary;

}
