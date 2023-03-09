package calculations.resolutions;

import calculations.Calculation;
import calculations.equations.Equation;

import java.util.function.Function;

public class Step {
    public Calculation calculation;
    public Function<Equation, String> getName;
    public Function<Equation, Calculation> getResult;

    public Step(Calculation calculation, Function<Equation, String> getName, Function<Equation, Calculation> getResult) {
        this.calculation = calculation;
        this.getName = getName;
        this.getResult = getResult;
    }
}
