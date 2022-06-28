import java.util.Scanner;

public class Fibonacci {
    public static int DACnum=0;
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        int i;
        if (n == 1) {
            return 1;
        } else {
            i = Fibonacci(n - 1) + Fibonacci(n - 2);
            DACnum++;
        }
        return DACnum;
    }

    public static int f(int n) {
        int num=0;
        if (n == 0) {
            return 0;//初始值为0
        }
        if (n == 1) {
            return 1;//定义f（1）为1，否者结果都是0；
        }
        int result = 0;
        int r1 = 0;
        int r2 = 1;
        for (int i = 2; i <= n; i++) {//斐波那契数列求解f（n）
            result = r1 + r2;
            r1 = r2;
            r2 = result;
            num++;
        }
        return num;//返回结果
    }

    public static void main(String[] args) {
        System.out.println("请输入n值：");
        Scanner s = new Scanner(System.in);//从键盘输入
        int n;
        int num=0;
        n = s.nextInt();
        double startTimeDAC = System.currentTimeMillis();
        //System.out.println(Fibonacci(n));
        Fibonacci(n);
        double endTimeDAC = System.currentTimeMillis();
        System.out.println("递归法执行次数：" + Fibonacci(n)/2 + "次");
        System.out.println("递归法执行时间：" + (endTimeDAC - startTimeDAC) + "ms");//测试时间
        double startTimeDP = System.currentTimeMillis();
        System.out.println("动态规划法执行次数：" + f(n)+ "次");
        double endTimeDP = System.currentTimeMillis();
        System.out.println("动态规划法执行时间：" + (endTimeDP - startTimeDP) + "ms");//测试时间
    }
}
