import java.util.Scanner;
public class MetersToCentimeters{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in meters: ");
        int meters = sc.nextInt();
        int centimeters = meters*100;

        System.out.println(String.format("%d meters = %d centimeters.", meters,centimeters));
    }
}