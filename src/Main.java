public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 65.3;
        double height = 1.72;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);

    }
}