package Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> newList = new MyList<Integer>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(50);
            newList.add(num);
        }

        System.out.println(newList.toString());

        System.out.println(newList.largest());
        System.out.println(newList.smallest());


    }
}