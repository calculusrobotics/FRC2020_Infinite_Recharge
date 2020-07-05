package frc.robot.utils.math.symbolic;



public class Variable extends Symbolic implements Differentiable<Variable> {
    private static int nextID = 0;

    protected final int ID;
    protected final String NAME;

    public Variable(String name) {
        ID = nextID;
        nextID++;
        NAME = name;
    }



    public int getID() {
        return ID;
    }

    public String getName() {
        return NAME;
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