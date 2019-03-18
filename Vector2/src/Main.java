public class Main {

    public static void main(String[] args) {
        Vector2 v1 = new Vector2(1,2);
        Vector2 v2 = new Vector2(3,4);

        Vector2 v3 = v1.plus(v2);

        System.out.println(v3.toString());
    }
}
