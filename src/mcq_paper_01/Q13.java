package mcq_paper_01;

class B {

    static void m() {
        System.out.println("m");
        m2();
    }

    static void m2() {
        System.out.println("m2");
        m3();
    }

    static void m3() {
        System.out.println("m3");
        m4();
    }

    static void m4() {
        System.out.println("m4");
    }

    public static void main(String[] args) {
        m();
    }
}
