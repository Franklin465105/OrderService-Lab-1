package ie.atu.otp.week1.orderservice.repository;

import ie.atu.otp.week1.orderservice.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {

}
