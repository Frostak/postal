package entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Package extends Item {

    /**
     * postal code area for single package item
     */
    private Integer postalCode;

}


