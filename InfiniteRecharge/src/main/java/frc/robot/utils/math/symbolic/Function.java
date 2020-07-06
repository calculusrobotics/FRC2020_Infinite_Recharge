package frc.robot.utils.math.symbolic;



public abstract class Function extends Symbolic {
    protected final Variable[] INPUTS;



    public Function(int numInputs) {
        INPUTS = new Variable[numInputs];
        for (int i = 0; i < numInputs; i++) {
            INPUTS[i] = new Variable();
        }
    }

    protected abstract double _eval(double... inputs);

    public double eval(double... inputs) {
        if (inputs.length == INPUTS.length) {
            return _eval(inputs);
        } else {
            throw new IllegalArgumentException();
        }
    }
}