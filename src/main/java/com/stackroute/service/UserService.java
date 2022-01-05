package com.stackroute.service;

import com.stackroute.dto.UserLocationDto;
import com.stackroute.model.Location;
import com.stackroute.model.User;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDto> getAllUserLocation() {
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());

    }
    private UserLocationDto convertEntityToDto(User user){
        UserLocationDto userLocationDto = new UserLocationDto();
        userLocationDto.setUserId(user.getId());
        userLocationDto.setEmail(user.getEmail());
        userLocationDto.setPlace(user.getLocation().getPlace());
        userLocationDto.setLatitude(user.getLocation().getLatitude());
        userLocationDto.setLongitude(user.getLocation().getLongitude());
        return userLocationDto;

    }
}
