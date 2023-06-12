public enum PlaneType {

    BOEING747(100, 1000),

    BOEING727(120, 1200),

    BOEING777(150, 1500),

    AIRBUS330(200, 2000);

    private final int capacity;

    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
