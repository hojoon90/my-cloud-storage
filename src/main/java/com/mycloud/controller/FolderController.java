package com.mycloud.controller;

import com.mycloud.domain.Folder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FolderController {

    @PostMapping("")
    public void createFolder(String userId, Folder folder){

    }

    @DeleteMapping("")
    public void deleteFolder(String userId, Folder folder){

    }

    @GetMapping
    public void getFolderList(){

    }

}
