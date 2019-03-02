package SpaceInvaders.Users;

//score data collection

public class Score {

    private static int score = 0;
    private static int kills = 0;
    private static int powerUps = 0;
    private static int deaths = 0;

    /**
     * clear current score
     */
    public static void reset() {
        score = 0;
        kills = 0;
        powerUps = 0;
        deaths = 0;
    }

    /**
     * add value to score
     *
     * @param value
     */
    public static void addScore(int value) {
        score += value;
    }

    /**
     * get current score
     *
     * @return accumulated score
     */
    public static int getScore() {
        return score;
    }

    /**
     * increment kill tally
     */
    public static void addKill() {
        kills++;
    }

    /**
     * increment powerUp tally
     */
    public static void addPowerUp() {
        powerUps++;
    }

    /**
     * increment death tally
     */
    public static void addDeath() {
        deaths++;
    }

    /**
     * get death tally
     *
     * @return accumulated deaths
     */
    public static int getDeaths() {
        return deaths;
    }

    /**
     * get kill tally
     *
     * @return accumulated kills
     */
    public static int getKills() {
        return kills;
    }

    /**
     * get powerUp tally
     *
     * @return accumulated powerUps
     */
    public static int getPowerUps() {
        return powerUps;
    }

}
