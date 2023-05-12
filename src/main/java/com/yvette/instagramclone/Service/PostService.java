package com.yvette.instagramclone.Service;

import com.yvette.instagramclone.Entity.Post;
import com.yvette.instagramclone.Entity.Status;
import com.yvette.instagramclone.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Service
public class PostService {
    @Autowired
    PostRepo postRepo;
    @Autowired
    UserService userService;
    public Post submitPostData(Post post){
        return postRepo.save(post);
    }

    public ArrayList<Post> retrievePostFromDB(){
        ArrayList<Post> postList = postRepo.findAll();

        for (int i=0; i<postList.size();i++){
            Post postItem = postList.get(i);
            postItem.setUserName(userService.displayMetaDataOfUser(postItem.getUserId()).getUserName());
        }
        Collections.sort(postList,(a,b)->b.getId()-a.getId());
        return postList;
    }
}
