package com.example.demo.model.map.base;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
public class BsMenuMap {
    private String menuId;
    private String menuName;
    private String menuUrl;
    private String parentId;
    private Integer menuOrder;
    private String menuIcon;
    private String menuType;
    private String enabled;
    private Date createdAt;
    private Date updatedAt;
}
