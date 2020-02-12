
import java.util.Arrays;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author int105
 */
public class Test {
    public static void main(String[] args) {
        Student[] std = new Student[3];
        std[0] = new Student(1,"N",12);
        std[2] = new Student(2,"A",13);
        std[1] = new Student(3,"B",14);
        
        
        for (int i = 0; i < std.length; i++) {
           // Student student = std[i];
            System.out.println(std[i]);
        }
        
        System.out.println("------");
//        Arrays.sort(std);
//        for (Student student : std) {
//            System.out.println(student);
//        }
        
        Comparator ageComp = new AgeComparator();
        //Arrays.sort(std,new AgeComparator());
          Arrays.sort(std,ageComp);
            for (Student student : std) {
                System.out.println(student);
        }
         
        System.out.println("------");
        Arrays.sort(std,Student.ageComparator());{
        for (Student student : std) {
            System.out.println(student);
        }
    }
    }
}
