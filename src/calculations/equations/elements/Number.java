package calculations.equations.elements;

public class Number extends Element {
    public double number;

    public Number(double number, Element exponent, Element quotient, Element multiplication) {
        this.number = number;
        this.exponent = exponent;
        this.quotient = quotient;
        this.multiplication = multiplication;
    }

    @Override
    public String toString() {
        return Double.toString(number);
    }
}
