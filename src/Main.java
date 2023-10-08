import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("weight=");
        double weight = scanner.nextDouble();
        System.out.println("height=");
        double  height = scanner.nextDouble();

        if(height>3) {
            double bmi = weight / (Math.pow(height / 100, 2));
            System.out.println("bmi= " + bmi);
            if(bmi<=18.5)System.out.println("недовес");
            else if(bmi<=25) System.out.println("все в норме");
            else if(bmi<=30) System.out.println("лишний вес");
            else if(bmi>30) System.out.println("ожирение");
        }
        else if (height<3) {
            double bmi = weight / (Math.pow(height, 2));
            System.out.println("bmi= " + bmi);
            if(bmi<=18.5)System.out.println("недовес");
            else if(bmi<=25) System.out.println("все в норме");
            else if(bmi<=30) System.out.println("лишний вес");
            else if(bmi>30) System.out.println("ожирение");
    }
}}