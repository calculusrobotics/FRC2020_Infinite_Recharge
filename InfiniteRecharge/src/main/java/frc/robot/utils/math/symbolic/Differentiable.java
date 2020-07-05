package frc.robot.utils.math.symbolic;



public interface Differentiable<T extends Variable> {
    public Symbolic deriv(T x);
}