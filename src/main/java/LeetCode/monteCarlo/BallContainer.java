package LeetCode.monteCarlo;


class BallContainer {
    private final int whiteBalls;
    private final int blackBalls;

    public BallContainer(int whiteBalls, int blackBalls) {
        if (whiteBalls < 0 || blackBalls < 0) {
            throw new IllegalArgumentException("Number of balls cannot be negative.");
        }
        this.whiteBalls = whiteBalls;
        this.blackBalls = blackBalls;
    }

    public double getWhiteProbability() {
        int totalBalls = whiteBalls + blackBalls;
        return (totalBalls == 0) ? 0 : (double) whiteBalls / totalBalls;
    }
}