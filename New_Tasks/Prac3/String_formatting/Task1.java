import java.text.NumberFormat;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        MoneyConverter mc = new MoneyConverter();
        System.out.printf("12 рублей = %s\n", mc.RubToDollar(12));
        System.out.printf("1000 рублей = %s\n", mc.RubToEur(1000));
        System.out.printf("777 рублей = %s\n", mc.RubToUan(777));
    }
}

class MoneyConverter {
    private double rub_dollar;
    private double rub_eur;
    private double rub_uan;

    public MoneyConverter() {
        rub_dollar = 0.016;
        rub_eur = 0.017;
        rub_uan = 0.12;
    }

    public MoneyConverter(double rub_dollar, double rub_eur, double rub_uan) {
        this.rub_dollar = rub_dollar;
        this.rub_eur = rub_eur;
        this.rub_uan = rub_uan;
    }

    public String RubToDollar(double rub) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        return nf.format(rub * rub_dollar);
    }

    public String RubToEur(double rub) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        return nf.format(rub * rub_eur);
    }

    public String RubToUan(double rub) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        return nf.format(rub * rub_uan);
    }
}
