import static java.lang.System.out;

public class TemperatureNice extends Temperature {

    public TemperatureNice() {
        super();
    }

    public TemperatureNice(double number) {
        super(number);
    }

    public  TemperatureNice (TempScale scale) {
        super (scale);
    }

    public  TemperatureNice (double number, TempScale scale) {
        super(number, scale);
    }

    public void Display() {
        out.printf("%5.2f degrees of %s", this.getNumber(), this.getScale());
    }
}
