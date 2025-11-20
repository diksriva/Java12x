package java14x.Constructor.Abstraction;

public class interfaceInterview {
}
interface I11{

}
interface I22{

}
class A1{}
class B1{}
//class Test2 extends A1,B1{}--->Multiple extension of classes are not allowed
class Test3 implements I11{}
class Test4 implements  I11,I22{
class Test5 extends A1 implements I11,I22{}
//class Test5 implements I11 extends A1{}    ----> extends then implements are allowed but not extends then implements
}