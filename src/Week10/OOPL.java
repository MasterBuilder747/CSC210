package Week10;

public class OOPL {

    public static void main(String[] args) {
        //object-oriented programming language
        //take everything and break it into smaller pieces
        //object provides a service for the larger program

        //***class method of procedural***
        int N = 5;
        EmployeeRecord[] er = new EmployeeRecord[N]; //creates an array of references to employee record classes
        //in this case, the class does not exist yet, only the references
        //the data is not set and stored yet

        //soooo.... construct it! (always)

        EmployeeRecord r = new EmployeeRecord(); //this is an individual class, invokes constructor

        //store vales for the
        for (int i = 0; i < N; ++i) {
            er[i] = new EmployeeRecord(); //constructor
            //this is an array of i classes, used more often
            //er[i].name = "MyNameIs" + i; //results in a nullpointerexception because it needs to be constructed!
            //er[i].salary = 13.0F; //13.00
            //er[i].id = i;
            //er[i].working = true;
        }

        //print the values
        for(int i = 0; i < N; i++) {
            System.out.println(er[i].name + "\t" +
                               er[i].id + "\t" +
                               er[i].salary);
        }

    }

}
