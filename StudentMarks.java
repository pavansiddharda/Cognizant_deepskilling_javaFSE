public class StudentMarks {
    String studentName = "Pavan Siddharda";
    static int rollNumber = 564;

    float marks1 = 100;
    float marks2 = 98;
    float marks3 = 99;

    public void calculateMarks() {
        float totalMarks = marks1 + marks2 + marks3;
        float average = totalMarks / 3;

        System.out.println("Total marks obtained by " + studentName + " is: " + totalMarks);
        System.out.println("Average marks obtained is: " + average);
    }

    public static void main(String[] args) {
        StudentMarks student = new StudentMarks();
        student.calculateMarks();
    }
}


