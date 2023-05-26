package cl.ecotouch.igmongo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "et_location")
public class LocationDTO {
    @Id
    private String _id;
    String distance;
    String lat;
    String status;
    String lng;
    String owner;
    String type;
    String address_type;
    String manager;
    String address_number;
    String address_name;
    RegionDTO region;
    CommuneDTO commune;
    List<String> materials;
}
