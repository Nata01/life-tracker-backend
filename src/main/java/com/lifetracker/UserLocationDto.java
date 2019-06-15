package com.lifetracker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLocationDto {

    private Long id;
    private String latitude;
    private String longitude;
}
