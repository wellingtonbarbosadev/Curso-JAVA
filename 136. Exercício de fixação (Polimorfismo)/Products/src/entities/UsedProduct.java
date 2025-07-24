package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%s (used) $ %.2f (Manufacture date: %s)", name, price, manufactureDate.format(dtm));
    }
}
