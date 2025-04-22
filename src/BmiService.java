public class BmiService {
    public int calculate(double weight, double height) {
        int index = (int) (weight / Math.pow(height, 2));
        return index;
    }
}
