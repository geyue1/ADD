package labSession1;

import java.util.Arrays;

/**
 * @author yge
 * @create 20221015 14:34:51
 * @description
 */

public class SelectionSortTest {

    public static void sort(int[] array){
        int minimum;
        int minimumIndex;
        for(int i=0;i<array.length;i++){
            minimum = array[i];
            minimumIndex = i;
            for(int j=1+i;j<array.length;j++){
                if(minimum>array[j]){
                    minimum = array[j];
                    minimumIndex = j;
                }
            }
            array[minimumIndex] = array[i];
            array[i] = minimum;
        }
    }
    public static void main(String[] args){
       int[] array = {1,4,2,10,15,8,9,2,4,6,197,28};
       sort(array);
       System.out.println(Arrays.toString(array));
    }
}
