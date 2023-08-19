package SRP;

public class EmploeeCalculateSalary {

    private int baseSalary;

    public EmploeeCalculateSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }

}
