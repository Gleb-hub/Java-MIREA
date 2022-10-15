import seasons.Seasons;

public class Task1 {
    public static void main(String[] args) {
        Seasons lovely_season = Seasons.SUMMER;
        System.out.println("Моё любимое время года: " + lovely_season.toString());
        iLoveSeason(lovely_season);

        for (Seasons season : Seasons.values()) {
            System.out.println(season + " " + season.getAverageTemp() + " " + season.getDescription());
        }

    }

    public static void iLoveSeason(Seasons season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case FALL:
                System.out.println("Я люблю осень");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
        }
    }
}
