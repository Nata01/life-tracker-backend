package com.lifetracker;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserLocationController {

    private final UserLocationService userLocationService;

    @PostMapping("users/current/locations")
    public UserLocationDto saveLocation(@RequestBody UserLocationDto userLocationDto) {
        return userLocationService.createUserLocation(userLocationDto);
    }



    @GetMapping("users/current/locations")
    public List<UserLocationDto> getLocations() {
        return Collections.singletonList(new UserLocationDto(1L, "asd", "sadas"));
    }
}
