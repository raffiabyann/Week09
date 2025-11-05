package week09.raffi.id.umn.ac;

public class C implements A, B {
    public void displayA() {
        System.out.println("Display A");
    }

    public void displayB() {
        System.out.println("Display B");
    }

    public static void main(String[] args) {
        C c = new C();
        c.displayA(); 
        c.displayB(); 
    }
}
