package Week10;

public class OOPL {

    //all objects-can be called before instantiation-no return type-array of string arguments
    //gives JVM access-no object exists-nothing can be returned to the JVM-name(exception arguments)
    public static void main(String[] args) { //entry point, static, only called by the JVM
        //this means that it doesn't know what the class is before calling the function

        //object-oriented programming language
        //take everything and break it into smaller pieces
        //object provides a service for the larger program

        System.out.println(EmployeeRecord.getNumEmploy()); //cannot accees non-static variables/functions
        //***class method of procedural***
        int N = 5;
        EmployeeRecord[] er = new EmployeeRecord[N]; //creates an array of references to employee record classes
        //in this case, the class does not exist yet, only the references
        //the data is not set and stored yet

        //soooo.... construct it! (always)

        EmployeeRecord r = new EmployeeRecord(); //this is an individual class, invokes constructor

        //store vales for the
        for (int i = 0; i < N; ++i) {
            er[i] = new EmployeeRecord("MyNameIs" + i, i, 13.0F); //constructor
            //this is an array of i classes, used more often
            //er[i].name = "MyNameIs" + i; //results in a nullpointerexception because it needs to be constructed!
            //er[i].salary = 13.0F; //13.00
            //er[i].id = i;
            //er[i].working = true;
        }

        //print the values
        for(int i = 0; i < N; i++) {
            System.out.println(er[i].getName() + "\t" +
                               er[i].getId() + "\t" +
                               er[i].getSalary());
        }

    }

}