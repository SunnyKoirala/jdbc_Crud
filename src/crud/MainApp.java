package crud;

public class MainApp {
    public static void main(String[] args) {
        // CREATE
        StudentCreate.insertStudent("Alice", 22, "alice@example.com");
        StudentCreate.insertStudent("Bob", 24, "bob@example.com");

        // READ
        System.out.println("All Students:");
        StudentRead.getAllStudents();

        // UPDATE
        StudentUpdate.updateStudentEmail(1, "alice.new@example.com");

        // DELETE
        StudentDelete.deleteStudent(2);

        // READ again
        System.out.println("After Update and Delete:");
        StudentRead.getAllStudents();
    }
}
