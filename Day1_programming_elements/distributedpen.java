package Day1_programming_elements;

public class distributedpen {
    
    public static void main(String[] args) {
        int totalPens = 100; // Total number of pens
        int students = 25; // Number of students

        // Calculate pens per student
        int pensPerStudent = totalPens / students;

        // Calculate remaining pens
        int remainingPens = totalPens % students;

        // Print the results
        System.out.println("Each student gets: " + pensPerStudent + " pens");
        System.out.println("Remaining pens: " + remainingPens);
    }
}
