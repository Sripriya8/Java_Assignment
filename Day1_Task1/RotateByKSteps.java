import java.util.Scanner;
public class RotateByKSteps{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter no.of rotations need to be performed: ");
        int k = sc.nextInt();
        k = k%size;
        for(int i=0;i<k;i++){
            int temp = arr[size-1];
            for(int j=size-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }

        System.out.println("Array after performing given no.of rotations is");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}