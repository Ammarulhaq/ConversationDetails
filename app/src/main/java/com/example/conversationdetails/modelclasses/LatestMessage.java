
package com.example.conversationdetails.modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LatestMessage {

    @SerializedName("conversation_message_id")
    @Expose
    private Integer conversationMessageId;
    @SerializedName("conversation_id")
    @Expose
    private Integer conversationId;
    @SerializedName("resource_id")
    @Expose
    private Integer resourceId;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("sent_datetime")
    @Expose
    private String sentDatetime;
    @SerializedName("message_type")
    @Expose
    private Integer messageType;
    @SerializedName("is_deleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("reply_id")
    @Expose
    private Object replyId;
    @SerializedName("filename")
    @Expose
    private Object filename;
    @SerializedName("directory_name")
    @Expose
    private Object directoryName;
    @SerializedName("message_attachment_id")
    @Expose
    private Object messageAttachmentId;
    @SerializedName("message_id")
    @Expose
    private Integer messageId;
    @SerializedName("resource_image")
    @Expose
    private String resourceImage;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("read_by_all")
    @Expose
    private Boolean readByAll;
    @SerializedName("messageattachment_id")
    @Expose
    private Integer messageattachmentId;

    public Integer getConversationMessageId() {
        return conversationMessageId;
    }

    public void setConversationMessageId(Integer conversationMessageId) {
        this.conversationMessageId = conversationMessageId;
    }

    public Integer getConversationId() {
        return conversationId;
    }

    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentDatetime() {
        return sentDatetime;
    }

    public void setSentDatetime(String sentDatetime) {
        this.sentDatetime = sentDatetime;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Object getReplyId() {
        return replyId;
    }

    public void setReplyId(Object replyId) {
        this.replyId = replyId;
    }

    public Object getFilename() {
        return filename;
    }

    public void setFilename(Object filename) {
        this.filename = filename;
    }

    public Object getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(Object directoryName) {
        this.directoryName = directoryName;
    }

    public Object getMessageAttachmentId() {
        return messageAttachmentId;
    }

    public void setMessageAttachmentId(Object messageAttachmentId) {
        this.messageAttachmentId = messageAttachmentId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getResourceImage() {
        return resourceImage;
    }

    public void setResourceImage(String resourceImage) {
        this.resourceImage = resourceImage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean getReadByAll() {
        return readByAll;
    }

    public void setReadByAll(Boolean readByAll) {
        this.readByAll = readByAll;
    }

    public Integer getMessageattachmentId() {
        return messageattachmentId;
    }

    public void setMessageattachmentId(Integer messageattachmentId) {
        this.messageattachmentId = messageattachmentId;
    }

}
