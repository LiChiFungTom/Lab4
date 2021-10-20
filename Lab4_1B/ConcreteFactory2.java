public class ConcreteFactory2 extends AbstractFactory{
    public AbstradProductA createProductA(){
        return new ProductA2();
    }

    public AbstradProductB createProductB(){
        return new ProductB2();
    }

}
