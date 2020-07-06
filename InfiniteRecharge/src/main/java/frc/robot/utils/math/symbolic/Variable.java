package frc.robot.utils.math.symbolic;



public class Variable extends Symbolic implements Differentiable<Variable> {
    private double value = 0;

    public Variable() {}

    public void set(double value) {
        this.value = value;
    }


    @Override
    public Symbolic deriv(Variable x) {
        if (x.getID() == ID) {
            return Constant.ONE;
        } else {
            return Constant.ZERO;
        }
    }
}