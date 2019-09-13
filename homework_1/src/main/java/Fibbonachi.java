import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fibbonachi {
    static Logger logger = LoggerFactory.getLogger(Fibbonachi.class);
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int curr = 1;
        int prev = 0;
        int temp;
        long start = System.currentTimeMillis();
        for (int i=0; i<n; i++){
            System.out.println(curr);
            temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        long finish = System.currentTimeMillis();
        logger.info(Long.toString(finish-start));
    }
}
