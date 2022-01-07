package class01;

import java.util.Arrays;

public class SumTwoInt {
    public static void main(String[] args) {
        SumTwoInt s= new SumTwoInt();
        System.out.println(Arrays.toString(s.sumTwo(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));
    }

    public int[] sumTwo(int[] a, int target){
        int[] ar=new int[2];
//        for(int i=0; i<a.length; i++){
//            for(int j=0; j<a.length; j++){
//                if(i!=j) {
//                    if (a[i] + a[j] == target) {
//                        ar[0] = a[i];
//                        ar[1] = a[j];
//                        return ar;
//                    }
//                }
//            }
//        }
        int prev=0;
        for(int i=1; i<a.length; i++){

            if(i==(a.length-1-prev)){
                continue;
            }
            else{
                if(a[prev]+a[prev+i]==target){
                     ar[0]=a[prev];
                     ar[1]=a[prev+i];
                     return ar;

                }
                else prev++;
            }


          return null;
        }
    }
}
