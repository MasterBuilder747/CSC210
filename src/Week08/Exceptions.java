package Week08;

public class Exceptions {

    public static void main(String[] args) {
        try {
            exception();

        }catch (Exception e) {
            System.out.println("divide by 0.");
        }


    }

    public static void exception () /*throws ArithmeticException*/ {
        int x = (1 / 0);
        //throw new ArithmeticException();
    }


}
