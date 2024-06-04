public class Main {
    // Human weight - вес человека.
    // Human height - рост человека
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int humanWeight = 79;
        double humanHeight = 1.65;
        int bmi = (int) service.calculate(humanWeight, humanHeight);
        System.out.println("Индекс массы вашего тела равен " + bmi);


    }
}