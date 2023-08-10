package bi.seke.warehouseservice.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Harvey's on 8/11/2023.
 */
@Data
public class PackageEntity implements Serializable {

    private UUID uid;
    private UUID packageUid;
    private Status status;
}
