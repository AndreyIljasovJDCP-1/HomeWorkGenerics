public class BoxNotFullException extends RuntimeException {

    public BoxNotFullException(String boxName, int emptyCells) {
        super("MagicBox \"" + boxName + "\" не заполнена. Надо заполнить еще " + emptyCells + " яч.");
    }

}
