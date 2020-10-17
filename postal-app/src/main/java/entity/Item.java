package entity;

import java.math.BigDecimal;
import lombok.Data;

/**
 * Basic abstract class representing item in postal application and general attributes for all subclasses
 *
 * @author Jan Polák
 */

@Data
public abstract class Item {

    /**
     * weight of single item
     */
    private BigDecimal itemsWeight;

    /**
     * The public name of a hero that is common knowledge
     */
    private BigDecimal itemsTax;
}
