package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;

    public  Post[] getPostForFeed() {
        // some logic;
        return null;
    }

    public Post[] search(int ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
        // some logic;
        return  null;
    }

    public  void  delete(int ownerId, int id) {
        // some logic;
    }
}
