package ie.atu.otp.week1.orderservice.service;

import ie.atu.otp.week1.orderservice.model.PurchaseOrder;
import ie.atu.otp.week1.orderservice.repository.PurchaseOrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PurchaseOrderService {
    private final PurchaseOrderRepository repository;
    public PurchaseOrderService(PurchaseOrderRepository repository)
    {
        this.repository = repository;
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
}
