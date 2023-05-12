package com.yvette.instagramclone.Service;

import com.yvette.instagramclone.Entity.Users;
import com.yvette.instagramclone.Repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//deal with data after getting data from repo, or get data from request and then save to repo,  do it as a bridge
@Service
public class UserService {

    //de
    @Autowired
    UserRepo userRepo;
    public Users submitMetaDataOfUser(Users user){
        return userRepo.save(user);
    }

    public Users displayMetaDataOfUser(String userid ){
        return userRepo.findUsersByUserId(userid);
    }
}
