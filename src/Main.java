public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 68;
        float height = 1.85;
        float bmi = service.calculate (mass, height);
        System.out.println(bmi);
    }
}
