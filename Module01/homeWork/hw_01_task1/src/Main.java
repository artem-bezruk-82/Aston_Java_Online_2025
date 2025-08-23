import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("NINE");
        System.out.println(myArrayList);
        myArrayList.add("ZERO",0);
        System.out.println(myArrayList);
        myArrayList.add("FIVE",1);
        System.out.println(myArrayList);
        myArrayList.add("TEN");
        System.out.println(myArrayList);
        myArrayList.addAll(List.of((new String[] {"ONE","TWO","THREE", "FOUR"})),1);
        System.out.println(myArrayList);
        myArrayList.add("SEVEN",6);
        System.out.println(myArrayList);
        myArrayList.add("SIX",6);
        System.out.println(myArrayList);
        myArrayList.add("EIGHT",8);
        System.out.println(myArrayList);
        myArrayList.addAll(List.of((new String[] {"ONE","TWO","THREE", "FOUR", "FIVE","SIX","SEVEN", "EIGHT"})));
        System.out.println(myArrayList);
        System.out.printf("Removed: %s\n", myArrayList.remove(0));
        System.out.println(myArrayList);
        System.out.printf("Removed: %s\n", myArrayList.remove());
        System.out.println(myArrayList);
        System.out.printf("Removed: %s\n", myArrayList.remove(16));
        System.out.println(myArrayList);
        System.out.println("Remove: THREE");
        myArrayList.remove("THREE");
        System.out.println(myArrayList);
        System.out.println("Remove all: TWO");
        myArrayList.removeAll("TWO");
        System.out.println(myArrayList);
        System.out.println("Remove set of values");
        myArrayList.removeAll(List.of((new String[] {"ONE", "FOUR", "FIVE","SIX"})));
        System.out.println(myArrayList);
        System.out.println("Trim list to fit");
        myArrayList.trimToFit();
        System.out.println(myArrayList);

    }
}