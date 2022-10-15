package seasons;

public enum Seasons {
    SUMMER(30) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    FALL(-10),
    WINTER(-30),
    SPRING(15);

    private final int averageTemp;

    private Seasons(int temp) {
        averageTemp = temp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
