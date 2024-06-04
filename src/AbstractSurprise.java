import java.util.Random;

abstract class AbstractSurprise implements ISurprise {

    private static final Random random = new Random();

    static int getRandomNumber(){
        return random.nextInt();
    }

    static int getRandomNumber(int bound){
        return random.nextInt(bound);
    }

}