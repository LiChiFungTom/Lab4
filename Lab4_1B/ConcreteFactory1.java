public class ConcreteFactory1 extends AbstractFactory{
    public AbstradProductA createProductA(){
        return new ProductA1();
    }

    public AbstradProductB createProductB(){
        return new ProductB1();
    }
}
