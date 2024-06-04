class BagLIFO extends AbstractBag {
    @Override
    public ISurprise removeSurprise() {
        return surprises.remove(size() - 1);
    }
}