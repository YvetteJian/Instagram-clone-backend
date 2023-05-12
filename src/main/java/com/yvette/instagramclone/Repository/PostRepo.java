package com.yvette.instagramclone.Repository;

import com.yvette.instagramclone.Entity.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PostRepo extends CrudRepository<Post,Integer> {
    Post save(Post post);
    ArrayList<Post> findAll();

}
