/*

Author@ unshah

 */
package dec_to_bin;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Dec_to_bin {
static int a=1,i,j,in, out, rem,quo,swap, bitin, temp;
    public static void main(String[] args) {
        
        input();
        con();
        
    }
    
    static void input(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the decimal you wish to convert : ");
        in = input.nextInt();
        
        if(in>2147483647){
        System.out.println("Please enter a smaller numer");   
        }
        else{
        System.out.print("Please enter the number of bits you would like to see the answer in : ");
        bitin = input.nextInt();
        }
    }

    static int con(){
      int [] bin = new int[bitin];
            for(i=0; i<bitin;i++){
                j = bitin;
                quo = in/2;
                swap = quo;
                rem  = in%2;
                in = swap;
                bin[i]=rem;
                
            }
        System.out.println();
        
        for(int i=0; i<bin.length/2; i++){
            int temp = bin[i];
            bin[i] = bin[bin.length -i -1];
            bin[bin.length -i -1] = temp;
        }
        
        for (int a=0;a<bitin;a++){
                System.out.print(bin[a]+" ");
            }
    return rem;
    }
   
    
}

