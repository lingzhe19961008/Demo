package Demo;

public class Demo8 {
    public static void main(String[] args) {
       /* int n=0x77b270bd;
        int m=n>>>1;
        int k=n>>>2;
        int g=n>>>8;
        int b3=(n>>>8)&0xff;
        System.out.println(Integer.toBinaryString(g));*/

        int n=0xbede371d;
        int m=n<<1;
        int j=n<<2;
        int k=n<<8;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(j));
        System.out.println(Integer.toBinaryString(k));
    }
}
