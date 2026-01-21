
import java.util.Scanner;

class PrefixSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={54,23,67,89,67,12};
        System.out.print("Enter the index:");
        int n=sc.nextInt();

        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=arr[i];
        }
        System.out.println("Prefix Sum at index "+n+": "+sum);
    }
}