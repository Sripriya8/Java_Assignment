import java.util.Scanner;
public class JaggedArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows in an array: ");
        int rows = sc.nextInt();
        int jaggedArr[][] = new int[rows][];
        for(int i=0;i<rows;i++){
            System.out.print(String.format("Enter no.of elements in row-%d: ",(i+1)));
            int col = sc.nextInt();
            int arr[] = new int[col];
            for(int j=0;j<col;j++){
                arr[j] = (int)(Math.random()*100);
            }
            jaggedArr[i] = arr;
        }

        System.out.println("Jagged Array");
        for(int i=0;i<rows;i++){
            for(int j=0;j<jaggedArr[i].length;j++){
                System.out.print(jaggedArr[i][j]+" ");
            }
            System.out.println();
        }

    }
}