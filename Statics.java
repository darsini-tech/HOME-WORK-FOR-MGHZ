
package staticcandfinal;
public class Statics {
    static final String college_Name = "XYZ Engineering College"; 
    final int registrationFee;                                 
    static int totalStudents = 0;                           
    Statics(int fee) {
        this.registrationFee = fee;
        totalStudents++;           
    }

    public static void displayCollegeDetails() {
        System.out.println("College Name: " + college_Name);
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayStudentFee() {
        System.out.println("Student Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) 
    {
        Statics student1 = new Statics(25000);
        Statics student2 = new Statics(30000);

        Statics.displayCollegeDetails();
        student1.displayStudentFee();
        student2.displayStudentFee();
    }
}


