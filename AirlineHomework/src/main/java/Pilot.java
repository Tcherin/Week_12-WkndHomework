public class Pilot {

    private String name;

    private RankType rankType;

    private String licenceNumber;

    public Pilot(String name, RankType rankType, String licenceNumber) {
        this.name = name;
        this.rankType = rankType;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RankType getRankType() {
        return rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String flyPlane() {
        return "Time for take off!";
    }
}
