import java.util.Scanner;
public class Sorting{

    public static void sortIntegerArray(int arr[], int size){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sortStringArray(String str[], int size){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(str[i].compareTo(str[j]) > 0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an integer array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements in an integer array ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter size of a String array: ");
        int size2 = sc.nextInt();
        String str[] = new String[size];
        System.out.println("Enter elements in an String array ");
        for(int i=0; i<size2; i++){
            str[i] = sc.next();
        }

        sortIntegerArray(arr, size);
        sortStringArray(str, size2);

        System.out.println("Elements in an Integer array after sorting");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        
        System.out.println("Elements in a String array after sorting");
        for(String x:str){
            System.out.print(x+" ");
        }
        System.out.println();


        
        
    }
}