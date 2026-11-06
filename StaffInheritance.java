class Staff {
    void displayStaff() {
        System.out.println("University Staff");
    }
}

class Teacher extends Staff {
    void displayTeacher() {
        System.out.println("Teacher: Computer Science");
    }
}

public class StaffInheritance {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.displayStaff();
        t.displayTeacher();
    }
}
