package creationalPatterns.prototypeDesingPattern;


import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;
import static java.util.stream.Collectors.toList;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Este patrón es útil cuando nuestro nuevo objeto es solo ligeramente
 * diferente del existente. En algunos casos, las instancias pueden tener
 * solo unas pocas combinaciones de estado en una clase. Entonces,
 * en lugar de crear nuevas instancias, podemos crear las instancias con
 * el estado apropiado de antemano y luego clonarlas cuando queramos.
 *
 * A veces, podemos encontrar subclases que difieren solo en su estado.
 * Podemos eliminar esas subclases creando prototipos con el estado
 * inicial y luego clonándolos.
 *
 * El patrón de prototipo, al igual que cualquier otro patrón de
 * diseño, debe usarse solo cuando sea apropiado. Dado que estamos
 * clonando los objetos, el proceso podría volverse complejo cuando
 * hay muchas clases, lo que resultaría en un desastre. Además,
 * es difícil clonar clases que tienen referencias circulares.
 */
class PineTreeTest {

    @Test
    public void givenAPlasticTreePrototypeWhenClonedThenCreateA_Clone() {

        //Creo un árbol de plástico
        PlasticTree plasticTree = new PlasticTree("", "");
        plasticTree.setPosition("");//Le cambio la posicion
        //a partir de la instancia anterior
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();//creo una copia
        //le cambio la posicion a la copia
        anotherPlasticTree.setPosition("");

        assertEquals("", plasticTree.getPosition());
        assertEquals("", anotherPlasticTree.getPosition());
    }

    @Test
    public void givenA_ListOfTreesWhenClonedThenCreateListOfClones() {

        // create instances of PlasticTree and PineTree
        PlasticTree plasticTree = new PlasticTree("", "");
        PineTree pineTree = new PineTree("", "");

        List<Tree> trees = Arrays.asList(plasticTree, pineTree);
        List<Tree> treeClones = trees.stream().map(Tree::copy).collect(toList());

        // ...

      //  assertEquals("height", plasticTreeClone.getHeight());
      //  assertEquals("position", plasticTreeClone.getPosition());
    }
}