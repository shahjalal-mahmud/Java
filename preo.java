import java.util.Scanner;
public class preo {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        //size and elements of 1st array
        System.out.print("Enter the size of 1st array= ");
        int n1=input.nextInt();
        int[] arr1= new int[n1];
        int i;
        System.out.println("1st Array: ");
        for(i=0;i<n1 ;i++){
        System.out.print("Enter elemnts of array= " );
        arr1[i]=input.nextInt();
        }
        
        //size and elements of 2nd array
        System.out.print("Enter the size of 2nd array= ");
        int n2=input.nextInt();
        int[] arr2= new int[n2];
        System.out.println("2nd Array: ");
        for(i=0;i<n2 ;i++){
        System.out.print("Enter elemnts of 2nd array= " );
        arr2[i]=input.nextInt();
        }
        //create a merged array
        int[] mergedArray=new int[n1+n2];

        for(i=0;i<n1;i++){
            mergedArray[i]=arr1[i];
        }
        for(i=0;i<n2;i++){
            mergedArray[n1+i]=arr2[i];
        }
        System.out.println("Merged Array: " + mergedArray);
    }

}