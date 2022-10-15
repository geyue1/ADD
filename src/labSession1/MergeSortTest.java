package labSession1;

import java.util.Arrays;

public class MergeSortTest {

    public static void sort(int[] array,int startIndex,int endIndex){

        if(startIndex>=endIndex)return;

        int length = array.length;
        int middleIndex = (startIndex+endIndex)/2;
        sort(array,startIndex,middleIndex);
        sort(array,middleIndex+1,endIndex);

        merge(array,startIndex,middleIndex,endIndex);

    }
    public static void merge(int[] array,int start,int middile,int end){
        int[] leftArray = new int[middile+1-start];
        int[] rightArray = new int[end-middile];
        for(int i=0;i<leftArray.length;i++){
            leftArray[i] = array[i+start];
        }
        for(int i=0;i<rightArray.length;i++){
            rightArray[i] = array[i+middile+1];
        }

        int i=0;
        int j=0;
        int index =start;
        while(i<leftArray.length && j<rightArray.length){
            if(leftArray[i]<rightArray[j]){
                array[index]=leftArray[i];
                index++;
                i++;
            }else{
                array[index]= rightArray[j];
                index++;
                j++;
            }
        }

        while(i>=leftArray.length && j<rightArray.length){
            array[index] = rightArray[j];
            index++;
            j++;
        }
        while(j>=rightArray.length && i<leftArray.length){
            array[index] = leftArray[i];
            index++;
            i++;
        }
    }
    public static void main(String[] args){
        int[] array = {15,3,18,9,10,0,23,12,102,98,13};
        sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
