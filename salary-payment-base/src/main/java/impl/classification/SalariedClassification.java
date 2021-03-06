package impl.classification;

import impl.model.PayCheck;
import lombok.Data;

@Data
public class SalariedClassification implements PaymentClassification {
    private double salary;

    public SalariedClassification() {
    }

    public SalariedClassification(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay(PayCheck pc) {
        return salary;
    }
}
