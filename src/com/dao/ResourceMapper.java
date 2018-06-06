package com.dao;

import com.vo.ResourceVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceMapper {

    List<ResourceVO> getResourceList();
}
