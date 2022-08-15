import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {

    private final String nameBox;
    private final T[] items;

    public MagicBox(String nameBox, int maxItems) {
        this.nameBox = nameBox;
        this.items = (T[]) new Object[maxItems];

    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("MagicBox \"" + getNameBox() + "\" заполнена!");
        return false;
    }

    public T pick() {
        Random random = new Random();

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("MagicBox \"" + getNameBox() + "\" не заполнена. Надо заполнить еще " + (items.length - i) + " яч.");
            }
        }
        return items[random.nextInt(items.length)];
    }

    public String getNameBox() {
        return nameBox;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
