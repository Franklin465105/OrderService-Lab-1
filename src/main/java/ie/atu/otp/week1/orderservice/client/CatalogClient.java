package ie.atu.otp.week1.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service", url = "http://localhost:8081")
@Service
public interface CatalogClient
{
    @GetMapping("products/{id}")
    String getProductbyId(@PathVariable("id") Long id);
}
