package ma.siham.customr.web;

import ma.siham.customr.domain.Customer;
import ma.siham.customr.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    // GET /api/customers
    @GetMapping
    public List<Customer> getAll() {
        return repository.findAll();
    }

    // GET /api/customers/1
    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // POST /api/customers
    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return repository.save(customer);
    }
}