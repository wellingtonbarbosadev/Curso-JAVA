package entities;


public class Students {
    public String name;
    public double a1;
    public double a2;
    public double a3;

    public void checkPass() {
        double final_points = a1 + a2 + a3;
        System.out.printf("FINAL GRADE %.2f", final_points);
        System.out.println();
        if (final_points >= 60) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", (60 - final_points));
        }
    }
}
