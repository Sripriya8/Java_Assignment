import java.util.Scanner;
public class MajorityElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        boolean found = false;
        int majorityElement = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            int count = 1;
            for(int j=i+1;j<size;j++){
                if(arr[j]==arr[i]){
                    count++;
                    if(count > size/2){
                        majorityElement = arr[i];
                        found = true;
                        break;
                    }
                }
            }
            if(found == true){
                break;
            }
        }
        if(majorityElement != Integer.MIN_VALUE){
            System.out.println("The majority element in the array is " + majorityElement);
        }
        else{
            System.out.println("There is no majority element");
        }     
    }
}