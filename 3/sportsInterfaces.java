import java.util.Scanner;

interface Student {
    void readStudentDetails(int admission_number, String name, float total);
}

interface Sports {
    void readSportsDetails(float point);
}

class Result implements Student, Sports {
    int admission_number;
    String name;
    float total;
    float point;

    public void readStudentDetails(int admission_number, String name, float total) {
        this.admission_number = admission_number;
        this.name = name;
        this.total = total;
    }

    public void readSportsDetails(float point) {
        this.point = point;
    }

    void display() {
        System.out.println("Admission number is: " + admission_number);
        System.out.println("Name is: " + name);
        System.out.println("Total CGPA obtained in academics is: " + total);
        System.out.println("Total Points obtained in Sports out of ten is: " + point);
    }
}

class sportsInterfaces {
    public static void main(String[] args) {
        float point, total;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the admission number: ");
        int admission_number = sc.nextInt();

        sc.nextLine(); 
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();

        System.out.println("Enter the academic and sports details of a student");
        System.out.println("Enter the total CGPA obtained: ");
        total = sc.nextFloat();

        System.out.println("Enter the overall score point obtained in sports (out of 10): ");
        point = sc.nextFloat();

        Result r = new Result();
        r.readStudentDetails(admission_number, name, total);
        r.readSportsDetails(point);
        r.display();

        sc.close();
    }
}
