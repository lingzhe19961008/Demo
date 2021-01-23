package Demo;
import  java.util.Random;
public class Demo1 {
    public static void main(String[] args) {

        /**
         * 2进制
         * Java 运算原理
         * 1 编译，将Java源文件编译为字节码（2进制）
         * 2运行程序
         */
        int n=50;//编译以后：110010
        //运行期间 n一直都是110010
        //Integer.toBinaryString(n);输出时候自动省略        高位的0
        //  因为高位的0不影响计算
        //输出2进制的50
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));


        for (int i=0;i<=200;i++){
            System.out.println(Integer.toBinaryString(i));
        }


    }
}
