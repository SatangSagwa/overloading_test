public class Main {
    public static void main(String[] args) {
        int score = calcScore("Em", 5);
        System.out.println("Score: " + score);
        score = calcScore(3);
        System.out.println("Score: " + score);
    }

    public static int calcScore(String name, int score) {
        System.out.println("Player " + name + "'s score is " + score);
        return score * 1000;
    }

    public static int calcScore(int score) {
        //System.out.println("Unnamed player's score is " + score);
        //return score * 1000;
        return calcScore("Anonymous", score);
    }

    public static void calcScore() {
        System.out.println("No player, No score");
    }
}