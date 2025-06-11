package Day1_programming_elements;

public class average_percenatge {
        
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88}; // Example marks
        int totalMarks = 0;

        // Calculate total marks
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate average
        double average = (double) totalMarks / marks.length;

        // Calculate percentage
        double percentage = (totalMarks / (marks.length * 100.0)) * 100;

        // Print the results
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
    }
}
