package ru.netology.domain;

public class LikesInfo {
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

    private int likesCount; //число пользователей, которым понравилась запись
    private boolean userLikes; //наличие отметки «Мне нравится» от текущего пользователя
    private boolean canPublish; // информация о том, может ли текущий пользователь сделать репост записи
}
