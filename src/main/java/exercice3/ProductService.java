package exercice3;

// ProductService.java
public class ProductService {

    private ProductApiClient apiClient;

    public ProductService(ProductApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public Product getProduct(String productId) {
        return apiClient.getProduct(productId);
    }
}