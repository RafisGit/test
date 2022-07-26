
package javaapplication13;

import java.util.Scanner;


public class JavaApplication13 {

 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int a;
        int i=0;
        int [][]b = new int[100][2];
        for(i=0; i<100; i++){
            b[i][0] = i+1;
            b[i][1] = 0;
          }
        while(true){
            a = in.nextInt();
            if(a==0) break;
            for(int j=0; j<100; j++){
                if(a==b[j][0]) {b[j][1]++; break;}  
            }
        }
        for(i=0; i<100; i++){
            if(b[i][1]==0) continue;
            if(b[i][1]==1) System.out.println(b[i][0]+" occurs "+ b[i][1] +" time ");
            else System.out.println(b[i][0]+" occurs "+ b[i][1] +" times");

        }
    }
}
    
    

