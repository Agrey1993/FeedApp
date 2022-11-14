package com.bptn.repository;

import com.bptn.models.Post;

public interface FeedPostRepository extends FeedRepository {
    //@SuppressWarnings("unchecked")
	Post save(Post feed);
}
