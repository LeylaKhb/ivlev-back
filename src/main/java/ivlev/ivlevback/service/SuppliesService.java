package ivlev.ivlevback.service;

import ivlev.ivlevback.dto.DepartureCityDTO;
import ivlev.ivlevback.dto.DestinationWarehouseDTO;
import ivlev.ivlevback.dto.SupplyDTO;
import ivlev.ivlevback.models.DepartureCity;
import ivlev.ivlevback.models.DestinationWarehouse;
import ivlev.ivlevback.models.Supply;
import ivlev.ivlevback.models.SupplyTitleType;
import ivlev.ivlevback.repositories.SuppliesRepository;
import ivlev.ivlevback.repositories.SupplyTitleTypesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SuppliesService {
    private final SuppliesRepository suppliesRepository;

    public SuppliesService(SuppliesRepository suppliesRepository) {
        this.suppliesRepository = suppliesRepository;
    }

    public List<SupplyDTO> getAll() {
        List<Supply> supplyList = suppliesRepository.findAll();
        List<SupplyDTO> answerList = new ArrayList<>();
        for (Supply supply : supplyList) {
            SupplyTitleType supplyTitleType = supply.getTitleType();
            String title = supplyTitleType.getTitle();
            List<DestinationWarehouseDTO> warehouses = supplyTitleType.getWarehouses().stream()
                    .map(warehouse -> new DestinationWarehouseDTO(warehouse.getWarehouse()))
                    .toList();
            List<DepartureCityDTO> cities = supplyTitleType.getDepartureCities().stream()
                    .map(city -> new DepartureCityDTO(city.getCity()))
                    .toList();


            SupplyDTO supplyDTO = new SupplyDTO(supply.getDepartureDate(), supply.getAcceptanceDate(), title,
                    warehouses, cities);
            answerList.add(supplyDTO);
        }
        return answerList;
    }
}
