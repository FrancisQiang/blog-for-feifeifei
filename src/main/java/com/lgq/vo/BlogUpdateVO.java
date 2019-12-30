package com.lgq.vo;

import com.lgq.domain.BlogWithBLOBs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author lgq
 * @date 2019/12/30
 */

public class BlogUpdateVO extends BlogWithBLOBs {
    private List<Integer> tags;

    @Override
    public String toString() {
        return "BlogUpdateVO{" +
                "tags=" + tags +
                '}';
    }

    public List<Integer> getTags() {
        return tags;
    }

    public void setTags(List<Integer> tags) {
        this.tags = tags;
    }
}
