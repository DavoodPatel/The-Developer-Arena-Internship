import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.printf("%-10s %-20s %-5s %-7s %-15s\n",
                "ID", "Name", "Age", "Grade", "Contact");
        System.out.println("-----------------------------------------------------------");

        for (Student s : students) {
            s.display();
        }
    }

    public Student searchById(String id) {
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    public Student searchByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public boolean deleteStudent(String id) {
        Student s = searchById(id);
        if (s != null) {
            students.remove(s);
            return true;
        }
        return false;
    }
}
