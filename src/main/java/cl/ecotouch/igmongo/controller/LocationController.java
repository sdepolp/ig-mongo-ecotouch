package cl.ecotouch.igmongo.controller;

import cl.ecotouch.igmongo.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/v1/location")
public class LocationController {

    private final LocationService locationService;

    @GetMapping(value="/get-all-points")
    public ResponseEntity<?> getAllPoints(){
            return ResponseEntity.ok().body(locationService.getAllLocation());

    }
}
