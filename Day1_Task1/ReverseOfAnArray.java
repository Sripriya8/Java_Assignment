import java.util.Scanner;
public class ReverseOfAnArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements before reversing");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();


        for(int i=0, j=size-1; i<j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("Elements after reversing");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}