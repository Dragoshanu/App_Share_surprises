import java.util.concurrent.TimeUnit;

abstract class AbstractGiveSurprises {

    private final IBag bag;
    private final int waitTime;

    public AbstractGiveSurprises(String bagType, int waitTime) {
        this.bag = BagFactory.getInstance().makeBag(bagType);
        this.waitTime = waitTime;
    }

    void put(ISurprise surprise){
        bag.put(surprise);
    }

    void put(IBag surprises){
        bag.put(surprises);
    }

    void give(){
        ISurprise surprise = bag.takeOut();
        surprise.enjoy();
        giveWithPassion();
    }

    void giveAll() {
        while(!isEmpty()){
            give();
            try {
                TimeUnit.SECONDS.sleep(waitTime);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    boolean isEmpty(){
        return bag.isEmpty();
    }

    protected abstract void giveWithPassion();
}