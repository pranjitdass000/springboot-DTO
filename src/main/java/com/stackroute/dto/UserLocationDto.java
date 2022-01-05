package com.stackroute.dto;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class UserLocationDto {
    private Long userId;
    private String email;
    private Double latitude;
    private Double longitude;
    private String place;


}
