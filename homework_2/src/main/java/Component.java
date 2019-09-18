public class Component {

    private Integer id;
    private Boolean status;
    private String name;

    public Component(String name, Integer id, Boolean status){
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Integer getId(){ return this.id; }

    public void setStatus(Boolean status) { this.status = status; }

    public Boolean getStatus(){ return this.status;}

}
