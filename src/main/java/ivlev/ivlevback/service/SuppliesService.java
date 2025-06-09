package ivlev.ivlevback.service;

import ivlev.ivlevback.dto.DepartureCityDTO;
import ivlev.ivlevback.dto.DestinationWarehouseDTO;
import ivlev.ivlevback.dto.SupplyDTO;
import ivlev.ivlevback.models.Supply;
import ivlev.ivlevback.models.SupplyTitleType;
import ivlev.ivlevback.repositories.SuppliesRepository;
import ivlev.ivlevback.repositories.SupplyTitleTypesRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SuppliesService {
    private final SuppliesRepository suppliesRepository;
    private final SupplyTitleTypesRepository supplyTitleTypesRepository;

    public SuppliesService(SuppliesRepository suppliesRepository, SupplyTitleTypesRepository supplyTitleTypesRepository) {
        this.suppliesRepository = suppliesRepository;
        this.supplyTitleTypesRepository = supplyTitleTypesRepository;
    }

    public List<SupplyDTO> getAll() {
        List<Supply> supplyList = suppliesRepository.findAllAndOrder();
        List<SupplyDTO> answerList = new ArrayList<>();
        for (Supply supply : supplyList) {
            if (supply.isVisible()) {
                SupplyTitleType supplyTitleType = supply.getTitleType();
                answerList.add(getSupplyDTO(supplyTitleType, supply));
            }
        }
        return answerList;
    }

    private SupplyDTO getSupplyDTO(SupplyTitleType supplyTitleType, Supply supply) {
        String title = supplyTitleType.getTitle();
        List<DestinationWarehouseDTO> warehouses = supplyTitleType.getWarehouses().stream()
                .map(warehouse -> new DestinationWarehouseDTO(warehouse.getWarehouseName(),
                        warehouse.getStore(), warehouse.getSendCity()))
                .toList();
        List<DepartureCityDTO> cities = supplyTitleType.getDepartureCities().stream()
                .map(city -> new DepartureCityDTO(city.getCity()))
                .toList();
        return new SupplyDTO(supply.getDepartureDate(), supply.getAcceptanceDate(), title,
                warehouses, cities);
    }

    public SupplyDTO findByDepartureDateAndSendCity(LocalDate departureDate, String title) {
        SupplyTitleType supplyTitleType = supplyTitleTypesRepository.findByTitle(title);
        Supply supply;
        if (title.equals("Чапаевск(OZON)/Преображенка (OZON,ЯМ,WB)") || title.equals("Новосемейкино")
                || title.equals("Забор с ТК") || title.equals("Новосемейкино/Забор с ТК")) {
            supply = suppliesRepository.findByTitleType(supplyTitleType);
        } else {
            supply = suppliesRepository.findByDepartureDateAndTitleType(departureDate, supplyTitleType);
        }
        if (supply == null) return null;
        return getSupplyDTO(supplyTitleType, supply);
    }


}
