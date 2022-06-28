import java.util.*;

public class SortTesting {
    public static void main(String[] args) {
        //ArrayList n = new ArrayList();
        List<Integer> n = new ArrayList<Integer>();
        //int[] n = new int[0];
        int BubbleNum=0;
        int MergeNum=0;
        int QuickNum=0;
            Random r = new Random();
            Scanner x = new Scanner(System.in);//构造一个Scanner对象，其传入参数为System.in
            System.out.println("请输入要生成的随机数的个数:");
            int i = x.nextInt();//读取一个int数值
            for(int j=0;j<i;j++){
                n.add(r.nextInt());
                //n[j]=r.nextInt();
            }
        int[] arr = n.stream().mapToInt(y -> y).toArray();
            Bubble B=new Bubble();
            BubbleNum=B.BubbleSort(arr,BubbleNum);
        System.out.println("冒泡算法比较操作执行"+BubbleNum+"次");
        Quick Q=new Quick();
        QuickNum=Q.QuickSort(arr, 0, arr.length-1,QuickNum);
        System.out.println("快速算法比较操作执行"+QuickNum+"次");
        Q.printQ();
        int[] temp=new int[arr.length];
        Merge M=new Merge();
        MergeNum=M.MergeSort(arr,0,arr.length-1,temp, MergeNum);
        System.out.println("合并算法比较操作执行"+MergeNum+"次");
        M.printM();
    }
}
class Bubble{
    int BubbleSort(int arr[],int BubbleNum){
        for (int i = 0; i < arr.length - 1; i++) {
            // 比较相邻两个元素，较大的数往后冒泡
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j + 1]; // 把第一个元素值保存到临时变量中
                    arr[j + 1] = arr[j]; // 把第二个元素值转移到第一个元素变量中
                    arr[j] = (int) temp; // 把临时变量（第一个元素的原值）保存到第二个元素中
                    BubbleNum++;
                }
            }
        }
        return BubbleNum;
    }
}
class Merge{
    int MergeRecuNum=-1;
    int MergeSort(int arr[],int left,int right,int[] temp,int MergeNum){
        MergeRecuNum++;
            int mid = (left + right) / 2;
            if (left < right) {
                MergeNum+=merge(arr, left ,mid, right, temp, MergeNum);
                //左边递归分解
                MergeSort(arr, left, mid, temp,MergeNum);
                //右边递归分解1
                MergeSort(arr,mid + 1, right, temp, MergeNum);
            }
            return  MergeNum;
        }
        void printM(){
            System.out.println("合并算法递归操作执行"+MergeRecuNum+"次");
        }
/**
 *
 * @param arr  排序的原始数组
 * @param left  左边有序序列的初始索引
 * @param mid   中间索引
 * @param right    右边索引
 * @param temp    做中转的数组
 */
        //4 5 7 8   1 2 3 6
        public static int merge(int[] arr,int left,int mid,int right,int[] temp, int MergeNum) {
            int i=left;  //初始i,左边有序序列的初始索引
            int j=mid+1;  //初始j,右边有序序列的初始索引
            int t=0;       //指向temp数组的当前索引
            //1.
            //先把左右两边(有序)的数据按照规则填充到temp数组
            //直到左右两边的有序序列,有一边处理完毕为止
            while(i<=mid&&j<=right) {
                if(arr[i]<arr[j]) {
                    temp[t]=arr[i++];
                    /**
                     * 这里我们这里是：temp[t]=arr[i++];
                     * 如果不好理解，你可以写成这样：
                     * temp[t]=arr[i];i++;
                     */
                    MergeNum++;
                }
                else {
                    temp[t]=arr[j++];
                }
                //因为无论执行if里面的语句还是else里面的语句,t都要加1,所以把t移出来.
                t++;
            }
            //2.
            //把有剩余数据的一边的的数据依次全部填充到temp
            //由上述循环条件：i<=mid&&j<=right 可知
            //此时要么i>mid 要么j>right
            while(i<=mid) {
                temp[t]=arr[i];
                t++;
                i++;
            }
            while(j<=right) {
                temp[t]=arr[j];
                t++;
                j++;
            }
            //3.
            //把temp的数组转移到arr上
            int n=0;
            int tempLeft=left;
            while(tempLeft<=right){
                arr[tempLeft]=temp[n];
                n++;
                tempLeft++;
            }
            return  MergeNum;
        }
}

class Quick {
    int QuickRecuNum = -1;

    int QuickSort(int[] arr, int low, int high, int QuickNum) {
        QuickRecuNum++;
        int i, j, temp, t;
        if (low > high) {
            return 0;
        }
        i = low;
        j = high;
        //temp就是基准位
        temp = arr[low];
        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
                QuickNum++;
            }
            //再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
                QuickNum++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        QuickSort(arr, low, j - 1,QuickNum);
        //递归调用右半数组
        QuickSort(arr, j + 1, high,QuickNum);
        return QuickNum;
    }
        void printQ () {
            System.out.println("快速算法递归操作执行" + QuickRecuNum + "次");
        }
    }