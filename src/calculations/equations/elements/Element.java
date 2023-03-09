package calculations.equations.elements;

public class Element {
    public Element exponent;
    public Element quotient;
    public Element multiplication;

    @Override
    public String toString() {
        return "%s^%s * %s / %s".formatted(this, exponent, multiplication, quotient);
    }
}
