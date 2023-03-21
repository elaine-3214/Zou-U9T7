public class ThreeDPoint extends Point {
    private int z;
    public ThreeDPoint (String label, int x, int y, int z) {
        super (label, x, y);
        this.z = z;
    }
    @Override
    public boolean equals(Object obj) {
        //guard
        if (!(obj instanceof ThreeDPoint)) {
            return false;
        }
        ThreeDPoint p = (ThreeDPoint) obj;
        return super.equals(obj) && z == p.z;
    }

    @Override
    public String toString() {
        return super.toString() + " and z = " + z;
    }
}
