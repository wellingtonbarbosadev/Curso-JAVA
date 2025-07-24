package entities;

public class ImportedProduct extends Product {
    double customFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double totalPrice() {
        return price + customFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Customs fee: $ %.2f)", name, totalPrice(), customFee);
    }
}
