class Account {
    private String name = "Simple";
    private int acc = 123;
    private int pass = 11;
    private double bal = 100000;
    private int username = 333;

    public String getName() {
        return name;
    }

    public int getAcc() {
        return acc;
    }

    public int getPass() {
        return pass;
    }

    public double getBal() {
        return bal;
    }

    public int getUserName() {
        return username;
    }

    public void setName(String s) {
        name = s;
    }

    public void setAcc(int s) {
        acc = s;
    }

    public void setPass(int s) {
        pass = s;
    }

    public void setBal(double s) {
        bal = s;
    }

    public void setUserName(int s) {
        username = s;
    }
}
