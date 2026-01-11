package ma.siham.vehicle.service;

import ma.siham.vehicle.domain.CustomerDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CustomerClient {

    private final WebClient.Builder builder;

    public CustomerClient(WebClient.Builder builder) {
        this.builder = builder;
    }

    public CustomerDTO getCustomerById(Long id) {
        return builder.build()
                .get()
                .uri("http://CUSTOMER-SERVICE/api/customers/" + id)
                .retrieve()
                .bodyToMono(CustomerDTO.class)
                .block(); // acceptable en TP
    }
}
