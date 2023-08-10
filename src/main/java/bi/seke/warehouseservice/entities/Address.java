package bi.seke.warehouseservice.entities;

import lombok.Data;

import java.util.UUID;

/**
 * Created by Harvey's on 8/11/2023.
 */
@Data
public class Address {
    private UUID uid;
    private String street;
    private String city;
    private String region;
    private String postalCode;
    private String countryCode;
    private float latitude;
    private float longitude;

}
