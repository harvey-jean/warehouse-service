package bi.seke.warehouseservice.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Harvey's on 8/11/2023.
 */
@Data
public class WarehouseEntity implements Serializable {

    private UUID uid;
    private Address address;
    private String email;
    private String phone;
    private boolean active;
}
