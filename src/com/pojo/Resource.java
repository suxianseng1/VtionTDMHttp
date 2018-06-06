package com.pojo;

/**
 * 设备
 */
public class Resource {
    /**
     * 编号
     */
    private String resourceId;
    /**
     * 名称
     */
    private String resourceName;
    /**
     * 所属科室名称
     */
    private String factoryName;
    /**
     * 设备型号
     */
    private String resourceFamily;
    /**
     * 设备类型
     */
    private String resourceType;

    /**
     * 当前任务编号
     */
    private String taskNo;
    /**
     * 维护日期
     */
    private String mainTain;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getResourceFamily() {
        return resourceFamily;
    }

    public void setResourceFamily(String resourceFamily) {
        this.resourceFamily = resourceFamily;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

    public String getMainTain() {
        return mainTain;
    }

    public void setMainTain(String mainTain) {
        this.mainTain = mainTain;
    }

    /*

    private String fixDate;

    private String produceFactory;
    public String getFixDate() {
        return fixDate;
    }

    public void setFixDate(String fixDate) {
        this.fixDate = fixDate;
    }

    public String getProduceFactory() {
        return produceFactory;
    }

    public void setProduceFactory(String produceFactory) {
        this.produceFactory = produceFactory;
    }
*/
}
