package java14x.Constructor.Inheritence.multiLevelInheritance;

public class multiLevel {
    public static void main(String[] args) {
        Son diksha = new Son();
        diksha.home();
        diksha.gf();
        diksha.extra();
        diksha.bhk3();

        Father f = new Father();
        f.home();
        f.gf();
        f.extra();
        //f.bhk3();----> Can't access this as we can only access from our ansectors not child
    GrandFather gf  = new GrandFather();
    gf.gf();
    gf.home();
    //Dynamic Dispatch
        GrandFather g1 = new Father();
        GrandFather g2 = new Son();
        Father g3 = new Son();
//        Father g4 = new GrandFather();
//        Son s5 = new Father();
//        Son s6 = new GrandFather();
// Not possible as this in multilevel we can come top to bottom not from bottom to top


    }
}
