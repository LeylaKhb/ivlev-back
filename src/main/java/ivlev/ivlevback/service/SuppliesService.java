package ivlev.ivlevback.service;

import ivlev.ivlevback.models.Supply;
import ivlev.ivlevback.repositories.SuppliesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuppliesService {
    private final SuppliesRepository suppliesRepository;

    public SuppliesService(SuppliesRepository suppliesRepository) {
        this.suppliesRepository = suppliesRepository;
    }

    public List<Supply> getAll() {
        return suppliesRepository.findAll();
    }
}
