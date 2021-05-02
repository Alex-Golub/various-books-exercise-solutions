package CodeStepByStep.java.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://www.codestepbystep.com/problem/view/java/collections/map/teacher
 *
 * @author Alex Golub
 * @since 01-May-21, 4:03 PM
 */
class teacher {
  public static void main(String[] args) {
    Map<String, Integer> roster = new LinkedHashMap<>();
//    roster.put("Mort", 77);
//    roster.put("Dan", 81);
//    roster.put("Alyssa", 98);
//    roster.put("Kim", 52);
//    roster.put("Lisa", 87);
//    roster.put("Bob", 43);
//    roster.put("Jeff", 70);
//    roster.put("Sylvia", 92);
//    roster.put("Vikram", 90);
    
    roster.put("Abe", -142523);
    roster.put("Bea", -25);
    roster.put("Ced", -1);
    roster.put("Dez", 0);
    roster.put("Eli", 99);
    roster.put("Fran", 100);
    roster.put("Gilly", 101);
    roster.put("Hal", 9999999);
    
    Map<Integer, String> gradeMap = new TreeMap<>();
//    gradeMap.put(52, "D");
//    gradeMap.put(70, "C-");
//    gradeMap.put(73, "C");
//    gradeMap.put(76, "C+");
//    gradeMap.put(80, "B-");
//    gradeMap.put(84, "B");
//    gradeMap.put(87, "B+");
//    gradeMap.put(89, "A-");
//    gradeMap.put(91, "A");
//    gradeMap.put(98, "A+");
    
    gradeMap.put(-50, "X");
    gradeMap.put(-26, "Z");
    gradeMap.put(-10, "P");
    gradeMap.put(0, "T");
    gradeMap.put(80, "Q");
    gradeMap.put(98, "K");
    gradeMap.put(99, "L");
    gradeMap.put(100, "G");
    gradeMap.put(5000000, "H");
    
    System.out.println(teacher(roster, gradeMap));
  }
  
  public static HashMap<String, String> teacher(Map<String, Integer> roster,
                                                Map<Integer, String> gradeMap) {
    HashMap<String, String> studentGrade = new HashMap<>(roster.size());
    
    for (Map.Entry<String, Integer> e : roster.entrySet()) {
      String prevGrade = "F";
      String name = e.getKey();
      Integer grade = e.getValue();
      
      boolean found = false;
      for (Map.Entry<Integer, String> e2 : gradeMap.entrySet()) {
        Integer gradeValue = e2.getKey();
        String gradeSign = e2.getValue();
        
        if (grade < gradeValue) {
          studentGrade.put(name, prevGrade);
          found = true;
        } else if (grade.equals(gradeValue)) {
          studentGrade.put(name, gradeSign);
          found = true;
        }
  
        // grade for this student was found
        if (found) {
          break;
        }
        
        // keep searching through gradeMap
        prevGrade = gradeSign;
      }
      
      if (!found) { // insert last entry, fencepost
        studentGrade.put(name, prevGrade);
      }
    }
    
    return studentGrade;
  }
}
