package com.yvette.instagramclone.Controller;

import com.yvette.instagramclone.Entity.Status;
import com.yvette.instagramclone.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    StatusService statusService;

    @PostMapping("")
    private Status submitStatus(@RequestBody Status status){
        return statusService.submitMetaDataOfStatus(status);
    }

    @GetMapping("")
    private ArrayList<Status> getAllStatus(){
        return statusService.displayMetaDataOfStatus();
    }

}
