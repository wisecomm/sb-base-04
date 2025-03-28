package com.example.demo.model.map;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import java.util.Date;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserMap {

    private String userId;
    private String userName;
    private String password;
    private String email;
    private String phone;
    private boolean enabled;
    private Date lastLoginAt;
    private Date createdAt;
    private Date updatedAt;

}