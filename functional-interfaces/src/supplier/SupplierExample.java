package supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {

    public static Supplier<LocalDate> supplierExample() {
        Supplier<LocalDate> example = () -> LocalDate.now();

        return example;
    }
}
