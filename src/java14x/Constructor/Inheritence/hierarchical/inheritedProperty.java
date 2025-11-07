package java14x.Constructor.Inheritence.hierarchical;

public class inheritedProperty {
    public static void main(String[] args) {
        Pramod p1 = new Pramod ();
        p1.home();
        p1.h2();
        // below is not possible because siblings can only access father property not brother sister property
        // p1.h3();
        // p1.h5();
        Lucky L1 = new Lucky();
        L1.home();
        L1.h3();

        Ruhani R1 = new Ruhani();
        R1.home();
        R1.h5();
    }
}
