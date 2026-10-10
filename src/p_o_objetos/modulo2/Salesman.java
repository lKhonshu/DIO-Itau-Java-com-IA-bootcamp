package p_o_objetos.modulo2;

public non-sealed class Salesman extends Employee {

    private double percentPersold;
    private double soldAmount;

    public Salesman(String code,
            String name,
            String address,
            int age,
            double salary,
            double percentPersold,
            double soldAmount) {
        super(code, name, address, age, salary);
        this.percentPersold = percentPersold;
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {
        return "SL" + super.getCode();
    }

    public Salesman() {
    }

    public double getPercentPersold() {
        return percentPersold;
    }

    public void setPercentPersold(final double percentPersold) {
        this.percentPersold = percentPersold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public double getFullSalary() {
        return this.salary + (this.soldAmount * this.percentPersold) / 100;
    }
}
