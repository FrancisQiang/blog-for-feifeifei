package com.lgq.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author lgq
 * @date 2019/12/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogCommentAddVO {

    private String blogCommentUsername;

    private Integer blogCommentBlogId;

    private Integer blogCommentParentId;

    private String blogCommentContent;

}
