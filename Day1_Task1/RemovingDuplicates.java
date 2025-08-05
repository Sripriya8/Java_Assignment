import java.util.Scanner;
public class RemovingDuplicates{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int uniqueArr[] = new int[size];
        int uniqueCount = 0;

        for(int i=0;i<size;i++){
            boolean isfound = false;
            for(int j=0;j<uniqueCount;j++){
                if(arr[i] == uniqueArr[j]){
                    isfound = true;
                    break;
                }
            }

            if(!isfound){
                uniqueArr[uniqueCount++] = arr[i];
            }
        }

        System.out.println("The array after removing duplicates is");
        for(int i=0;i<uniqueCount;i++){
            System.out.print(uniqueArr[i]+" ");
        }
    }
}