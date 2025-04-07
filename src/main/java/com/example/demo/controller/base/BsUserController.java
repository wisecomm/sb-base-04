package com.example.demo.controller.base;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.exception.GException;
import com.example.demo.common.model.GResponse;
import com.example.demo.model.map.MapBsAdminLogin;
import com.example.demo.model.param.BsUserParam;
import com.example.demo.service.base.BsLoginService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1/base/auth")
@RestController
@RequiredArgsConstructor
public class BsUserController {

    //..
    private final BsLoginService bsLoginService;

    @Operation(summary = "사용자 정보 생성")
    @PostMapping("/user")
    public ResponseEntity<GResponse> create(HttpServletResponse response
                                            , @Valid @RequestBody BsUserParam pBsUser) throws GException {

        return ResponseEntity.ok().body(new GResponse("0000", "생성"));
    }

    @Operation(summary = "사용자 정보 조회")
    @GetMapping("/user/{userId}")
    public ResponseEntity<GResponse> retrieveUsers(HttpServletResponse response
                                            , @PathVariable String userId) throws GException {
        return ResponseEntity.ok().body(new GResponse("0000", "조회"));
    }

    @Operation(summary = "사용자 정보 수정")
    @PutMapping("/user/{userId}")
    public ResponseEntity<GResponse> update(HttpServletResponse response
                                            , @PathVariable String userId
                                            , @Valid @RequestBody BsUserParam pUser) throws GException {
        return ResponseEntity.ok().body(new GResponse("0000", "수정"));
    }

    @Operation(summary = "사용자 정보 삭제")
    @DeleteMapping("/user/{userId}")
    public ResponseEntity<GResponse> delete(HttpServletResponse response
                                            , @PathVariable String userId) throws GException {
        return ResponseEntity.ok().body(new GResponse("0000", "삭제"));
    }

}
