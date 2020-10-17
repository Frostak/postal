package entity;

import java.math.BigDecimal;
import lombok.Data;

/**
 * Basic abstract class representing item in postal application
 * Basic general attributes for all subclasses
 *
 * @author Jan Polák
 */

@Data
public abstract class Item {

    /**
     * weight of single item
     */
    private BigDecimal itemWeight;

    /**
     * The public name of a hero that is common knowledge
     */
    private BigDecimal itemTax;
}
