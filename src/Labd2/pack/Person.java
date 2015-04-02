package Labd2.pack;

/**
 * Created by samuelort on 15-04-02.
 * Project name: Labb2
 */
public class Person {
    private String name;
    private String email;
    private String gender;
    private int age;

    public Person(String name, String email, String gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}