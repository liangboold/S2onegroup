package com.example.s2onegroup.bean;

import java.util.List;

/*
 * @ClassName TextBean
 * @Description TODO
 * @Author 康泽林
 * @Date 2021/10/28 9:28
 * @Version 1.0
 */
public class TextBean {
        /**
         * id : 1578922800
         * itemId : 1635299691752
         * itemType : 1
         * createTime : 1635299691752
         * duration : 0
         * feeds_text : 1111111
         * authorId : 1633677715
         * activityIcon : null
         * activityText : null
         * width : 0
         * height : 0
         * url : null
         * cover : null
         * author : {"id":3315,"userId":1633677715,"name":"shmily","avatar":"http://qzapp.qlogo.cn/qzapp/101794421/DA3AF6A632A340CD6BA6A01E2AB4565E/100","description":null,"likeCount":3,"topCommentCount":0,"followCount":0,"followerCount":0,"qqOpenId":"DA3AF6A632A340CD6BA6A01E2AB4565E","expires_time":1641453714780,"score":0,"historyCount":47,"commentCount":1,"favoriteCount":0,"feedCount":0,"hasFollow":false}
         * topComment : null
         * ugc : {"likeCount":1,"shareCount":0,"commentCount":6,"hasFavorite":false,"hasLiked":false,"hasdiss":false,"hasDissed":false}
         */

        private List<TextOneBean> data;

        public List<TextOneBean> getData() {
            return data;
        }

        public void setData(List<TextOneBean> data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "data=" + data +
                    '}';
        }

        public static class TextOneBean {
            private int id;
            private long itemId;
            private int itemType;
            private long createTime;
            private int duration;
            private String feeds_text;
            private int authorId;
            private Object activityIcon;
            private Object activityText;
            private int width;
            private int height;
            private Object url;
            private Object cover;
            /**
             * id : 3315
             * userId : 1633677715
             * name : shmily
             * avatar : http://qzapp.qlogo.cn/qzapp/101794421/DA3AF6A632A340CD6BA6A01E2AB4565E/100
             * description : null
             * likeCount : 3
             * topCommentCount : 0
             * followCount : 0
             * followerCount : 0
             * qqOpenId : DA3AF6A632A340CD6BA6A01E2AB4565E
             * expires_time : 1641453714780
             * score : 0
             * historyCount : 47
             * commentCount : 1
             * favoriteCount : 0
             * feedCount : 0
             * hasFollow : false
             */

            private AuthorBean author;
            private Object topComment;
            /**
             * likeCount : 1
             * shareCount : 0
             * commentCount : 6
             * hasFavorite : false
             * hasLiked : false
             * hasdiss : false
             * hasDissed : false
             */

            private UgcBean ugc;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public long getItemId() {
                return itemId;
            }

            public void setItemId(long itemId) {
                this.itemId = itemId;
            }

            public int getItemType() {
                return itemType;
            }

            public void setItemType(int itemType) {
                this.itemType = itemType;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public String getFeeds_text() {
                return feeds_text;
            }

            public void setFeeds_text(String feeds_text) {
                this.feeds_text = feeds_text;
            }

            public int getAuthorId() {
                return authorId;
            }

            public void setAuthorId(int authorId) {
                this.authorId = authorId;
            }

            public Object getActivityIcon() {
                return activityIcon;
            }

            public void setActivityIcon(Object activityIcon) {
                this.activityIcon = activityIcon;
            }

            public Object getActivityText() {
                return activityText;
            }

            public void setActivityText(Object activityText) {
                this.activityText = activityText;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public Object getUrl() {
                return url;
            }

            public void setUrl(Object url) {
                this.url = url;
            }

            public Object getCover() {
                return cover;
            }

            public void setCover(Object cover) {
                this.cover = cover;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public Object getTopComment() {
                return topComment;
            }

            public void setTopComment(Object topComment) {
                this.topComment = topComment;
            }

            public UgcBean getUgc() {
                return ugc;
            }

            public void setUgc(UgcBean ugc) {
                this.ugc = ugc;
            }

            @Override
            public String toString() {
                return "TextOneBean{" +
                        "id=" + id +
                        ", itemId=" + itemId +
                        ", itemType=" + itemType +
                        ", createTime=" + createTime +
                        ", duration=" + duration +
                        ", feeds_text='" + feeds_text + '\'' +
                        ", authorId=" + authorId +
                        ", activityIcon=" + activityIcon +
                        ", activityText=" + activityText +
                        ", width=" + width +
                        ", height=" + height +
                        ", url=" + url +
                        ", cover=" + cover +
                        ", author=" + author +
                        ", topComment=" + topComment +
                        ", ugc=" + ugc +
                        '}';
            }

            public static class AuthorBean {
                private int id;
                private int userId;
                private String name;
                private String avatar;
                private Object description;
                private int likeCount;
                private int topCommentCount;
                private int followCount;
                private int followerCount;
                private String qqOpenId;
                private long expires_time;
                private int score;
                private int historyCount;
                private int commentCount;
                private int favoriteCount;
                private int feedCount;
                private boolean hasFollow;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public Object getDescription() {
                    return description;
                }

                public void setDescription(Object description) {
                    this.description = description;
                }

                public int getLikeCount() {
                    return likeCount;
                }

                public void setLikeCount(int likeCount) {
                    this.likeCount = likeCount;
                }

                public int getTopCommentCount() {
                    return topCommentCount;
                }

                public void setTopCommentCount(int topCommentCount) {
                    this.topCommentCount = topCommentCount;
                }

                public int getFollowCount() {
                    return followCount;
                }

                public void setFollowCount(int followCount) {
                    this.followCount = followCount;
                }

                public int getFollowerCount() {
                    return followerCount;
                }

                public void setFollowerCount(int followerCount) {
                    this.followerCount = followerCount;
                }

                public String getQqOpenId() {
                    return qqOpenId;
                }

                public void setQqOpenId(String qqOpenId) {
                    this.qqOpenId = qqOpenId;
                }

                public long getExpires_time() {
                    return expires_time;
                }

                public void setExpires_time(long expires_time) {
                    this.expires_time = expires_time;
                }

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }

                public int getHistoryCount() {
                    return historyCount;
                }

                public void setHistoryCount(int historyCount) {
                    this.historyCount = historyCount;
                }

                public int getCommentCount() {
                    return commentCount;
                }

                public void setCommentCount(int commentCount) {
                    this.commentCount = commentCount;
                }

                public int getFavoriteCount() {
                    return favoriteCount;
                }

                public void setFavoriteCount(int favoriteCount) {
                    this.favoriteCount = favoriteCount;
                }

                public int getFeedCount() {
                    return feedCount;
                }

                public void setFeedCount(int feedCount) {
                    this.feedCount = feedCount;
                }

                public boolean isHasFollow() {
                    return hasFollow;
                }

                public void setHasFollow(boolean hasFollow) {
                    this.hasFollow = hasFollow;
                }
            }

            public static class UgcBean {
                private int likeCount;
                private int shareCount;
                private int commentCount;
                private boolean hasFavorite;
                private boolean hasLiked;
                private boolean hasdiss;
                private boolean hasDissed;

                public int getLikeCount() {
                    return likeCount;
                }

                public void setLikeCount(int likeCount) {
                    this.likeCount = likeCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public int getCommentCount() {
                    return commentCount;
                }

                public void setCommentCount(int commentCount) {
                    this.commentCount = commentCount;
                }

                public boolean isHasFavorite() {
                    return hasFavorite;
                }

                public void setHasFavorite(boolean hasFavorite) {
                    this.hasFavorite = hasFavorite;
                }

                public boolean isHasLiked() {
                    return hasLiked;
                }

                public void setHasLiked(boolean hasLiked) {
                    this.hasLiked = hasLiked;
                }

                public boolean isHasdiss() {
                    return hasdiss;
                }

                public void setHasdiss(boolean hasdiss) {
                    this.hasdiss = hasdiss;
                }

                public boolean isHasDissed() {
                    return hasDissed;
                }

                public void setHasDissed(boolean hasDissed) {
                    this.hasDissed = hasDissed;
                }

                @Override
                public String toString() {
                    return "UgcBean{" +
                            "likeCount=" + likeCount +
                            ", shareCount=" + shareCount +
                            ", commentCount=" + commentCount +
                            ", hasFavorite=" + hasFavorite +
                            ", hasLiked=" + hasLiked +
                            ", hasdiss=" + hasdiss +
                            ", hasDissed=" + hasDissed +
                            '}';
                }
            }
        }
}
