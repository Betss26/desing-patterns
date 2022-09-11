package creationalPatterns.abstractFactory.factory;

import creationalPatterns.abstractFactory.interfaces.Chair;
import creationalPatterns.abstractFactory.interfaces.Sofa;
import creationalPatterns.abstractFactory.interfaces.Table;

public interface FornitureFactory {

    public Chair createChair();
    public Table createTable();
    public Sofa createSofa();

}
