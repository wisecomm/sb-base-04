package com.example.demo.service.base;

import com.example.demo.common.exception.GException;
import com.example.demo.mapper.BsUserMapper;
import com.example.demo.model.map.BsUserMap;
import com.example.demo.model.param.BsUserParam;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Slf4j
@Service
public class BsUserService {

    @Autowired
    private BsUserMapper bsUserMapper;

    // 사용자 정보 생성
    public int insertUser(BsUserParam bsUserParam) throws GException {
        return bsUserMapper.insertUser(bsUserParam);
    }

    public BsUserMap selectUser(String userId) {
        return bsUserMapper.selectUser(userId);
    }

    public int updateUser(BsUserParam bsUserParam) throws GException {
        return bsUserMapper.updateUser(bsUserParam);
    }

    public int deleteUser(String userId) throws GException {
        return bsUserMapper.deleteUser(userId);
    }

    public List<BsUserMap> selectUserList(String param_key, String param_value) {
        HashMap<String, Object> mapParam = new HashMap<>();
        mapParam.put("param_key", param_key); 
        mapParam.put("param_value", param_value);  

        return bsUserMapper.selectUserList(mapParam);
    }

}