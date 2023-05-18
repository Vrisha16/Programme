package Midweek;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner Jai = new Scanner(System.in);
        System.out.println("Enter student details ");//Student Details.
        System.out.println("Name");
        String name = Jai.nextLine();
        System.out.println("Roll NO");
        int rollNo = Jai.nextInt();
        int mathMarks = 0, scienceMarks = 0, englishMarks = 0;
        boolean isValidInput = false;
        while (!isValidInput) {//While loop
            System.out.print("Enter Math marks (0-100): ");
            mathMarks = Jai.nextInt();
            if (mathMarks >= 0 && mathMarks <= 100) {
                isValidInput = true;
            } else {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
            }
        }
        isValidInput = false;
        while (!isValidInput) {
            System.out.print("Enter Science marks (0-100): ");
            scienceMarks = Jai.nextInt();
            if (scienceMarks >= 0 && scienceMarks <= 100) {
                isValidInput = true;
            } else {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
            }
        }

        isValidInput = false;
        while (!isValidInput) {
            System.out.print("Enter English marks (0-100): ");
            englishMarks = Jai.nextInt();
            if (englishMarks >= 0 && englishMarks <= 100) {
                isValidInput = true;
            } else {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
            }
        }

        isValidInput = false;
        while (!isValidInput) {
            System.out.print("Enter English marks (0-100): ");
            englishMarks = Jai.nextInt();
            if (englishMarks >= 0 && englishMarks <= 100) {
                isValidInput = true;
            } else {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
            }
        }

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (double) totalMarks / 3;
        String result = percentage >= 35 ? "Pass" : "Fail";

        // Calculate grade
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Print the mark sheet
        System.out.println("\n\nMark Sheet\n\n");
        System.out.println("|\n|");
        System.out.println("|\n|\n|\nName: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("\nJ\na\ny\n|\n|\n|");
        System.out.println("| |\n| Subjects : Marks |\n| |\n| Math : " + mathMarks + " |\n| Science: " + scienceMarks + " |\n| English : " + englishMarks + " |\n| |\n| Total : " + totalMarks + " |\n| |\n| Percentage : " + percentage + " |\n| Result : " + result + " |\n| Grade : " + grade + " |\n|             |");
    }
}



