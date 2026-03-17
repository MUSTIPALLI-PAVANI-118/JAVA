class Student {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }
}

public class StudentGradeDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Anu");
        s.setMarks(82);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("Grade: " + s.getGrade());
    }
}
