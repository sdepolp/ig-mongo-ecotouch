package cl.ecotouch.igmongo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "et_request")
public class RequestPickupDTO {
    @Id
    private String _id;
    String username;
    String datetimeRequest;
    List<String> materialType;
    double volume;
    double latitude;
    double longitude;
    String dateTimeScheduled;
    String textAddress;
    String statusRequest;
}
