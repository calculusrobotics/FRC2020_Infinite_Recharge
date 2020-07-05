package frc.robot.utils.math.symbolic;



public class Constant extends Symbolic implements Differentiable<Variable> {
    private final double VALUE;

    public Constant(double constant) {
        this.VALUE = constant;
    }



    @Override
    public Symbolic deriv(Variable x) {
        return ZERO;
    }

    public double get() {
        return VALUE;
    }



    public static Constant ZERO = new Constant(0);
    public static Constant ONE = new Constant(1);
}