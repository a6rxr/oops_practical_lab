package oops_practical_lab;
class Programmer {
    
    private String name;
    
    public String getName() { return name; }
    
    // Setter method is used to set or modify the data
    public void setName(String name) { this.name = name; }
}
public class Geeks {
    
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("Geek"); 
        System.out.println("Name=> " + p.getName());
    }
}