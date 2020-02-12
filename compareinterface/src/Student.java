
import java.util.Comparator;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author int105
 */
public class Student implements Comparable<Student>{
    private long id;
    private String name;
    private int age;

    
    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student t) {
        Objects.requireNonNull(t);
        return Long.compare(this.id, t.id);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public static Comparator ageComparator(){
        return new AgeComparator();
    }
    
    public static Comparator nameComparator(){
        return new NameComparator();
    }
    
    public static Comparator nameComparatorV2(){
        return new Comparator<Student>(){
        @Override
        public int compare(Student t1, Student t2) {
        return t1.getName().compareTo(t2.getName());
    }};
}
    
    
}

class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student t1, Student t2) {
        return t1.getName().compareTo(t2.getName());
    }
    
    
    
}
