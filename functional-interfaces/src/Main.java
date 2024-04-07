import predicate.PredicateExample;
import supplier.SupplierExample;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<LocalDate> mySupplier = SupplierExample.supplierExample();

        System.out.println(mySupplier.get());
    }
}