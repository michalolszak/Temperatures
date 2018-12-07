public class UseTemperatureNice {

    static public void main(String args[]) {
        TemperatureNice temp = new TemperatureNice();

        temp.setScale(TempScale.CELSIUS);
        temp.setNumber(256.36);
        temp.Display();

        temp = new TemperatureNice(256.0,TempScale.KELVIN);
        temp.Display();
        temp = new TemperatureNice(TempScale.KELVIN);
        temp.Display();
        temp = new TemperatureNice(654.20);
        temp.Display();
    }
}
