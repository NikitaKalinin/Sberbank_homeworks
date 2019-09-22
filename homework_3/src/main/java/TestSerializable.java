import java.io.Serializable;

public class TestSerializable implements Serializable {
    private Integer test1;
    private String test2;

    public TestSerializable(Integer test1, String test2){
        this.test1 = test1;
        this.test2 = test2;
    }
    @Override
    public String toString(){
        return test1 + " " + test2;
    }
}
