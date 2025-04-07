package com.example.demo.service.base;

import com.example.demo.common.exception.GException;
import com.example.demo.mapper.BsUserMapper;
import com.example.demo.model.map.BsUserMap;
import com.example.demo.model.param.BsUserParam;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class BsUserService {

    @Autowired
    private BsUserMapper bsUserMapper;

    // 사용자 정보 생성
    public int insertUser(BsUserParam bsUserParam) throws GException {
        return bsUserMapper.insertUser(bsUserParam);
    }

    public Optional<BsUserMap> selectUser(String userId) {
        return bsUserMapper.selectUser(userId);
    }
    public List<BsUserMap> selectUserList(BsUserParam bsUserParam) {
        return bsUserMapper.selectUserList(bsUserParam);
    }

}