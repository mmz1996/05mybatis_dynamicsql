package com.mmz.pojo;

import java.util.List;

/**
 * @Classname QueryVo
 * @Description TODO
 * @Date 2020/5/6 14:02
 * @Created by mmz
 */
public class QueryVo {
    private User user;

    private List<Integer> ids;

    private User getUser(){
        return user;
    }

    private void setUser(User user){
        this.user = user;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
