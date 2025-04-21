public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        double massа = 98; // Вес в килограммах
        double height = 1.87; // Рост в метрах
        int index = service.calculate(massа, height);
        System.out.println("Индекс массы тела: " + index);
    }
}