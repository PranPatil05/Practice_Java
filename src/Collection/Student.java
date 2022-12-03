package Collection;

import java.util.Objects;

public class Student implements Cloneable {
    int roll;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    public Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student(10,"Pranav");
        System.out.println(s1.toString());
        System.out.println(s1.getClass());
        System.out.println(s1.hashCode());
        Student s2 = new Student(10,"Ram");
        System.out.println(">>>>>>>>>>"+s1.equals(s2));
        System.out.println(s2.hashCode());
        Student s3 = (Student) s1.clone();
        System.out.println(s3.name);

    }

}
