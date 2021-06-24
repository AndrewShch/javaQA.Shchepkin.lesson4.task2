public class BmiService {
    public double calculate  (int growth, int weight) {
        double bmi = (double) growth / ((double) weight  * weight / 10000);
        return bmi;
    }
}
