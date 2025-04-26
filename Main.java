
class Person {
    // Encapsulating the name and age
    // only approachable and used using
    // methods defined
    private String name;
    private int age;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
}

class Area {
    private int l; // this value stores length
    private int b; // this value stores breadth

    // constructor to initialize values
    Area(int l, int b)
    {
        this.l = l;
        this.b = b;
    }

    // method to calculate area
    public void getArea()
    {
        int area = l * b;
        System.out.println("Area: " + area);
    }
}
public class Main {
    // Driver Class
    // main function
    public static void main(String[] args)
    {
        // person object created
        Person p = new Person();
        p.setName("Rasel");
        p.setAge(22);
        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        Area rect = new Area(2, 16);
        rect.getArea();
    }


}
