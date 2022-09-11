package creationalPatterns.prototypeDesingPattern;

/**
 * Es el prototipo, tiene un método para
 * clonarse a sí mismo,
 * quien implemente esta clase podrá clonarse
 * a sí mismo
 */
public abstract class Tree {

    public abstract Tree copy();

}
