package com.boot.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class Message implements Serializable{
    private Integer id;
    private String content;
    private Integer fromUserId;
    private List<Integer> toUserIds;
    private Integer pushType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public List<Integer> getToUserIds() {
        return toUserIds;
    }

    public void setToUserIds(List<Integer> toUserIds) {
        this.toUserIds = toUserIds;
    }

    public Integer getPushType() {
        return pushType;
    }

    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }
}
