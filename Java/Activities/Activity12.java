package activities;

public class Activity12 {
    public static void main(String args[]) {
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(5, 10));
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(10, 20));
    }
}
