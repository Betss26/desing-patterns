package creationalPatterns.abstractFactory.implementation;

import creationalPatterns.abstractFactory.interfaces.Chair;

public class ModernChair implements Chair {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return false;
    }
}
