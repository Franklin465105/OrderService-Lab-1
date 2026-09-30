package ie.atu.otp.week1.orderservice.service;

import ie.atu.otp.week1.orderservice.client.CatalogClient;
import ie.atu.otp.week1.orderservice.model.PurchaseOrder;
import ie.atu.otp.week1.orderservice.repository.PurchaseOrderRepository;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@EnableFeignClients
public class PurchaseOrderService {
    private final PurchaseOrderRepository repository;
    private final CatalogClient catalogClient;
    public PurchaseOrderService(PurchaseOrderRepository repository, CatalogClient catalogClient)
    {
        this.repository = repository;
        this.catalogClient = catalogClient;
    }
    public List<PurchaseOrder> getAll()
    {
        return repository.findAll();
    }
    public PurchaseOrder create(PurchaseOrder order)
    {
        order.setId(null);
        return repository.save(order);
    }

    public String testCatalogConnection(Long productId)
    {
        return catalogClient.getProductbyId(productId);
    }
}
