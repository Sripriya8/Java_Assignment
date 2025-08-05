import java.util.Scanner;
public class SecondMaxElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();

        if(size < 2){
            System.out.print("Array size should be atleast 2.");
        }

        else{
            int arr[] = new int[size];
            System.out.println("Enter elements");
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }

            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                if(arr[i] > firstMax){
                    secondMax = firstMax;
                    firstMax = arr[i];
                }
                else if(arr[i] > secondMax && (arr[i] != firstMax)){
                    secondMax = arr[i];
                }
            }
            if(secondMax == Integer.MIN_VALUE){
                System.out.println("There is no second largest element. May be all are same elements");
            }
            else {
                System.out.println("The second largest element in the given array is "+ secondMax);
            }
        }
    }
}