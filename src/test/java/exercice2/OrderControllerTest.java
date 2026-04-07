package exercice2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class OrderControllerTest {

    // ✅ INJECTION DE DÉPENDANCE : Mockito injecte les mocks automatiquement
    @Mock
    OrderService orderService;  // mock de l'interface

    @Mock
    OrderDao orderDao;          // mock de l'interface

    @Test
    void testCreateOrder_viaController() {
        Order order = new Order(1, "Laptop");

        // Injection : on passe le mock au controller
        OrderController controller = new OrderController(orderService);

        controller.createOrder(order);

        // ✅ VERIFY : vérifie que orderService.createOrder a été appelé
        verify(orderService).createOrder(order);
    }

    @Test
    void testCreateOrder_viaService() {
        Order order = new Order(1, "Laptop");

        // Injection : on passe le mock au service
        OrderService service = new OrderServiceImpl(orderDao);

        service.createOrder(order);

        // ✅ VERIFY : vérifie que orderDao.saveOrder a été appelé
        verify(orderDao).saveOrder(order);
    }
}