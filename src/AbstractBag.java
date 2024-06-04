import java.util.ArrayList;

abstract class AbstractBag implements IBag {

    ArrayList<ISurprise> surprises = new ArrayList<>();

    abstract ISurprise removeSurprise();
    @Override
    public void put(ISurprise newSurprise) {
        surprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty())
            put(bagOfSurprises.takeOut());
    }

    @Override
    public boolean isEmpty() {
        return surprises.isEmpty();
    }

    @Override
    public int size() {
        return surprises.size();
    }

    @Override
    public ISurprise takeOut() {
        return removeSurprise();
    }
}