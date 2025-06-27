import java.util.Scanner;
import java.util.ArrayList;


public class StudentGrade{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	ArrayList<Integer> scores = new ArrayList<>();

	System.out.println("How many students are in record?");
		int students = input.nextInt();

	System.out.println("How many subjects are in record?");
		int subjects = input.nextInt();

	int[] studentRecords = new int[students];
	int [][] subjectsRecord = new int[students][subjects];

	for(int student = 1; student <= students; student++){

		for(int subject = 1; subject <= subjects; subject++){
			
			System.out.printf("Enter score for student %d for subject %d:%n"  , student , subject);
				int score = input.nextInt();
				scores.add(score);	
				
		}
	
	}
	double average = 
		System.out.println("=================================================");
		//System.out.printf("%s %-5s %-5s %-5s %-5s
		System.out.println("=================================================");

		for(int count =0; count < scores.size(); count++){
			System.out.println(scores.get(count));
		}
		System.out.print("=================================================");




	}


}

/*
import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine();

        String[] studentNames = new String[numStudents];
        int[][] studentScores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();

            System.out.println("Enter scores for student " + (i + 1) + " (3 subjects): ");
            for (int j = 0; j < 3; j++) {
                studentScores[i][j] = input.nextInt();
            }
            input.nextLine();
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Name: " + studentNames[i]);
            System.out.print("Scores: ");
            int totalScore = 0;
            for (int score : studentScores[i]) {
                System.out.print(score + " ");
                totalScore += score;
            }
            double average = (double) totalScore / 3;
            System.out.println("\nAverage: " + average);
            System.out.println("Grade: " + getGrade(average));
            System.out.println("---------");
        }
    }

    public static String getGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
*/