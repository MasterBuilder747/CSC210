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

    //access modifiers:
    // to variables and functions
    //public, private, protected
    //public: any class
    //private: only the class
    //use private for class vars to maintain control/security
    //aka data//function hiding
    private String name;
    private int id;
    private float salary;
    static private int numEmploy; //every class has its own copy
    //static: not like normal definition: shared across all instances of that class (good for count variables)
    //default access is not public, it is:
    //public within the package, private outside of the package

    //constructors: usually public, but private if needed
    EmployeeRecord() { //void works in constructor method, even though it is redundant
        int x = 0;
        System.out.println("construct an EmployeeRecord");
        numEmploy++;
    }
    public EmployeeRecord(double x) {
        numEmploy++;
    }
    //"this" works when in the class regardless of private
    public EmployeeRecord(String name, int id) {
        this.name = name;
        this.id = id;
        numEmploy++;
    }
    EmployeeRecord(String name, int id, float salary) { //overloading: use different sets of parameters for the same constructor
        //parameters are retrieved from the stack, and are placed here in this scope
        //must transfer to the class scope
        //must be significant (different data types)

        //"this" will bypass the local scope, using the class-level scope
        //aka: self-reference operator
        //use this scope
        this.name = name;
        this.id = id;
        this.salary = salary;
        numEmploy++;
    }

    //getters and setters (IDE and OOP design)
    //used for allowing for certain variables to be able to be set and accessed

    //getters
    String getName() {
        return name;
    }
    int getId() {
        forInternalUseOnly(); //notice that "this" is not needed here
        return id;
    }
    float getSalary() {
        return salary;
    }
    static int getNumEmploy() {
        //can be called before the constructor
        //accessible before instantiation when static
        //cannot access non-static variables in a static context:
        /*
        if (id == 27) {

        }
        */
        return numEmploy;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    private void forInternalUseOnly() {
        //cullable from only inside the class
    }

    //override
    @Override //this is a comment, used for javadoc formatting, ignored by the compiler
    public String toString() {
        if (getName() == null) {
            return "no name" + "\t" + this.getId() + "\t" + this.getSalary();
        }else {
            return this.getName() + "\t" + this.getId() + "\t" + this.getSalary();
        }
    }
    //String eString = er.[1].toString();
}
