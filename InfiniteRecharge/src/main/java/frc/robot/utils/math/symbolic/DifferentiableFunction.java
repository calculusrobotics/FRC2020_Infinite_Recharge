package frc.robot.utils.math.symbolic;



public abstract class DifferentiableFunction extends Function implements Differentiable<Variable> {
    public DifferentiableFunction(int numInputs) {
        super(numInputs);
    }
}