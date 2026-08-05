import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    int patientId;
    String patientName;
    int age;
    String disease;
    String doctorName;
    double consultationFee;

    Patient(int patientId, String patientName, int age, String disease,
            String doctorName, double consultationFee) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }

    void displayPatient() {
        System.out.println("--------------------------------------------");
        System.out.println("Patient ID       : " + patientId);
        System.out.println("Patient Name     : " + patientName);
        System.out.println("Age              : " + age);
        System.out.println("Disease          : " + disease);
        System.out.println("Doctor           : " + doctorName);
        System.out.printf("Consultation Fee : ₹%.2f%n", consultationFee);
        System.out.println("--------------------------------------------");
    }
}

public class HospitalManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Patient> patients = new ArrayList<>();

    static Patient findPatient(int id) {
        for (Patient p : patients) {
            if (p.patientId == id) {
                return p;
            }
        }
        return null;
    }

    static void addPatient() {

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findPatient(id) != null) {
            System.out.println("Patient ID Already Exists.");
            return;
        }

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctor = sc.nextLine();

        System.out.print("Enter Consultation Fee: ");
        double fee = sc.nextDouble();

        patients.add(new Patient(id, name, age, disease, doctor, fee));

        System.out.println("Patient Registered Successfully.");
    }

    static void displayPatients() {

        if (patients.isEmpty()) {
            System.out.println("No Patient Records Found.");
            return;
        }

        System.out.println("\n========== PATIENT DETAILS ==========");

        for (Patient p : patients) {
            p.displayPatient();
        }
    }

    static void searchPatient() {

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        Patient p = findPatient(id);

        if (p != null) {
            p.displayPatient();
        } else {
            System.out.println("Patient Not Found.");
        }
    }

    static void updatePatient() {

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Patient p = findPatient(id);

        if (p == null) {
            System.out.println("Patient Not Found.");
            return;
        }

        System.out.print("Enter New Disease: ");
        p.disease = sc.nextLine();

        System.out.print("Enter New Doctor Name: ");
        p.doctorName = sc.nextLine();

        System.out.print("Enter New Consultation Fee: ");
        p.consultationFee = sc.nextDouble();

        System.out.println("Patient Details Updated Successfully.");
    }

    static void dischargePatient() {

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        Patient p = findPatient(id);

        if (p != null) {
            patients.remove(p);
            System.out.println("Patient Discharged Successfully.");
        } else {
            System.out.println("Patient Not Found.");
        }
    }

    static void totalPatients() {
        System.out.println("Total Patients: " + patients.size());
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== HOSPITAL MANAGEMENT SYSTEM ==========");
            System.out.println("1. Register Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Update Patient");
            System.out.println("5. Discharge Patient");
            System.out.println("6. Total Patients");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addPatient();
                    break;

                case 2:
                    displayPatients();
                    break;

                case 3:
                    searchPatient();
                    break;

                case 4:
                    updatePatient();
                    break;

                case 5:
                    dischargePatient();
                    break;

                case 6:
                    totalPatients();
                    break;

                case 7:
                    System.out.println("Thank You for Using Hospital Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
