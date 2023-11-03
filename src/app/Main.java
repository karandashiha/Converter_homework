package app;

public class Main {
    public static void main(String[] args) {

        double miles = 5.0;
        double km = milesToKm(miles);
        System.out.println( miles + " miles = " + km + " km");
    }
    public static double milesToKm(double miles){
        // 1 кілометр = 0.621371 миль
        return miles * 1.60934;
    }
    public static  double kmToMiles(double km){
        // 1 миля = 1.60934 кілометра
        return km * 0.621371;
    }
}
