package com.yvette.instagramclone.Service;

import com.yvette.instagramclone.Entity.Status;
import com.yvette.instagramclone.Entity.Users;
import com.yvette.instagramclone.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {
    @Autowired
    StatusRepo statusRepo;
    @Autowired
    UserService userService;

    public Status submitMetaDataOfStatus(Status status){
        return statusRepo.save(status);
    }

    public ArrayList<Status> displayMetaDataOfStatus(){
        ArrayList<Status> statusList = statusRepo.findAll();
        for (int i=0; i<statusList.size();i++){
            Status statusItem = statusList.get(i);
            statusItem.setUserName(userService.displayMetaDataOfUser(statusItem.getUserId()).getUserName());
        }
        return statusList;
    }
}
