package com.lifetracker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLocationService {

    private List<UserLocationDto> userLocations;
    private long nextId = 1;

    public UserLocationDto createUserLocation(UserLocationDto userLocationDto) {
        userLocationDto.setId(nextId++);
        return userLocationDto;
    }
}
