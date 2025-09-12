package puckage1;

public class A
{
    public static void main(String[] Main)
    {
        System.out.println("Hello world");
        B b = new B();
        int s = 0;
        int[] arr;
        arr = new int[] {1, 2, 3, 4, 5, 6};
        for (int i = 0; i<arr.length; i++)
            s += arr[i];
        s=0;
        for (int a : arr) s+= a;
        String str = " ";

        str += "I love you";
        String str1 = "you";
        String str2 = "you";
        System.out.println("" + b.increase());
        System.out.println(s);
    }
}

