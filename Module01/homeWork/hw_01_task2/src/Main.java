
public class Main
{
    public static void main(String[] args)
    {
        MyCustomHashSet<String> myCustomHashSet = new MyCustomHashSet<>();
        System.out.println(myCustomHashSet.size());
        myCustomHashSet.add("one");
        myCustomHashSet.add("two");
        myCustomHashSet.add("three");
        System.out.println(myCustomHashSet.size());
        myCustomHashSet.remove("two");
        System.out.println(myCustomHashSet.size());
    }
}