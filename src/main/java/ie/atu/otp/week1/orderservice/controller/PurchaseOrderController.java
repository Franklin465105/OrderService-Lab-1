package ie.atu.otp.week1.orderservice.controller;

import ie.atu.otp.week1.orderservice.model.PurchaseOrder;
import ie.atu.otp.week1.orderservice.service.PurchaseOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/orders")
public class PurchaseOrderController {
    private final PurchaseOrderService service;
    public PurchaseOrderController(PurchaseOrderService service) {
        this.service = service;
    }
    @GetMapping
    public List<PurchaseOrder> getAll() {
        return service.getAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PurchaseOrder create(@RequestBody PurchaseOrder order) {
        return service.create(order);
    }
}

