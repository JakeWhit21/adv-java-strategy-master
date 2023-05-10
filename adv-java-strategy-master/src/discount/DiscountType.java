package discount;

public interface DiscountType {
    double discount();
}

class discountTypeS implements DiscountType{

    public double discount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}

class discountTypeD implements DiscountType{

    public double discount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}

class discountTypeL implements DiscountType{

    public double discount() {
        return billAmount - (billAmount * 0.75);
    }
}
