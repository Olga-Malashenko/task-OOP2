package ru.netology.domain;

public class PostsStatistic {
    private class LikesInfo {
        private boolean likesIcon; // canLike
        private int likesCounter;
        private boolean userLikes;

        // + get/set for each;
    }
    private class CommentsInfo {
        private boolean commentsIcon;
        private int commentsCounter;
        // + get/set for each;
    }
    private class SharesInfo {
        private boolean sharesIcon; // can в ТЗ
        private int sharesCounter;
        private boolean userReposted;
        // + get/set for each;
    }
    private class ViewsInfo {
//      private boolean viewsIcon; увлеклась, скопировала и не подумала,
//        а это просто значок без смысловой нагрузки
        private int viewsCounter;
        // + get/set for each;
    }
}
