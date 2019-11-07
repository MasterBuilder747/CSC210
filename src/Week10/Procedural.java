package Week10;

import java.util.Scanner;

public class Procedural {

    public static void main(String[] args) {

        //***this is the OOPL version by using arrays, a homogeneous data storage method***

        int N = 5; //# of employees
        int[] EmployeeID = new int[N];
        double[] EmployeeSalary = new double[N];
        String[] EmployeeName = new String[N];

        // hire some employees
        for (int i = 0; i < N; ++i) {
            EmployeeID[i] = i; //set their ID
            EmployeeSalary[i] = 13.00; // pay them minimum wage
            EmployeeName[i] = "MyNameIs" + i; //give them a name
        }

        //print the list of employees
        for (int i = 0; i < N; ++i) {
            System.out.println(EmployeeName[i] + "\t" +
                               EmployeeID[i] + "\t" +
                               EmployeeSalary[i]);
        }
        int id1 = N - 1;

        Scanner kb = new Scanner(System.in);
        System.out.println("Employee ID: ");
        int id0 = kb.nextInt();
        System.out.println("New Salary: ");
        double sal = kb.nextDouble();
        EmployeeSalary[id0] = EmployeeSalary[id1] + sal;

        //print the list of employees
        for (int i = 0; i < N; ++i) {
            System.out.println(EmployeeName[id0] + "\t" +
                    EmployeeID[i] + "\t" +
                    EmployeeSalary[i]);
        }

    }

}
