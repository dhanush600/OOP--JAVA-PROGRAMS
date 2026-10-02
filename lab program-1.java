import java.util.Scanner;

class Student {
    String usn;
    String name;
  
   
    void Details() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = in.nextLine();

        System.out.print("Enter Name: ");
        name = in.nextLine();
    }
    void display() {
        System.out.println("USN  : " + usn);
        System.out.println("Name : " + name);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int  n = in.nextInt();
        in.nextLine();

        
        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            s[i] = new Student();
            s[i].Details();
        }

    
        System.out.println("\n Student Details");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            s[i].display();
        }

        in.close();
    }
}
