// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
public class DividePensAmongStudents {
    public static void main(String[] args) {
        int totalPens = 14;
        int numberOfStudents = 3;

        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;

        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d%n", pensPerStudent, remainingPens);
    }
}