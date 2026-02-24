package section13.ex01.entities;

public class ImportedProduct extends Product{
    private double customFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    @Override
    public String priceTag() {
        return getName() + String.format(" $ %.2f", getPrice() + getCustomFee()) + String.format(" (Customs Fee: $ %.2f)", getCustomFee());
    }
}
