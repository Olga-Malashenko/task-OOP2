package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private boolean canPost;

    private int fromId;
    private int createdBy;

    private int replyOwnerId;
    private int postId;
    private boolean friendsOnly;

    private String postType;

    private PostSource postSource; // Не поняла, что это и для какого сайта
    private Geo geo;

    private int signerId;

    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;


    private Copyright copyright;

    private PostsInfo postsInfo;
    private PostsPreview postsPreview;
    private PostsStatistic postsStatistic;

    private CommentsBlock commentsBlock;

    private Donut donut;

    private int postponedId;

    // + get/set for each;

}

