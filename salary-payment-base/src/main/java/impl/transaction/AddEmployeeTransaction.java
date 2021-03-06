package impl.transaction;

import impl.classification.PaymentClassification;
import impl.database.PayrollDatabase;
import impl.method.HoldMethod;
import impl.method.PaymentMethod;
import impl.model.Employee;
import impl.schedule.PaymentSchedule;
import lombok.Data;

@Data
public abstract class AddEmployeeTransaction extends Transaction {
    private int empId;
    private String name;
    private String address;

    public AddEmployeeTransaction() {
    }

    public AddEmployeeTransaction(int empId, String name, String address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    public abstract PaymentClassification getClassification();

    public abstract PaymentSchedule getSchedule();

    @Override
    public void execute() {
        PaymentClassification pc = getClassification();
        PaymentSchedule ps = getSchedule();
        PaymentMethod pm = new HoldMethod();
        Employee e = new Employee(empId, name, address);
        e.setClassification(pc);
        e.setSchedule(ps);
        e.setMethod(pm);
        PayrollDatabase.addEmployee(empId, e);
    }
}
