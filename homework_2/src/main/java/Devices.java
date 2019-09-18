import java.util.HashMap;

public class Devices {
    private static HashMap<Integer, Device> Devices;

    private Devices() {}

    public static HashMap<Integer, Device> getDevices() {

        if (Devices == null)
            Devices = new HashMap<Integer, Device>();

        return Devices;
    }
}
