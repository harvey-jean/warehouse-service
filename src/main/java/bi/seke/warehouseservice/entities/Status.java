package bi.seke.warehouseservice.entities;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by Harvey's on 8/11/2023.
 */
@Data
public class Status {

    private LocalDateTime date;
    private State state;

}
