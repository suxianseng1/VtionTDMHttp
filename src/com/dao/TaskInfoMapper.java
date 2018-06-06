package com.dao;

import com.vo.TaskInfoVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskInfoMapper {
    List<TaskInfoVO> getTaskInfoList(@Param("planStartTime") String startTime, @Param("planEndTime") String endTime);
}
