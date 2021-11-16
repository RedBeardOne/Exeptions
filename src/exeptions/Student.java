package exeptions;

public class Student {
    String name;
    int age;

    public void setName(String name) {
        if (name == null || name.length() <= 1) {
            throw new IllegalArgumentException("Input correct name");
        }
        this.name = name;

    }

    public void setAge(int age) {
        if (age < 16 || age > 60) {
            throw new IllegalArgumentException("Input correct age");
        }
        this.age = age;
    }
}

