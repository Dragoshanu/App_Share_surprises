class Candies extends AbstractSurprise {

    private static final String[] candyTypes = {"chocolate", "jelly", "fruits", "vanilla"};
    private int number;
    private String type;

    public Candies(int number, String type) {
        this.number = number;
        this.type = type;
    }

    @Override
    public void enjoy() {
        System.out.println("You received "+ number + " " + type + " candies.");
    }

    @Override
    public String toString() {
        return "[Candies] number = " + number + ", type = " + type;
    }

    public static Candies generate(){
        String type = candyTypes[getRandomNumber(candyTypes.length)];
        int number = getRandomNumber();
        return new Candies(number, type);
    }
}