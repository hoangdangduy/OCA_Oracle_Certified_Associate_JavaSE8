public class Egret {
    private static String color;
    public Egret() {
        this("white");
    }
    public Egret(String color) {
        color = color;
    }
    public static void main(String[] args) {
        // String a_b;
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
    }
}
// Quetsion 12
