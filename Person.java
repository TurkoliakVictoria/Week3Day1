package School;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        System.out.println("Ok");
        this.name = name;
        this.age = age;
    }

    public Person() {

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


    public void work() {
        System.out.println("work");
    }
    public void holiday(){
        System.out.println("There is holidays");
    }



}

