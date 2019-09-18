public abstract class Event {
    private Integer deviceId;
    private Integer componentId;

    public Event(Integer deviceId, Integer componentId){
        this.deviceId = deviceId;
        this.componentId = componentId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public Integer getComponentId() {
        return componentId;
    }

    public void setStatus() {}
}
