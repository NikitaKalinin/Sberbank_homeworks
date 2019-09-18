public class RestoreEvent extends Event {

    public RestoreEvent(Integer deviceId, Integer componentId) {
        super(deviceId, componentId);
        setStatus();
    }

    @Override
    public void setStatus() {
        Devices.getDevices().get(getDeviceId()).setComponentStatus(getComponentId(), true);
    }
}