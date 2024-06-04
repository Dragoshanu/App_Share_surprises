class MinionToy implements ISurprise {

    private final String name;
    private static final String[] minionNames = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
    private static int counter = 0;

    public MinionToy(String name) {
        this.name = name;
    }

    @Override
    public void enjoy() {
        System.out.println("You got a minion named " + name + "!");
    }

    @Override
    public String toString() {
        return "[Minion] name = " + name;
    }

    public static MinionToy generate(){
        MinionToy toy = new MinionToy(minionNames[counter]);
        counter = (counter + 1) % minionNames.length;
        return toy;
    }
}