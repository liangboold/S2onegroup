package com.example.s2onegroup.bean;

import java.util.List;

/*
 * @ClassName VideoBean
 * @Description TODO
 * @Author 康泽林
 * @Date 2021/10/28 13:15
 * @Version 1.0
 */
public class VideoBean {
        /**
         * author : {"avatar":"http://qzapp.qlogo.cn/qzapp/101794421/9BEC60B4F3BCF4BE7FD63A43CFD3370F/100","commentCount":1,"expires_time":1641267584305,"favoriteCount":0,"feedCount":0,"followCount":0,"followerCount":1,"hasFollow":false,"historyCount":4,"id":3304,"likeCount":3,"name":"S.H.I.E.L.D","qqOpenId":"9BEC60B4F3BCF4BE7FD63A43CFD3370F","score":0,"topCommentCount":0,"userId":1633491584}
         * authorId : 1633491584
         * cover : https://pipijoke.oss-cn-hangzhou.aliyuncs.com/1633491611367.jpeg
         * createTime : 1633491613542
         * duration : 0
         * feeds_text : 嘻嘻
         * height : 1280
         * id : 1578922791
         * itemId : 1633491613542
         * itemType : 2
         * ugc : {"commentCount":1,"hasDissed":false,"hasFavorite":false,"hasLiked":false,"hasdiss":false,"likeCount":2,"shareCount":2}
         * url : https://pipijoke.oss-cn-hangzhou.aliyuncs.com/1633491605304.mp4
         * width : 720
         */

        private List<VideoOneBean> data;

        public List<VideoOneBean> getData() {
            return data;
        }

        public void setData(List<VideoOneBean> data) {
            this.data = data;
        }

        public static class VideoOneBean {
            /**
             * avatar : http://qzapp.qlogo.cn/qzapp/101794421/9BEC60B4F3BCF4BE7FD63A43CFD3370F/100
             * commentCount : 1
             * expires_time : 1641267584305
             * favoriteCount : 0
             * feedCount : 0
             * followCount : 0
             * followerCount : 1
             * hasFollow : false
             * historyCount : 4
             * id : 3304
             * likeCount : 3
             * name : S.H.I.E.L.D
             * qqOpenId : 9BEC60B4F3BCF4BE7FD63A43CFD3370F
             * score : 0
             * topCommentCount : 0
             * userId : 1633491584
             */

            private AuthorBean author;
            private int authorId;
            private String cover;
            private long createTime;
            private int duration;
            private String feeds_text;
            private int height;
            private int id;
            private long itemId;
            private int itemType;
            /**
             * commentCount : 1
             * hasDissed : false
             * hasFavorite : false
             * hasLiked : false
             * hasdiss : false
             * likeCount : 2
             * shareCount : 2
             */

            private UgcBean ugc;
            private String url;
            private int width;

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public int getAuthorId() {
                return authorId;
            }

            public void setAuthorId(int authorId) {
                this.authorId = authorId;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
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

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

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

            public UgcBean getUgc() {
                return ugc;
            }

            public void setUgc(UgcBean ugc) {
                this.ugc = ugc;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public static class AuthorBean {
                private String avatar;
                private int commentCount;
                private long expires_time;
                private int favoriteCount;
                private int feedCount;
                private int followCount;
                private int followerCount;
                private boolean hasFollow;
                private int historyCount;
                private int id;
                private int likeCount;
                private String name;
                private String qqOpenId;
                private int score;
                private int topCommentCount;
                private int userId;

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public int getCommentCount() {
                    return commentCount;
                }

                public void setCommentCount(int commentCount) {
                    this.commentCount = commentCount;
                }

                public long getExpires_time() {
                    return expires_time;
                }

                public void setExpires_time(long expires_time) {
                    this.expires_time = expires_time;
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

                public boolean isHasFollow() {
                    return hasFollow;
                }

                public void setHasFollow(boolean hasFollow) {
                    this.hasFollow = hasFollow;
                }

                public int getHistoryCount() {
                    return historyCount;
                }

                public void setHistoryCount(int historyCount) {
                    this.historyCount = historyCount;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getLikeCount() {
                    return likeCount;
                }

                public void setLikeCount(int likeCount) {
                    this.likeCount = likeCount;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getQqOpenId() {
                    return qqOpenId;
                }

                public void setQqOpenId(String qqOpenId) {
                    this.qqOpenId = qqOpenId;
                }

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }

                public int getTopCommentCount() {
                    return topCommentCount;
                }

                public void setTopCommentCount(int topCommentCount) {
                    this.topCommentCount = topCommentCount;
                }

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }
            }

            public static class UgcBean {
                private int commentCount;
                private boolean hasDissed;
                private boolean hasFavorite;
                private boolean hasLiked;
                private boolean hasdiss;
                private int likeCount;
                private int shareCount;

                public int getCommentCount() {
                    return commentCount;
                }

                public void setCommentCount(int commentCount) {
                    this.commentCount = commentCount;
                }

                public boolean isHasDissed() {
                    return hasDissed;
                }

                public void setHasDissed(boolean hasDissed) {
                    this.hasDissed = hasDissed;
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
            }
        }
}
