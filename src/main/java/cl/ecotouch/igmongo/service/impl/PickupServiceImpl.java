package cl.ecotouch.igmongo.service.impl;

import cl.ecotouch.igmongo.dto.RequestPickupDTO;
import cl.ecotouch.igmongo.repository.RequestRepository;
import cl.ecotouch.igmongo.service.PickupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PickupServiceImpl implements PickupService {

    private final RequestRepository requestRepository;

    @Override
    public void saveRequestPickup(RequestPickupDTO requestPickupDTO) {
        log.info(requestPickupDTO.toString());
        requestRepository.save(requestPickupDTO);
    }

    @Override
    public List<RequestPickupDTO> getAllOrders() {
        return requestRepository.findAll();
    }

    @Override
    public List<RequestPickupDTO> getDailyOrders() {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String currentFormattedDate = sdf.format(currentDate);
        return requestRepository.findByDateTimeScheduledLike(currentFormattedDate);
    }
}
