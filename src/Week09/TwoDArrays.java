package Week09;

public class TwoDArrays {

    public static void main(String[] args) {

        //whats happening in the background:
        //stack (compiler operation) = heap (JVM operation)
        int a[][] = new int[3][4];
        int value = 1;
        for (int i = 0; i < a.length; ++i) { //rows
            for (int j = 0; j < a[i].length; ++j) { //cols
                a[i][j] = value++;
            }
        }

        for (int i = 0; i < a.length; ++i) { //rows
            for (int j = 0; j < a[i].length; ++j) { //cols
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }



        int b[][]= {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        /*
        row 0: [1 2 3 4 5]
        row 1: [1 2 3 4 5]
         */



    }

}
