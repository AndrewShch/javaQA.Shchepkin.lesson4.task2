public class Main {
    public static void main(String[] args) {
        // Вес в кг, рост в см
        BmiService service = new BmiService();
        double bmi = service.calculate(90,210);
        System.out.println("Индекс массы тела равен " + bmi);
    }
}
