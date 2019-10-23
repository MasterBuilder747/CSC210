package Week04;

//import sun.nio.cs.ext.MacThai;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        //no arg/parameter
        Random r = new Random();

        System.out.println(r.nextInt());
        System.out.println(r.nextDouble());
        System.out.println(Math.random()); //this is the same as nextDouble

        System.out.println((int)(Math.random() * 10)); //this is the same as (int)(nextDouble() * 10);
        //the bounded number is not included

        //you can recreate an object with different parameters
        r = new Random(12741987);

        //you can make a new object name
        Random t = new Random();

        //user setSeed()
        r.setSeed(13784104);

        //0 <= x < value
        //ex: 10
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));


    }

}
