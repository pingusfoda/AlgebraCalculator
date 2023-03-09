package calculations.equations.elements;

public class Variable extends Element {
    public char name;

    public Variable(char name, Element exponent, Element quotient, Element multiplication) {
        this.name = name;
        this.exponent = exponent;
        this.quotient = quotient;
        this.multiplication = multiplication;
    }
}
