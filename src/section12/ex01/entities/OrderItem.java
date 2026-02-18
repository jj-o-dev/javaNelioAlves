package section12.ex01.entities;

public class OrderItem {
    private Integer quantity;
    private Product product;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.toString()).append(", quantity: ").append(getQuantity())
                .append(", Subtotal: $").append("%.2f".formatted(subTotal())).append("\n");
        return sb.toString();
    }
}
