
package f18comp1008w3;

import java.util.ArrayList;

/**
 *
 * @author jwright
 */
public class F18COMP1008W3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(99);
        grades.add(100);
        grades.add(77);
        grades.add(67);
        
        System.out.printf("The average grade is %.1f", getAVG(grades));
    }
    
    public static double getAVG(ArrayList<Integer> grades)
    {
        double sum =0;
        for (Integer grade:grades)
        {
            sum += grade;
        }
        return sum / grades.size();
    }
    
}
