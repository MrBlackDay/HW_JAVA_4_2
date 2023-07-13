// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        int index = bmi.calculate(1.90, 90);

        System.out.println("BMI:" + index);
    }
}