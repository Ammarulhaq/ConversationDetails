
package com.example.conversationdetails.modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConversationsItem {

    @SerializedName("conversation_id")
    @Expose
    private Integer conversationId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("conversation_icon")
    @Expose
    private Object conversationIcon;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @SerializedName("totalmessages")
    @Expose
    private Integer totalmessages;
    @SerializedName("unreadmessages")
    @Expose
    private Integer unreadmessages;
    @SerializedName("latest_message")
    @Expose
    private LatestMessage latestMessage;
    @SerializedName("latest_date")
    @Expose
    private String latestDate;
    @SerializedName("is_fvrt")
    @Expose
    private Boolean isFvrt;

    public Integer getConversationId() {
        return conversationId;
    }

    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getConversationIcon() {
        return conversationIcon;
    }

    public void setConversationIcon(Object conversationIcon) {
        this.conversationIcon = conversationIcon;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getTotalmessages() {
        return totalmessages;
    }

    public void setTotalmessages(Integer totalmessages) {
        this.totalmessages = totalmessages;
    }

    public Integer getUnreadmessages() {
        return unreadmessages;
    }

    public void setUnreadmessages(Integer unreadmessages) {
        this.unreadmessages = unreadmessages;
    }

    public LatestMessage getLatestMessage() {
        return latestMessage;
    }

    public void setLatestMessage(LatestMessage latestMessage) {
        this.latestMessage = latestMessage;
    }

    public String getLatestDate() {
        return latestDate;
    }

    public void setLatestDate(String latestDate) {
        this.latestDate = latestDate;
    }

    public Boolean getIsFvrt() {
        return isFvrt;
    }


    public void setIsFvrt(Boolean isFvrt) {
        this.isFvrt = isFvrt;
    }

}
