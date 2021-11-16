import exeptions.MyDomainExeption;
import exeptions.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            new Main().deserialize("sd");
        } catch (MyDomainExeption e) {
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getMessage());
            System.out.println("reason -> " + e.getCause());
            System.out.println((Arrays.toString(e.getStackTrace())));
        }
        int x = 2;
        System.out.println("x = " + x);
        try {
            new Main().doSerialazeChek();
        } catch (MyDomainExeption e) {
            x = 3;
            System.out.println("x = " + x);
            e.printStackTrace();
        } catch (NullPointerException n) {
            n.fillInStackTrace();
        } catch (Exception t) {
            t.getStackTrace();
        } finally {
            x = 4;
            System.out.println("x = " + x);
        }

        Student student = new Student();
        try {
            student.setName("Vasyliy");
            student.setAge(61);
        }catch (IllegalArgumentException a){
            System.out.println(a.getLocalizedMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        new Main().doSerializeUncheck();

        System.out.println("end of app");
    }

    public void doSerialazeChek() throws MyDomainExeption {
        try {
            deserialize("Inside");
        } catch (MyDomainExeption e) {
            System.out.println("In method checkable");
            System.out.println(e.getCause());
            throw e;
        }
    }

    public void doSerializeUncheck() {
        try {
            deserialize("Inside");
        } catch (MyDomainExeption e) {
            System.out.println(e.getStackTrace());
            throw new NullPointerException();
        }
    }

    public Student deserialize(String something) throws MyDomainExeption {
        throw new MyDomainExeption("Hello! It exception");
    }
}
