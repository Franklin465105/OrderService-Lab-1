package ie.atu.otp.week1.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Catalog Service", url = "https://localhost:8081")
public interface CatalogClient
{
    @GetMapping("products/{id}")
    String getProductbyId(@PathVariable("id") Long id);
}
