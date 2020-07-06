package frc.robot.utils.math.symbolic.functions;

import frc.robot.utils.math.symbolic.Constant;
import frc.robot.utils.math.symbolic.DifferentiableFunction;
import frc.robot.utils.math.symbolic.Symbolic;
import frc.robot.utils.math.symbolic.Variable;

public class Operations {
    public static final DifferentiableFunction Add = new DifferentiableFunction(2) {
        @Override
        protected double _eval(double... inps) {
            return inps[0] + inps[1];
        }

        @Override
        public Symbolic deriv(Variable x) {
            if (x.equals(INPUTS[0]) || x.equals(INPUTS[1])) {
                return Constant.ONE;
            } else {
                return Constant.ZERO;
            }
        }
    };

    public static final DifferentiableFunction Subtract = new DifferentiableFunction(2) {
        @Override
        protected double _eval(double... inps) {
            return inps[0] - inps[1];
        }

        @Override
        public Symbolic deriv(Variable x) {
            if (x.equals(INPUTS[0])) {
                return Constant.ONE;
            } else if (x.equals(INPUTS[1])) {
                return Constant.NEGATIVE_ONE;
            } else {
                return Constant.ZERO;
            }
        }
    };

    public static final DifferentiableFunction Multiply = new DifferentiableFunction(2) {
        @Override
        protected double _eval(double... inps) {
            return inps[0] * inps[1];
        }

        @Override
        public Symbolic deriv(Variable x) {
            if (x.equals(INPUTS[0])) {
                return INPUTS[1];
            } else if (x.equals(INPUTS[1])) {
                return INPUTS[0];
            } else {
                return Constant.ZERO;
            }
        }
    };

    public static final DifferentiableFunction Reciprocal = new DifferentiableFunction(1) {
        @Override
        protected double _eval(double... inps) {
            return 1 / inps[0];
        }

        @Override
        public Symbolic deriv(Variable x) {
            return null;
            // x/y

            /*if (x.equals(INPUTS[0])) {
                if (derivA == null) {
                    // 1/y
                    derivA = new DifferentiableFunction(){
                        @Override
                        public Symbolic deriv(Variable x) {
                            // TODO Auto-generated method stub
                            return null;
                        }
                    
                        @Override
                        protected double _eval(double... inputs) {
                            // TODO Auto-generated method stub
                            return 0;
                        }
                    };
                }
                return INPUTS[1];
            } else if (x.equals(INPUTS[1])) {
                return INPUTS[0];
            } else {
                return Constant.ZERO;
            }*/
        }
    };
}