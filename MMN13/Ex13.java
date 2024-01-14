
/**
 * Write a description of class Ex13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Ex13
{
    public static int maxMult3 (int [] arr){

        int max = 0;
        int[] sortArr =  arr;
        Arrays.sort(sortArr);

        for ( int i = 0 ; i< arr.length - 1 ; i++){
            int temp = sortArr[i] * sortArr[i + 1] * sortArr[arr.length - 1];
            max = temp >= max? temp : max;
        }

        return max;

    }
    public static int findMedian (int[] arr1, int[] arr2){
        int[] concateArr = new int[arr1.length + arr2.length];
        int index;

        for(index = 0; index <=  arr1.length -1 ; index ++){
            concateArr[index] = arr1[index];
            
        }
      
       for(index = 0  ; index <= arr2.length -1 ; index ++){
            concateArr[arr1.length +index] = arr2[index];
        }
        
        Arrays.sort(concateArr);

        return (concateArr[concateArr.length / 2] + concateArr[concateArr.length / 2 - 1]) / 2;

    }
    
    public static String minimalSt(String st1, String st2){
    }
}
