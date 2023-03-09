package calculations.equations.elements;

import java.util.Arrays;

public class Parenthesis extends Element {
    public Element[] summation;

    public Parenthesis(Element[] summation, Element exponent, Element quotient, Element multiplication) {
        this.summation = summation;
        this.exponent = exponent;
        this.quotient = quotient;
        this.multiplication = multiplication;
    }

    @Override
    public String toString() {
        return String.join(" + ", Arrays.stream(summation).map(Element::toString).toList());
    }
}
