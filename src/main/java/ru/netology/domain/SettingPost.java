package ru.netology.domain;

// настройка поста, права пользователей
public class SettingPost {

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    // комментарии к записи
    private int commentCount; // количество комментариев
    private boolean canPost; // информация о том, может ли текущий пользователь комментировать запись
    private boolean groupsCanPost; // информация о том, могут ли сообщества комментировать запись
    private boolean canClose; // может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи

    // лайки к записи
    private int likesCount; //число пользователей, которым понравилась запись
    private boolean userLikes; //наличие отметки «Мне нравится» от текущего пользователя
    private boolean canPublish; // информация о том, может ли текущий пользователь сделать репост записи

    // действия с записью
    private boolean canPin; // информация о том, может ли текущий пользователь закрепить запись
    private boolean canDelete; // информация о том, может ли текущий пользователь удалить запись
    private boolean canEdit; // информация о том, может ли текущий пользователь редактировать запись
}
