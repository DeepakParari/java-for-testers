package examples;

public class Person {

    private String name;
    private int age;

    public Person() {
        this.name = "John Doe";
        this.age = 35;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
