public enum RankType {

    CAPTAIN("Captain"),
    FLIGHTATTENDANT("Flight Attendant");

    private final String rank;


    RankType(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
