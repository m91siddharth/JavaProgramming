package streams;

public class Employee {
    private String name;
    private String id;
    private double sal;

    Employee(String name, String id, Double sal){
        this.setName(name);
        this.setId(id);
        this.setSal(sal);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sal=" + sal +
                '}';
    }
}
