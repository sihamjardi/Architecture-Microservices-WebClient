package ma.siham.vehicle.web;

import ma.siham.vehicle.domain.Vehicle;
import ma.siham.vehicle.repository.VehicleRepository;
import ma.siham.vehicle.service.CustomerClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleRepository repository;
    private final CustomerClient customerClient;

    public VehicleController(VehicleRepository repository, CustomerClient customerClient) {
        this.repository = repository;
        this.customerClient = customerClient;
    }

    @PostMapping
    public Vehicle save(@RequestBody Vehicle vehicle) {
        return repository.save(vehicle);
    }

    @GetMapping
    public List<Vehicle> getAll() {
        List<Vehicle> vehicles = repository.findAll();

        for (Vehicle v : vehicles) {
            // Sécurité indispensable
            if (v.getCustomerId() != null) {
                v.setCustomer(
                        customerClient.getCustomerById(v.getCustomerId())
                );
            }
        }
        return vehicles;
    }

}