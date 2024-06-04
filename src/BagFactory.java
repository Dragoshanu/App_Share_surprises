class BagFactory implements IBagFactory {
    private static final BagFactory factory = new BagFactory();
    public static BagFactory getInstance(){
        return factory;
    }
    private BagFactory(){};
    @Override
    public IBag makeBag(String type) {
        switch (type){
            case "RANDOM": return new BagRandom();
            case "FIFO": return new BagFIFO();
            case "LIFO": return new BagLIFO();
            default: return null;
        }
    }
}