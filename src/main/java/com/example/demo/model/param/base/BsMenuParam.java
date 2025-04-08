package com.example.demo.model.param.base;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class BsMenuParam {
    @NotEmpty(message = "메뉴 ID는 필수입니다")
    private String menuId;
    
    private String menuName;
    private String menuPath;
    private String parentMenuId;
    private Integer menuOrder;
    private String menuIcon;
    private String useYn;
    private String regId;
    private String updId;
}
