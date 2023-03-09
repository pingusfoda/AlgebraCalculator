package calculations.equations.elements;

public class Root extends Element {
    public int index;
    public Element element;

    public Root(int index, Element element, Element exponent, Element quotient, Element multiplication) {
        this.index = index;
        this.element = element;
        this.exponent = exponent;
        this.quotient = quotient;
        this.multiplication = multiplication;
    }
}
