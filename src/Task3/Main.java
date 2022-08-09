package Task3;

public class Main {
    public static void main(String[] args) {

        MyList<String> stringMyList = new MyList<>(new String[]{"a", "b", "c", "d", "e", "f"});
        System.out.println(stringMyList);
        System.out.println(stringMyList.min());
        System.out.println(stringMyList.max());

        MyList<Integer> integerMyList = new MyList<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 90, 50, 40, 33});
        System.out.println(integerMyList);
        System.out.println(integerMyList.min());
        System.out.println(integerMyList.max());


    }
}
