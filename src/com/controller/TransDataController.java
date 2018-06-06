package com.controller;

import com.dao.ResourceMapper;
import com.dao.TaskInfoMapper;
import com.dao.UserMapper;
import com.pojo.TaskInfo;
import com.vo.ResourceVO;
import com.vo.TaskInfoVO;
import com.vo.UserVO;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/TransData/")
public class TransDataController {

    @Autowired
    private UserMapper user;
    @Autowired
    private TaskInfoMapper taskInfo;
    @Autowired
    private ResourceMapper resource;

    @RequestMapping(value="transResourceInfo",produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String transResourceData(){
        List<ResourceVO> resourceList = resource.getResourceList();
        if (resourceList != null && resourceList.size() > 0) {
            JSONObject json = new JSONObject();
            json.put("resourceList", resourceList);
            return json.toString();
        }
        return null;
    }

    @RequestMapping(value="transTaskInfo",produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String transTaskInfo(String startTime,String endTime){
        List<TaskInfoVO> taskInfoList = taskInfo.getTaskInfoList(startTime,endTime);
        for(TaskInfoVO taskInfo : taskInfoList){
            this.setTaskStatus(taskInfo);
        }
        if (taskInfoList != null && taskInfoList.size() > 0) {
            JSONObject json = new JSONObject();
            json.put("taskInfoList", taskInfoList);
            return json.toString();
        }
        return "{\"taskInfoList\": [{\"endTime\": \"2018/05/10 12:09:23\",\"expApplyNo\": \"47983783232\",\"expDepartment\": \"第四研究室\",\"expName\": \"低温工作试验\",\"expPlanStartDate\": \"2018-04-24 00:00:00.0\",\"issueNo\": \"TDM-Pro-2\",\"lot\": \"1\",\"planEndTime\": \"2018/05/01\",\"planStartTime\": \"2018/04/25\",\"productCode\": \"YYF-56\",\"productName\": \"TR\",\"productNo\": \"PN-56-3\",\"resourceName\": \"温箱\",\"resourceNo\": \"789798789\",\"resourceStatus\": \"可用\",\"resourceType\": \"设备类型\",\"startTime\": \"2018/05/03\",\"taskStatus\": \"未开始\"},{\"endTime\": \"2018/05/09 12:09:23\",\"expApplyNo\": \"778973498\",\"expDepartment\": \"第四研究室\",\"expName\": \"低温工作试验\",\"expPlanStartDate\": \"2018-04-25 00:00:00.0\",\"issueNo\": \"TDM-Pro-2\",\"lot\": \"1\",\"planEndTime\": \"2018/05/02\",\"planStartTime\": \"2018/04/27\",\"productCode\": \"YYF-45\",\"productName\": \"TRE\",\"productNo\": \"PN-56-2\",\"resourceName\": \"温箱\",\"resourceNo\": \"324232411\",\"resourceStatus\": \"不可用\",\"resourceType\": \"设备类型\",\"startTime\": \"2018/05/04\",\"taskStatus\": \"进行中\"}] }";
    }

    @RequestMapping(value="transUserInfo",produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String transUserInfo(){
        List<UserVO> userList = user.getUserList();
        if (userList != null && userList.size() > 0) {
            JSONObject json = new JSONObject();
            json.put("userList", userList);
            return json.toString();
        }
        return null;
    }


    private void setTaskStatus(TaskInfo info) {
        if (StringUtils.isNotBlank(info.getStartTime()) && StringUtils.isNotBlank(info.getEndTime())) {
            info.setTaskStatus("已完成");
        } else if (StringUtils.isNotBlank(info.getStartTime()) && StringUtils.isBlank(info.getEndTime())) {
            info.setTaskStatus("进行中");
        } else {
            info.setTaskStatus("未开始");
        }
    }
}
