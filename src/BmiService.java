public class BmiService {

    public double calculate(int kg, double rost) {

        // Формула ИМТ - Например, масса человека = 74 кг, рост = 172 см. Следовательно, индекс массы тела в этом случае равен:
        // ИМТ = 74 : (1,722 в квадрате) ≈ 25,01 кг/м²
        // heightSquared - Высота в квадрате переводится.

        double bmi;
        double heightSquared = Math.pow(rost, 2);
        bmi = kg / heightSquared;

        return bmi;
    }

}

