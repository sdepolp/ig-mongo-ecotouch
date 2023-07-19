package cl.ecotouch.igmongo.controller;

import cl.ecotouch.igmongo.dto.RequestPickupDTO;
import cl.ecotouch.igmongo.service.PickupService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/v1/pickup")
public class PickupController {

    private final PickupService pickupService;
    @CrossOrigin("*")
    @PostMapping(value="/submit")
    public ResponseEntity<?> saveRequestPickup(@RequestBody RequestPickupDTO requestPickupDTO){
        pickupService.saveRequestPickup(requestPickupDTO);
        return ResponseEntity.ok().build();
    }

    @CrossOrigin("*")
    @GetMapping(value="/get-all-orders")
    public ResponseEntity<?> getAllOrders(){
        return ResponseEntity.ok(pickupService.getAllOrders());
    }

    @CrossOrigin("*")
    @GetMapping(value="/get-daily-orders")
    public ResponseEntity<?> getDailyOrders(){
        return ResponseEntity.ok(pickupService.getDailyOrders());
    }
}
