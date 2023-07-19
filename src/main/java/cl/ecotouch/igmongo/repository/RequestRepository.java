package cl.ecotouch.igmongo.repository;

import cl.ecotouch.igmongo.dto.RequestPickupDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RequestRepository extends MongoRepository<RequestPickupDTO, String> {

    List<RequestPickupDTO> findByDateTimeScheduledLike(String fechaActualFormateada);
}
