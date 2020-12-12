public class BmiService {
    public float calculate(int mass, float height) {
        float bmi = (mass/(height*height));
        return bmi;
    }
}
