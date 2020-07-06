package frc.robot.utils.math.symbolic;



public abstract class Symbolic {
    private static int nextID = 0;
    protected final int ID;



    public Symbolic() {
        ID = nextID;
        nextID++;
    }

    public int getID() { return ID; }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Symbolic) {
            return ((Symbolic) o).getID() == ID;
        } else {
            return false;
        }
    }
}