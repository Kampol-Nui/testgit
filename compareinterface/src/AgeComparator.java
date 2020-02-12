
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
public class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student t1, Student t2) {
        return t1.getAge()-t2.getAge();
    }
    
    
    
}
