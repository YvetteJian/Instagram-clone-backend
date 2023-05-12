package com.yvette.instagramclone.Controller;

import com.yvette.instagramclone.Entity.Comments;
import com.yvette.instagramclone.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentService commentService;
    @PostMapping("")
    private Comments submitComment(@RequestBody Comments comments){
        return commentService.submitCommentToDB(comments);
    }

    @GetMapping("/{postId}")
    private ArrayList<Comments> getCommentsForPost(@PathVariable String postId){
        return commentService.getAllCommentsForPost(postId);
    }
}
