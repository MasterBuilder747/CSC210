package Week05;

public class TimesTable {

    public static void main(String[] args) {

        //header
        System.out.print("\t" + "\t");
        for (int i = 1; i <= 12; i++) {
            System.out.print(i + "\t" + "\t");
        }

        //line separator
        System.out.println("");
        System.out.print("      __");
        for (int j = 1; j <= 12; j++) {
            System.out.print("________");
        }
        System.out.println("");

        //number calculations
        for (int x = 1; x <= 12; x++) {
            System.out.print(x + "\t" + "  " + "|" + " ");
            for (int y = 1; y <= 12; y++) {
                System.out.print((x * y) + "\t" + "\t");
            }
            System.out.println("");
        }


    }

}
