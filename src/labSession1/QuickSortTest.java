package labSession1;

import java.util.Arrays;

public class QuickSortTest {
    public static void sort(int[] array,int startIndex,int endIndex){

        if(endIndex-startIndex<=1)return;

        int temp;
        int i = startIndex;
        int j = endIndex;
        int index = array[i];
        while(j-i>1){
            while(i<j && array[j]>=index){
                j--;
            }

            while(i<j && array[i]<=index){
                i++;
            }

            if(i<j){
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }


            temp = index;
            array[startIndex] = array[i];
            array[i] = temp;

        sort(array,startIndex,i-1);
        sort(array,j+1,endIndex);
    }
    public static void main(String[] args){
        int[] array = {2,4,2,10,5,9,2,1,6,9,25,30,1,4};
        sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

    }
}
