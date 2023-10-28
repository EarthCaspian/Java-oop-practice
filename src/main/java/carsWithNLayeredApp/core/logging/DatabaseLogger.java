package carsWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Logged into db : " + data);
    }
}
