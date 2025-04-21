public class BmiService {
    public int calculate (double massа, double height) {
        int index = (int) (massа / Math.pow (height, 2));
        return index;
    }
}
