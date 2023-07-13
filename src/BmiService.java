public class BmiService {
    public int calculate(double height, int weight) {
        double bmi = weight / (height * height); //Расчёт BMI
        return (int) bmi;
    }


}
