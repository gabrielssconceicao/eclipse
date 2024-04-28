import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        Order order = new Order(1086, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

    }
}
