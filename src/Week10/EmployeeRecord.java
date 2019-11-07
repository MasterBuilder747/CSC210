package Week10;

public class EmployeeRecord {

    //instead of using arrays in the main method, storing all the data types in one object is much more organized

    //if you don't provide a constructor, the default will be provided for you
    // 1) allocates heap space
    // 2) initializes member variables
    //  numeric types get 0
    //  chars and strings get 0 (int type)
    //  boolean get false
    //  otherwise it must be a reference, which is null (hence the NullPointerException when accessed)
    //  sout works differently and may not actually print out the right variable that is actually stored
    String name;
    int id;
    float salary;
    boolean working;

    public EmployeeRecord() { //void works in constructor method, even though it is redundant
        int x = 0;
        System.out.println("construct an EmployeeRecord");
    }


}
