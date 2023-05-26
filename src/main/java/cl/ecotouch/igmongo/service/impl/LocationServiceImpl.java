package cl.ecotouch.igmongo.service.impl;

import cl.ecotouch.igmongo.dto.LocationDTO;
import cl.ecotouch.igmongo.repository.LocationRepository;
import cl.ecotouch.igmongo.service.LocationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    @Override
    public List<LocationDTO> getAllLocation() {
        return locationRepository.findAll();
    }
}
