package java14x.Constructor.Abstraction;

public class MultipleInheritance {
}
class Child1 implements Father1,Father2{

    @Override
    public void money() {
        System.out.println("Child Money!!");
    }
}

interface Father1{
    void money();
}
interface Father2{
    void money();
}