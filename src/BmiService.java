public class BmiService {

    public double calculate(int humanWeight, double humanHeight) {

        // Формула ИМТ - Например, масса человека = 74 кг, рост = 172 см. Следовательно, индекс массы тела в этом случае равен:
        // ИМТ = 74 : (1,722 в квадрате) ≈ 25,01 кг/м²
        // heightSquared - Высота в квадрате.

        double bmi;
        double heightSquared = Math.pow(humanHeight, 2);
        bmi = humanWeight / heightSquared;

        return bmi;
    }

}

