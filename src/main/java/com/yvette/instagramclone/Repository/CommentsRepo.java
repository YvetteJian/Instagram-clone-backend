package com.yvette.instagramclone.Repository;

import com.yvette.instagramclone.Entity.Comments;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CommentsRepo extends CrudRepository<Comments,Integer> {
    Comments save(Comments comments);
    ArrayList<Comments> findAllByPostId(String postId);
}
