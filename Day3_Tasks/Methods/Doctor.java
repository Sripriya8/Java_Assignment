import java.util.Scanner;
public class Doctor{

    String name;
    String specialization;
    public Doctor(String name, String specialization){
        this.name = name;
        this. specialization = specialization;
    }

    //1. details.
    public void doctor_details(){
        System.out.println(String.format("Name : %s", name));
        System.out.println(String.format("Specialization : %s", specialization));
    }

    //2. BMI Calculation
    public float bmi_calulation(float weight, float height){
        if(height<=0){
            System.out.println("Height cannot by less than or equal to 0\n");
            return 0;
        }
        return (weight)/(height*height);
    }

   //3. Health Status.
    public void health_status(float bmi){
        if(bmi >= 40.0)   System.out.println("Obesity Class III\n");
        else if(bmi>=35 && bmi<=39.9)  System.out.println("Obesity Class II\n");
        else if(bmi>=30 && bmi<=34.9)  System.out.println("Obesity Class I\n");
        else if(bmi>=25 && bmi<=29.9)  System.out.println("Over Weight\n");
        else if(bmi>=18.5 && bmi<=24.9)  System.out.println("Normal Weight\n");
        else  System.out.println("Under Weight\n");
    }

    //4. Admission
    public boolean needAdmission(String symptoms[]){
        String[] seriousSymptoms = {"high fever", "shortness of breath", "chest pain", "loss of consciousness"};

        for(String str: symptoms){
            for(String serious: seriousSymptoms){
                if(str.equalsIgnoreCase(serious)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Doctor obj = new Doctor("Dr. Arthi Sharma", "Cardiologist");

        //1. Doctor details method.
        obj.doctor_details();

        System.out.print("Enter weight in kg: ");
        float weight = sc.nextFloat();
        System.out.print("Enter height in meters: ");
        float height = sc.nextFloat();

        //2. BMI Calculation method.
        float bmi = obj.bmi_calulation(weight, height);
        System.out.println(String.format("BMI = %.2f\n", bmi));

        //3. Health status based on BMI.
        obj.health_status(bmi);

        String symptoms[] = {"cough", "high fever", "headache"};

        //4. Need Admission method.
        boolean isRequired = obj.needAdmission(symptoms);
        if(isRequired) System.out.println("Yes, admission is needed.\n");
        else  System.out.println("Admission is not needed.\n");

    }
}