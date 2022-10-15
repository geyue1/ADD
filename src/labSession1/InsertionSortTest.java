package labSession1;

import java.util.Arrays;

public class InsertionSortTest {

    public static void sort(int[] array){
        int temp;
        for(int i=0;i<array.length-1;i++){
            for(int j=i;j>=0;j--){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] array = {1,3,9,2,4,2,1,24,10,6,15,8};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
