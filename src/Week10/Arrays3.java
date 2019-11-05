package Week10;

public class Arrays3 {

    public static void main(String[] args) {

        int y[] = {133, 0};
        func(y);

    }

    public static void func (int x[]) {
        try {
            x[0] = 27;
        }catch (Exception e) {
            System.out.println("invalid");
        }
    }

}
