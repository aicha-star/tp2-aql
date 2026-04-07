package exercice3;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @Test
    void testSuccess() {
        ProductApiClient api = mock(ProductApiClient.class);

        when(api.getProduct("1")).thenReturn(new Product("1"));

        ProductService service = new ProductService(api);

        Product p = service.getProduct("1");

        assertEquals("1", p.getId());

        verify(api).getProduct("1");
    }

    @Test
    void testApiFailure() {
        ProductApiClient api = mock(ProductApiClient.class);

        when(api.getProduct("1")).thenThrow(new RuntimeException());

        ProductService service = new ProductService(api);

        assertThrows(RuntimeException.class, () -> {
            service.getProduct("1");
        });

        verify(api).getProduct("1");
    }
}