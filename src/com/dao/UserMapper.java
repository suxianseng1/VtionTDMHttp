package com.dao;

import com.vo.UserVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<UserVO> getUserList();

}
