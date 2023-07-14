import java.util.Scanner;

public class EvenNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[]=new int[n];
        int prefixArray[]=new int[n];
        for (int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }
        int rows = scanner.nextInt();
        int range[][]=new int[rows][2];
        for(int i=0;i<rows;i++){
                range[i][0]= scanner.nextInt();
                range[i][1]= scanner.nextInt();
             }
        prefixSum(array,prefixArray,n);

            for (int i=0;i<rows;i++){
                int left=range[i][0];
                int right=range[i][1];
                if(left==0){
                    System.out.println(prefixArray[right]);
                }else{
                    System.out.println(prefixArray[right]-prefixArray[left-1]);
                }
            }


    }
static void prefixSum(int[] array,int[] prefixArray,int n){
    if(array[0]%2==0){
        prefixArray[0]=1;
    }else{
        prefixArray[0]=0;
    }
    for(int i=1;i<n;i++){
        if(array[i]%2==0){
            prefixArray[i]=prefixArray[i-1]+1;
        }else{
            prefixArray[i]=prefixArray[i-1];
        }

    }
}}

