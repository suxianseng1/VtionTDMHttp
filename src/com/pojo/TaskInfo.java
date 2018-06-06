package com.pojo;

/**
 * 任务信息
 */
public class TaskInfo {
    /**
     * 试验申请单号
     */
    private String expApplyNo;
    /**
     * 课题号
     */
    private String issueNo;
    /**
     * 产品代号
     */
    private String productCode;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 产品批次
     */
    private String lot;
    /**
     * 产品编号
     */
    private String productNo;
    /**
     * 试验名称
     */
    private String expName;
    /**
     * 试验状态
     */
    private String taskStatus;
    /**
     * 试验申请科室
     */
    private String expDepartment;
    /**
     * 设备型号
     */
    private String resourceType;
    /**
     * 设备名称
     */
    private String resourceName;
    /**
     * 设备编号
     */
    private String resourceNo;
    /**
     * 设备当前状态（可用 || 不可用）
     */
    private String resourceStatus;
    /**
     * 计划试验日期
     */
    private String expPlanStartDate;
    /**
     * 试验开始时间
     */
    private String planStartTime;
    /**
     * 试验结束时间
     */
    private String planEndTime;
    /**
     * 实际开始时间
     */
    private String startTime;
    /**
     * 实际结束时间
     */
    private String endTime;

    public String getExpApplyNo() {
        return expApplyNo;
    }

    public void setExpApplyNo(String expApplyNo) {
        this.expApplyNo = expApplyNo;
    }

    public String getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getExpDepartment() {
        return expDepartment;
    }

    public void setExpDepartment(String expDepartment) {
        this.expDepartment = expDepartment;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceNo() {
        return resourceNo;
    }

    public void setResourceNo(String resourceNo) {
        this.resourceNo = resourceNo;
    }

    public String getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    public String getExpPlanStartDate() {
        return expPlanStartDate;
    }

    public void setExpPlanStartDate(String expPlanStartDate) {
        this.expPlanStartDate = expPlanStartDate;
    }

    public String getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(String planStartTime) {
        this.planStartTime = planStartTime;
    }

    public String getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(String planEndTime) {
        this.planEndTime = planEndTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
