import java.util.Scanner; //Including scanner
class Main {
  public static void main(String[] args) {
    int[] grades = {22,39,54,9,42,29,51,93,37,91,27,48,83,39,69};

    int bestGrade = highestGrade(0, grades[0], grades);

    System.out.println("Highest grade is " + bestGrade);
  }

  static int highestGrade(int index, int highestGrade, int[] grades) {
    if(grades.length-1 == index) {
      return highestGrade;
    } else {
      if(grades[index] > highestGrade) {
        highestGrade = grades[index];
      }
      return highestGrade(index + 1, highestGrade, grades);
    }
  }

}
