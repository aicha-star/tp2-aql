package exercice2;

public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;

    // ✅ INJECTION DE DÉPENDANCE via constructeur
    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public void createOrder(Order order) {
        orderDao.saveOrder(order);
    }
}