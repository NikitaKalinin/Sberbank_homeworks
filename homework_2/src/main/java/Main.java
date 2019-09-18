public class Main {

    public static void main(String[] args) {
        Device mobile = new Device(1, "mobile");
        Component screen = new Component("screen", 1, true);
        Component battery = new Component("battery", 2, false);
        Component wifi = new Component("wifi", 3, true);
        mobile.addComponent(screen);
        mobile.addComponent(battery);
        mobile.addComponent(wifi);
        Devices.getDevices().put(1, mobile);
        Event error1 = new ErrorEvent(1, 1);
        Event ok1 = new RestoreEvent(1, 2);
        Event error2 = new ErrorEvent(1, 3);
        Event ok2 = new RestoreEvent(1, 2);
        Event ok4 = new RestoreEvent(1, 1);
        Event ok5 = new RestoreEvent(1, 2);
        Event ok6 = new RestoreEvent(1, 3);


    }
}
