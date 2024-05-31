public class Main {
    public static void main(String[] args) {


        BmiService service = new BmiService();
        int kg = 79;
        double rost = 1.65;
        int bmi = (int) service.calculate(kg, rost);
        System.out.println("Индекс массы вашего тела равен " + bmi);


    }
}