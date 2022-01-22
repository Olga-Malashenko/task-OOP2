package ru.netology.domain;

import javax.xml.crypto.Data;

public class CommentsBlock {
    private boolean canComment;
    private String outputSettings;

    private class PublishedComment {
        private String commentatorsAvatar;
        private String commentatorsName;
        private boolean deleteButton;
        private String text;
        private Data data;
        private boolean answerButton;
        private boolean commentsShareButton;
        private boolean commentsLikesIcon;
        private int commentsLikesCounter;
        // + get/set for each;
    }

    private class NewComment {
        private String ownersAvatar;
        private boolean fieldForNewComment;
        private boolean attachIcon;
        private boolean photoIcon;
        private boolean emojiIcon;
        // + get/set for each;
    }

    // + get/set for each;
}
