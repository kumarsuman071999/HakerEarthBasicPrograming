//You are provided an array
// Array of size N
// that contains non-negative integers. Your task is to determine whether the number that is formed
// by selecting the last digit of all the N numbers is divisible by 10
//

import java.util.*;
import java.lang.Math;
public class Divisibility {
    public static  void main(String[] args ){

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();

        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }


        int lastDigit=data[N-1] %10;
        if(N==1 && lastDigit==0){
            System.out.println("No");
        }
        else if(lastDigit==0){
            System.out.println("Yes");
        }

        else{
            System.out.println("No");
        }



    }
}
