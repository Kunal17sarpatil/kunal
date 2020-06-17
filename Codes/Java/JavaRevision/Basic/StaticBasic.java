class Demo {
    int a = 10;
    static int b =20;

    static {

        System.out.println("Static Block");
        fun();
    }

    public static void fun() {
        int f = 30;
        System.out.println("In Fun = "+f);
    }

    static {
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}