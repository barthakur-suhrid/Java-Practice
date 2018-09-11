package guru.springframework.unittest.quickstart;

import java.util.Arrays;

public class StringSortAdd {

    public int SortAdder(String str){
        int sum=0;
        int n=str.length();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            try {
                int temp = Character.digit(str.charAt(i), 10);
                if(temp <0){
                    throw new Exception();
                }
                arr[i] = temp;
                if (temp % 2 == 0) {
                    sum += temp;
                }
            }catch(Exception e){
                System.out.println("Illegal input in " + (i+1) + "th position : Use integer value only");
            }
        }
        System.out.println();
        new StringSortAdd().Sorter(arr);
        System.out.println("\n" + "Sum of even numbers " + sum);
        new StringSortAdd().SumChecker(sum);
        return sum;


    }

    public int[] Sorter(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int temp[]=new int[n];
        System.out.print("Sorted array in non-increasing order :");
        for (int i=n-1; i >= 0; i--) {
            temp[n-1-i]=arr[i];
            System.out.print(arr[i]);
        }
        return temp;

    }
    public boolean SumChecker(int sum){

        if (sum > 15) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
