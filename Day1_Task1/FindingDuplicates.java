import java.util.Scanner;
public class FindingDuplicates{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            boolean isVisited = false;
            for(int j=0;j<i;j++){
                if(arr[j]==arr[i]){
                    isVisited=true;
                    break;
                }
            }
            if(isVisited) continue;

            for(int j=i+1; j<size; j++){
                if(arr[j]==arr[i]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}