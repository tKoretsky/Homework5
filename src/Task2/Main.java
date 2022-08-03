package Task2;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> integerList = new MyList<>();

        integerList.add(1);
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
        integerList.add(20);

        System.out.println(integerList.min());
        System.out.println(integerList.max());

        MyList<String> stringList = new MyList<>();

        stringList.add("A");
        stringList.add("F");
        stringList.add("M");
        stringList.add("T");
        stringList.add("X");

        System.out.println(stringList.min());
        System.out.println(stringList.max());

    }
}
