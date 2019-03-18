public class Vector2 {

    public final double x;
    public final double y;

    public Vector2(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "(" + this.x + "," + this.y + ")";
    }

    public Vector2 plus (Vector2 v) {
        return new Vector2(this.x + v.x, this.y + v.y);
    }
}
