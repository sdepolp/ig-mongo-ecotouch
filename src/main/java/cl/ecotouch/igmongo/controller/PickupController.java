package cl.ecotouch.igmongo.controller;

import cl.ecotouch.igmongo.dto.RequestPickupDTO;
import cl.ecotouch.igmongo.service.PickupService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;

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
        try{
            return ResponseEntity.ok(pickupService.getAllOrders());
        }catch (HttpStatusCodeException ex) {
            return ResponseEntity.status(ex.getStatusCode()).contentType(MediaType.APPLICATION_JSON).body(ex.getResponseBodyAsString());
        }catch (Exception exception) {
            return ResponseEntity.internalServerError().contentType(MediaType.APPLICATION_JSON).body(exception.getMessage());
        }
    }

    @CrossOrigin("*")
    @GetMapping(value="/get-daily-orders")
    public ResponseEntity<?> getDailyOrders(){
        try{
            return ResponseEntity.ok(pickupService.getDailyOrders());
        }catch (HttpStatusCodeException ex) {
            return ResponseEntity.status(ex.getStatusCode()).contentType(MediaType.APPLICATION_JSON).body(ex.getResponseBodyAsString());
        }catch (Exception exception) {
            return ResponseEntity.internalServerError().contentType(MediaType.APPLICATION_JSON).body(exception.getMessage());
        }
    }
}
