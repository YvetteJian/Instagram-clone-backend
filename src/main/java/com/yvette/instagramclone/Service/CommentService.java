package com.yvette.instagramclone.Service;

import com.yvette.instagramclone.Entity.Comments;
import com.yvette.instagramclone.Entity.Post;
import com.yvette.instagramclone.Repository.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentService {

    @Autowired
    CommentsRepo commentsRepo;
    @Autowired
    UserService userService;

    public Comments submitCommentToDB(Comments comments){
        return commentsRepo.save(comments);
    }

    public ArrayList<Comments> getAllCommentsForPost(String postId){
        ArrayList<Comments> commentList = commentsRepo.findAllByPostId(postId);

        for (int i=0; i<commentList.size();i++){
            Comments commentItem = commentList.get(i);
            commentItem.setUserName(userService.displayMetaDataOfUser(commentItem.getUserId()).getUserName());
        }
        return commentList;
    }
}
