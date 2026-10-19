package p_o_objetos.modulo2;

public non-sealed class Manager extends Employee {
    private String login;
    private String password;
    private double comission;

    public Manager(String code,
            String name,
            String address,
            int age,
            double salary,
            double comission,
            String login,
            String password) {
        super(code, name, address, age, salary);
        this.comission = comission;
        this.login = login;
        this.password = password;
    }

    @Override
    public String getCode() {
        return "MG" + this.code;
    }

    public Manager() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.comission;
    }

}
