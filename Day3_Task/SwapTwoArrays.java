import java.util.Scanner;
public class SwapTwoArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the arrays: ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];

        for(int i=0; i<size; i++){
            arr1[i] = (int)(Math.random()*100);
            arr2[i] = (int)(Math.random()*100);
        }

        System.out.println("Elements in Array1 before swapping");
        for(int i=0; i<size; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        System.out.println("Elements in Array2 before swapping");
        for(int i=0; i<size; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        int arr3[] = arr1;
        arr1 = arr2;
        arr2 = arr3;

        System.out.println("Elements in Array1 after swapping");
        for(int i=0; i<size; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        System.out.println("Elements in Array2 after swapping");
        for(int i=0; i<size; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
}