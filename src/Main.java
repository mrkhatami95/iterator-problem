import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by MR on 6/22/2018.
 */
public class Main {

    public static void main(String[] args) {

        /*List<Integer> grades = new ArrayList<Integer>();
        boolean missValue = true;

        grades.add(16);
        grades.add(14);
        grades.add(17);
        grades.add(20);

        for (int grade : grades) {
            if (missValue && grade != 15) {
                grades.add(15);
                missValue = false;
            }
            System.out.println(grade); // print all grades
        }

        List<Integer> grades = new ArrayList<Integer>();
        boolean missValue = true;

        grades.add(16);
        grades.add(14);
        grades.add(17);
        grades.add(20);

        for (int index = 0 ; index < grades.size() ; index++) {
            if (missValue) {
                grades.add(15);
                missValue = false;
            }
            System.out.println(grades.get(index)); // print all grades
        }*/

        List<Integer> grades = new ArrayList<Integer>();
        List<Integer> gradeList = new ArrayList<Integer>();
        boolean missValue = true;

        grades.add(16);
        grades.add(14);
        grades.add(17);
        grades.add(20);

        for(int grade : grades){
            if(missValue && grade != 15){
                gradeList.add(15);
                missValue = false;
            }
        }

        gradeList.addAll(grades);

        for(int grade : gradeList)
            System.out.println(grade); // print grades

    //}
    }
}
