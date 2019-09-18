public class ErrorEvent extends Event {

    public ErrorEvent(Integer deviceId, Integer componentId) {
        super(deviceId, componentId);
        setStatus();
    }

    @Override
    public void setStatus() {
        Devices.getDevices().get(getDeviceId()).setComponentStatus(getComponentId(), false);
    }
}
