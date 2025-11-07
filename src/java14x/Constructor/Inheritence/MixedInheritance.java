package java14x.Constructor.Inheritence;

public class MixedInheritance {
    public static void main(String[] args) {
        SonInheritance Diksha = new SonInheritance();
        System.out.println(Diksha.gold_Price);
            Diksha.bhk3();
            Diksha.bhk2();

            FatherInheritance f1 = new FatherInheritance();
            System.out.println(f1.gold_Price);
            f1.bhk2();
            //f1.bhk3();---> Because son extends father not father extends son

    }
}
