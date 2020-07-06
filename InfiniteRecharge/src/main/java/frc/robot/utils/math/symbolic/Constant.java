package frc.robot.utils.math.symbolic;



public class Constant extends Symbolic implements Differentiable<Variable> {
    private final double VALUE;

    private Constant(double constant) {
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
    public static Constant NEGATIVE_ONE = new Constant(-1);
}