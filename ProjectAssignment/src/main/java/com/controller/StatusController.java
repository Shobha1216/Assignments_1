package com.controller;

import com.models.StatusClass;
import com.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StatusController {

    @Autowired
    @Qualifier("database3")
    private StatusService statusService;

 public StatusController(){

 }

    @GetMapping("/getWithStatus")
    public List<StatusClass> getWithStatus(){
        return statusService.getWithStatus();
    }
    @GetMapping("/getForParticularIntern")
    public List<StatusClass> getForParticularIntern(){
        return statusService.getForParticularIntern();
    }
}
