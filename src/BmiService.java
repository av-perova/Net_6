public class BmiService {

    public int calculate(double weight, double height) {
        double index = weight / Math.pow(height, 2);
        return (int) index;

    }
}
