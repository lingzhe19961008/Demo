package Demo;

import java.net.Inet4Address;

public class Demo2 {
    public static void main(String[] args) {
        //1011 1010 0011 1000 1111 1101 0010 101  二进制
       /*int n=0x5d1c7e95;   6进制
        System.out.println(n);
           //   e     1     c     7      f    9    5
        System.out.println(Integer.toBinaryString(n));
*/      /*补码：计算机中用于处理负数得一种编码规则，其编码思路是长女固定位置的数
        2进制数分一般作为负数使用*/
        int y=-3;
        System.out.println(Integer.toBinaryString(y));
    }
}
