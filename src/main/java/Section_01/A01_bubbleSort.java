package Section_01;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class A01_bubbleSort {

    int[] a = new int[]{10,9,8,7,6,5,4,3,2,1};

    public A01_bubbleSort(){

        int swap;
        for (int i=0;i<a.length;i++){
            swap=0;
            for (int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    swap = 1;
                }
                if(swap==0)
                    break;
            }
        }
        System.out.println(Arrays.toString(a));

    }

}
