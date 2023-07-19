package cl.ecotouch.igmongo.service;

import cl.ecotouch.igmongo.dto.RequestPickupDTO;

import java.util.List;

public interface PickupService {
    void saveRequestPickup(RequestPickupDTO requestPickupDTO);

    List<RequestPickupDTO> getAllOrders();

    List<RequestPickupDTO> getDailyOrders();
}
