import java.util.Arrays;
import java.util.Scanner;
public class Problem_10{
    public static void main(String[] args) {
       System.out.println("Name:Afifah Tasnova");
       System.out.println("ID:1532");
       
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the number of elements:");
       int  N=input.nextInt();
       
       int[] number=new int[N];
       System.out.println("Enter elements:");

       for(int i=0;i<N;i++){
            number[i]=input.nextInt();
       }  
       Arrays.sort(number);  
       System.out.print("Enter the Targeted value:");                                                                                                                                           
       int aim=input.nextInt();

       int low=0;
       int high=N-1;
       
       while(low<high){
            if(number[low]+number[high]>aim){
                high--;
            }
            else if(number[low]+number[high]<aim){
                low++;
            }
            else if(number[low]+number[high]==aim){
                System.out.println("Pair:"+number[low]+","+number[high]);
                high--;
                low++;
            }
        }  
    }
}