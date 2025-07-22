package entities;

public class OutsourcedEmployee extends Employee{
    private final Double additionalPercent = 1.10;
    private final Double additionalCharge;

    public OutsourcedEmployee(Integer hours, String name, Double valuePerHour, Double additionalCharge) {
        super(hours, name, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }
    public Double getadditionalPercent() {
        return additionalPercent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" - $ ");
        sb.append(String.format("%.2f", (payment() + (additionalCharge * additionalPercent)) ));
        return sb.toString();
    }
}
