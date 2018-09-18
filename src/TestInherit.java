public class TestInherit {
    public TestInherit() {
        System.out.println("Test Inherit");
    }

    public TestInherit(int a) {
        System.out.println(a + " parent");
    }

    public static void main(String[] args) {
        TestInherit classParent = new Child(5);
    }
}

class Child extends TestInherit {
    public Child() {
        super();
        System.out.println("child no args");
    }

    public Child(int a) {
        System.out.println("child");
    }
}