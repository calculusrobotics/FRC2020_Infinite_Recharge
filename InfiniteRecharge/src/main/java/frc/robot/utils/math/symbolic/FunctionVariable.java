package frc.robot.utils.math.symbolic;

import java.util.HashMap;

public class FunctionVariable extends Variable {
    private final Variable[] INPUTS;

    private HashMap<Variable, FunctionVariable> derivs;

    public FunctionVariable(String name, Variable[] inputs) {
        super(name);

        INPUTS = inputs;

        derivs = new HashMap<Variable, FunctionVariable>();
    }

    @Override
    public Symbolic deriv(Variable x) {
        if (x.getID() == ID) {
            return Constant.ONE;
        } else {
            for (int i = 0; i < INPUTS.length; i++) {
                if (x.getID() == INPUTS[i].getID()) {
                    if (!derivs.containsKey(INPUTS[i])) {
                        derivs.put(INPUTS[i], new FunctionVariable(NAME + "_" + INPUTS[i].getName(), INPUTS));
                    }
                    
                    return derivs.get(INPUTS[i]);
                }
            }

            return Constant.ZERO;
        }
    }
}