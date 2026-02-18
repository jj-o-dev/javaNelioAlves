package section12.ex01.entities;

import section12.ex01.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> itemList = new ArrayList<>();

    private DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(Client client, LocalDateTime moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }



    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }


    public void addItem(OrderItem item) {
        itemList.add(item);
    }

    public void removeItem(OrderItem item) {
        itemList.remove(item);
    }

    public Double total() {
        Double amount = 0.0;
        for (OrderItem item: itemList) {
            amount += item.subTotal();
        }
        return amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(getMoment().format(form2)).append("\n");
        sb.append("Order status: ").append(getStatus()).append("\n");
        sb.append("Client: ").append(client.toString()).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item: itemList) {
            sb.append(item.toString());
        }
        sb.append("Total price: $").append("%.2f".formatted(total()));
        return sb.toString();
    }
}
