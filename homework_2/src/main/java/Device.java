import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Device {

    private Integer id;
    private String name;
    private String status = "Normal";
    private HashMap<Integer, Component> components = new HashMap<Integer, Component>();
    private Integer errorDevices = 0;
    private Integer allDevices = 0;
    private Logger logger;

    public Device (Integer id, String name){
        this.id = id;
        this.name = name;
        logger = LoggerFactory.getLogger(name);
    }

    public void addComponent(Component c){
        this.components.put(c.getId(), c);
        allDevices += 1;
        checkStatus(c.getStatus(), null);
    }

    public void setComponentStatus(Integer componentId, Boolean status){
        try {
            Boolean prev_status = null;
            prev_status = this.components.get(componentId).getStatus();
            this.components.get(componentId).setStatus(status);
            checkStatus(status, prev_status);
        } catch (NullPointerException e) {
            logger.error(String.format("У %s нет компонента с id = %d", this.name, componentId));
        }
    }

    public void checkStatus(Boolean currStatus, Boolean prevStatus){
        if (prevStatus != null){
            if (currStatus != prevStatus){
                if (currStatus) errorDevices -= 1;
                else errorDevices += 1;
            }
        } else {
            if (!currStatus) errorDevices += 1;
         }
        String newStatus = "";
        if (errorDevices == 0) newStatus = "Normal";
        else if (errorDevices == 1) newStatus = "Warning";
        else if (2*errorDevices > allDevices) newStatus = "Error";
        if (!newStatus.equals(this.status)) {
            this.status = newStatus;
            String message = String.format("“Устройство id = %d, name = %s изменило свое состояние на %s%n", this.id, this.name, newStatus);
            if (this.status.equals("Warning"))
                logger.warn(message);
            else if (this.status.equals("Error"))
                logger.error(message);
            else if (this.status.equals("Normal"))
                logger.info(message);
        }

    }

    public Integer getId(){
        return this.id;
    }
}
