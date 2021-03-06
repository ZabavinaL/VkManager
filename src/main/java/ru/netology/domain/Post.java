package ru.netology.domain;

// Информация о посте
public class Post {
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
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

    public int getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(int repostsCount) {
        this.repostsCount = repostsCount;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    private int postId; // идентификатор записи
    private String postType; // тип записи со значениями (post, copy, reply, postpone, suggest)
    private String text; // текст записи
    private int fromId; // идентификатор автора записи
    private int date; // время публикации записи
    private int viewCount; // число просмотров записи
    private int replyOwnerId; // идентификатор владельца записи, в ответ на которую, была оставлена текущая
    private int signerId;// идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int replyPostId; // идентификатор записи, в ответ на которую, была оставлена текущая
    private boolean isPinned; // информация о том, что запись закреплена
    private boolean isFavorite; // запись добавлена в закладки у текущего пользователя
    private boolean canPin; // информация о том, может ли текущий пользователь закрепить запись
    private boolean canDelete; // информация о том, может ли текущий пользователь удалить запись
    private boolean canEdit; // информация о том, может ли текущий пользователь редактировать запись
    private int repostsCount; // число пользователей, скопировавших запись
    private boolean userReposted; // наличие репоста от текущего пользователя
    private GeoInfo geoInfo;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
}
