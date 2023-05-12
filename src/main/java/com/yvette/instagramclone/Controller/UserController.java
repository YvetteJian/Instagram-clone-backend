package com.yvette.instagramclone.Controller;

import com.yvette.instagramclone.Entity.Users;
import com.yvette.instagramclone.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//restcontoller return a response(json or xml format), controller returns a view
@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping("")
    private Users submitUser(@RequestBody Users users){
        return userService.submitMetaDataOfUser(users);

    }

    @GetMapping("/{userId}")
    private Users getUserDetails(@PathVariable String userId){
        return userService.displayMetaDataOfUser(userId);
    }
}
