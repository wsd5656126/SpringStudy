package impl.transaction.change.method;

import impl.method.DirectMethod;
import impl.method.PaymentMethod;
import impl.transaction.change.ChangeMethodTransaction;
import lombok.Data;

@Data
public class ChangeDirectTransaction extends ChangeMethodTransaction {
    private String bank;
    private double account;

    public ChangeDirectTransaction() {
    }

    public ChangeDirectTransaction(int empId, String bank, double account) {
        super(empId);
        this.bank = bank;
        this.account = account;
    }

    @Override
    public PaymentMethod getMethod() {
        return new DirectMethod(bank, account);
    }
}
