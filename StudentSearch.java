import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {

        int[] ids = {1, 2, 3};
        String[] names = {"rajesh", "rahul", "sruthi"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student id: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == id) {
                System.out.println("Student Name: " + names[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No student found with id " + id);
        }
    }
}
