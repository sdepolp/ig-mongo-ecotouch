package cl.ecotouch.igmongo.repository;

import cl.ecotouch.igmongo.dto.LocationDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("mongo")
public interface LocationRepository extends MongoRepository<LocationDTO,String> {
    List<LocationDTO> findAll();
}
