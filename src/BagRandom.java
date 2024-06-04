import java.util.Random;

class BagRandom extends AbstractBag {

    private static final Random random = new Random();
    @Override
    public ISurprise removeSurprise() {
        int index = random.nextInt() % size();
        return surprises.remove(index);
    }
}