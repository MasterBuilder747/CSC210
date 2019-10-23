package Week05;

public class PlusPlus {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        i = i++;
        System.out.println(i);
        i = 0;
        i = ++i;
        System.out.println(i);
        i = 0;
        i = ++i + i++;
        System.out.println(i);
        i = 0;
        i = ++i + i++ + i++;
        System.out.println(i);
    }

}
