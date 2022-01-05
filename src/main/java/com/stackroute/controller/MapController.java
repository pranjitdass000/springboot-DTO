package com.stackroute.controller;

import com.stackroute.dto.UserLocationDto;
import com.stackroute.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MapController {

    @Autowired
    private UserService userService;

    @GetMapping("map")
    public List<UserLocationDto> getAllUsersLocation(){
        return userService.getAllUserLocation();
    }
}
