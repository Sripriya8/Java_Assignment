import java.util.Scanner;
public class Car{
    
    String brand;
    String model;
    float price;
    public Car(String brand, String model, float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    //1. details
    public void car_details(){
        System.out.println("Brand : "+ brand);
        System.out.println("Model : "+ model);
        System.out.println("Price : "+ price);
    }

   //2. Mileage
    public float mileage(float fuel, float distance){
        if(fuel <= 0){
            System.out.println("Fuel must be greater than 0");
            return 0;
        }
        return distance/fuel;
    }

    //3. maintenance
    public void maintenance_alert(float distance){
        if(distance > 5000.0)
            System.out.println("Vehicle has travelled more than 5000km. Service is required.\n");
        else
            System.out.println("Distance is within the limit.\n");
    }

    //4. resaleAmount
    public float resaleAmount(float actualPrice, float depricationPrice){
        if(depricationPrice > actualPrice){
            System.out.println("Deprication price cannot be greaer than Actual price.");
            return 0;
        }
        return actualPrice - depricationPrice;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Car obj = new Car("BMW", "3 Series", 3960000);

        //1. Car details.
        obj.car_details();

        System.out.print("Enter distance travelled in km: ");
        float distance = sc.nextFloat();
        System.out.print("Enter fuel consumed in litres: ");
        float fuel = sc.nextFloat();

        //2. Mileage based on fuel and distance.
        float mileage = obj.mileage(fuel,distance);
        System.out.println(String.format("Mileage = %.2f km/l\n", mileage));

        //3. Maintenance Alert method.
        obj.maintenance_alert(distance);

        //4. Resale price.
        float actualPrice = 3960000.0f;
        float depricationPrice = 2000000.0f;
        float resalePrice = obj.resaleAmount(actualPrice, depricationPrice);
        System.out.println(String.format("The resale price = %.2f",resalePrice));
    }
}