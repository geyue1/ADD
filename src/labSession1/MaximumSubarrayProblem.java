package labSession1;

/**
 * @author yge
 * @create 20221016 13:30:02
 * @description
 */

public class MaximumSubarrayProblem {
   public static void bruteForce(int[] array){
      System.out.println("brute force algorithm");
      int start =0;
      int end = 0;
      int maxSum = 0;
      for(int i=0;i<array.length;i++){
         int sum = array[i];
         if(sum >maxSum){
            maxSum = sum;
            start = i;
            end = i;
         }

         for(int j=i+1;j<array.length;j++){
            sum = sum + array[j];
            if(sum > maxSum){
               maxSum = sum;
               start = i;
               end = j;
            }
         }
      }

      System.out.println("start:"+start+",end:"+end+",maxSum:"+maxSum);
   }
   public static int[] divideAndConquer(int[] array,int leftIndex,int rightIndex,int start,int end,int maxSum){
      int[] result = {start,end,maxSum};
      if(leftIndex>=rightIndex)return result;;

      int middleIndex = (leftIndex+rightIndex)/2;
      divideAndConquer(array,leftIndex,middleIndex,start,end,maxSum);
      divideAndConquer(array,middleIndex+1,rightIndex,start,end,maxSum);

      int sum = 0;
      for(int i=leftIndex;i<=middleIndex;i++){
         sum = array[i]+sum;
         if(sum>maxSum){
            maxSum = sum;
            start = leftIndex;
            end = i;
         }
      }
      sum = 0;
      for(int j=middleIndex+1;j<=rightIndex;j++){
         sum = array[j]+sum;
         if(sum>maxSum){
            maxSum = sum;
            start = middleIndex+1;
            end = j;
         }
      }
      sum = 0;
      int leftSum = 0;
      for(int i=middleIndex;i>=leftIndex;i--){
         leftSum = leftSum+array[i];
         int rightSum = 0;
         for(int j=middleIndex+1;j<=rightIndex;j++){
            rightSum = rightSum+array[j];
            sum = leftSum+rightSum;
            if(sum>maxSum){
               maxSum = sum;
               start = i;
               end = j;
            }
         }
      }

      result = new int[]{start, end, maxSum};
      return result;
   }



   public static void main(String[] args){
      int[] array = {1,-8,9,23,-9,-10,5,54,-34,7};
      bruteForce(array);
      System.out.println("divide-and-conquer algorithm");
      int[] result = divideAndConquer(array,0,array.length-1,0,0,0);
      System.out.println("start:"+result[0]+",end:"+result[1]+",maxSum:"+result[2]);

   }
}

class MaximumSubarray{
   private int start;
   private int end;
   private int sum;

   public MaximumSubarray(int start, int end, int sum) {
      this.start = start;
      this.end = end;
      this.sum = sum;
   }

   public int getStart() {
      return start;
   }

   public void setStart(int start) {
      this.start = start;
   }

   public int getEnd() {
      return end;
   }

   public void setEnd(int end) {
      this.end = end;
   }

   public int getSum() {
      return sum;
   }

   public void setSum(int sum) {
      this.sum = sum;
   }

   @Override
   public String toString() {
      return "MaximumSubarray{" +
              "start=" + start +
              ", end=" + end +
              ", sum=" + sum +
              '}';
   }
}