class BagFIFO extends AbstractBag {

    @Override
    public ISurprise removeSurprise() {
        return surprises.remove(0);
    }
}