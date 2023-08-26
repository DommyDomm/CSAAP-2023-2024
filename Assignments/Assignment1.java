import java.util.Scanner;
class Assignment1 
{
  public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the course name.");
        String course = input.nextLine();

        System.out.println("Please enter the average time spent in a week for this course in minutes.");
        int min = input.nextInt();

        System.out.println("Please enter the homework grades for this course.");
        int hw1 = input.nextInt();
        int hw2 = input.nextInt();
        int hw3 = input.nextInt();
        int hw4 = input.nextInt();

        System.out.println("Please enter the quiz grades for this course.");
        double quiz1 = input.nextDouble();
        double quiz2 = input.nextDouble();

        System.out.println("Please enter the final exam grade for this course.");
        double f = input.nextDouble();

        int hours = min / 60;
        min %= 60;

        double avgHw = (double) (hw1 + hw2 + hw3 + hw4) / 4;
        double avgQuiz = (quiz1 + quiz2) / 2;
        double avgGrade = Math.round((avgHw * 0.35) + (avgQuiz * 0.15) + (f * 0.5));

        System.out.println("Course name: " + course);
        System.out.println("Weekly time spent:" + hours + "h" + min);
        System.out.println("Average homework grade: " + avgHw);
        System.out.println("Average quiz grade:" + avgQuiz);
        System.out.println("Final exam grade: " + f);
        System.out.println("Overall grade: " + avgGrade);
  }
}
