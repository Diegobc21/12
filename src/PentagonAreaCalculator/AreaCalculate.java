package PentagonAreaCalculator;

public class AreaCalculate {
    public static double calculate(int sides, int size){
        double result;
        result = ((sides*size*size)/(2*1.45308506));

        return result;
    }
}
