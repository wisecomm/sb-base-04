package com.example.demo.mapper;


import com.example.demo.model.map.BsUserMap;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 사용자 관련 SQL Mapper 인터페이스 입니다.
 *
 * @author : danyoh
 * @fileName : BsUserMapper
 * @since : 10/1/24
 */
@Repository
public interface BsUserMapper {

    Optional<BsUserMap> selectUser(String userId);
    List<BsUserMap> selectUserList(BsUserMap userDto);

    Optional<BsUserMap> selectUserRole(String userId);

}
