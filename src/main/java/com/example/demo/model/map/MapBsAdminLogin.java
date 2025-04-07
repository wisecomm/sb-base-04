package com.example.demo.model.map;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MapBsAdminLogin {
    private String accessToken;
    private String refreshToken;

    private BsUserMap bsUserMap;
}
