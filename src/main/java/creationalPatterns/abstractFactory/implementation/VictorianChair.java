package creationalPatterns.abstractFactory.implementation;

import creationalPatterns.abstractFactory.interfaces.Chair;

public class VictorianChair implements Chair {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return false;
    }
}
