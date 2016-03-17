
public class Euro {

    private double amount;
    private final double DOLLAR_CURRENCY = 1.35;

    public Euro(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() == o.getClass()) return amount == ((Euro)o).amount;
        if (o instanceof Dollar)
            return toDollar().equals(o);
        return false;
    }

    private Dollar toDollar() {
        return new Dollar(amount * DOLLAR_CURRENCY);
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(amount);
        return (int) (temp ^ (temp >>> 32));
    }

    public Euro add(Euro euro) {
        return new Euro(amount + euro.amount);
    }
}
