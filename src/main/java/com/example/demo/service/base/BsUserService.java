package com.example.demo.service.base;

import com.example.demo.mapper.BsUserMapper;
import com.example.demo.model.map.BsUserMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BsUserService {

    @Autowired
    private BsUserMapper bsUserMapper;

    public Optional<BsUserMap> selectUser(String userId) {
        return bsUserMapper.selectUser(userId);
    }

}