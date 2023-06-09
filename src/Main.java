import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        /*
            1. Stwórz klasę Animal z polem name oraz konstruktorem ustawiającym tą wartość,
               gettery, settery i toString()
            2. Dodaj LinkedList typu Animal o nazwie animals, następnie w pętli for z
               20-stoma iteracjami dodaj losowy String z tablicy elementów: Dog, Cat, Tiger,
               Lion, Panda.
               Losowy element przekaż do konstruktora Animal i dodaj go do listy.
            3. Po pętli for skasuj pierwszy i ostatni element z listy
            4. Dodaj na początek listy Animal z Tiger oraz na koniec Lion
            5. Stwórz ListIterator
            6. W pętli while wyświetl wszytkie elementy listy
         */

        LinkedList<Animal> animals = new LinkedList<>();
        String [] animal = {"Dog", "Cat", "Tiger", "Lion", "Panda"};

        for (int i = 0; i < 20; i++) {
            animals.add(new Animal(animal[(int) Math.floor(Math.random() * 4)]));
        }
        //System.out.println(animals);

        animals.removeFirst();
        animals.removeLast();

        animals.addFirst(new Animal("Tiger"));
        animals.addLast(new Animal("Lion"));

        ListIterator<Animal> iterator = animals.listIterator();
            while (iterator.hasNext()) {
                String str = iterator.next().getName();
                System.out.println(str);
        }
    }
}
