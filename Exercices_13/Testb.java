public class Testb {
    public static void main (String [] args) {
        C c = new C();
        C cd = new D();
        D d = new D();
        System.out.println(c.ch);
        System.out.println(c.getCh());
        System.out.println(cd.ch);
        System.out.println(cd.getCh());
        System.out.println(d.ch);
        System.out.println(d.getCh());
    }
    
}
