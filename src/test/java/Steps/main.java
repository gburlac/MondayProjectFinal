package Steps;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //123456789012
        //279146358279
        int[] ar1 ={1,2,3,4,5,6,7,8,9,0,1,2};
        int[] ar2={2,7,9,1,4,6,3,5,8,2,7,9};
         int sum=0;
        for (int i=0; i<ar1.length;i++){
            sum=sum +(ar1[i]*ar2[i]);
        }
        int r =sum%11;
        System.out.println(r);




    }
}
