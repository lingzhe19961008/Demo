package Demo;

public class Demo6 {
    public static void main(String[] args) {
        int n=-6;
        int m=~n+1;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(~n));
        System.out.println(Integer.toBinaryString(~n+1));
    }
}
