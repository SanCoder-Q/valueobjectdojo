
public class Euro {

    private int amount;

    public Euro(int amount) {
        this.amount = amount;
    }

//    @Override
//    public boolean equals(Object comparer) {
//        if(comparer == null || !(comparer instanceof Euro)) {
//            return false;
//        }
//
//        return amount == ((Euro)comparer).amount;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Euro euro = (Euro) o;

        return amount == euro.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Euro add(Euro euro) {
        return new Euro(amount + euro.amount);
    }
}
