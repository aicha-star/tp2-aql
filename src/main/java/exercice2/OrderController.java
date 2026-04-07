package exercice2;

public class OrderController {

    private OrderService orderService;

    // ✅ INJECTION DE DÉPENDANCE via constructeur
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder(Order order) {
        orderService.createOrder(order);
    }
}