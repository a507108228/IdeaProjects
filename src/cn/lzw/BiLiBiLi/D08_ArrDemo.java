package cn.lzw.BiLiBiLi;

/**
 * @author： lzw
 * @date： 2020/11/20 13:05
 * @description：数组与方法
 */

/*
public class D08_ArrDemo {
    public static void main(String[] args){
        int data[] = new int[] {1,2,3,4,5};
        changeArray(data);
        printArray(data);
    }

    private static void changeArray ( int[] arr ) {
        for(int x = 0;x<arr.length;x++){
            arr[x] *= 2;
        }
    }

    private static void printArray ( int[] temp ) {
        for(int t : temp){
            System.out.println(t);
        }                                   // int x = 0;x<temp.length;x++
    }


}
*/
class Array{
    private int sum;
    private int avg;
    private int max;
    private int min;
    public Array(int data []){
        this.max = data[0];
        this.min = data[0];
        for(int x = 0;x<data.length;x++){
            if(data[x]>max){
                this.max = data[x];
            }
            if(data[x]<min){
                this.min = data[x];
            }
            this.sum += data[x];
        }
        this.avg = this.sum /data.length;
    }

    public int getSum ( ) {
        return sum;
    }

    public void setSum ( int sum ) {
        this.sum = sum;
    }

    public int getAvg ( ) {
        return avg;
    }

    public void setAvg ( int avg ) {
        this.avg = avg;
    }

    public int getMax ( ) {
        return max;
    }

    public void setMax ( int max ) {
        this.max = max;
    }

    public int getMin ( ) {
        return min;
    }

    public void setMin ( int min ) {
        this.min = min;
    }
}

public class D08_ArrDemo {
    public static void main(String[] args) {
        int data[] = new int[] { 1 , 2 , 3 , 4 , 5 };
        Array arr = new Array ( data );
        System.out.println("数组最大值："+arr.getMax ());
        System.out.println("数组最小值："+arr.getMin ());
        System.out.println("数组平均值："+arr.getAvg ());
        System.out.println("数组值总和："+arr.getSum ());

    }
}