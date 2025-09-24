public class Euro {

    public static double imposto = 0.015;

    public static double euroresultado(double euroqtd,double europrc){
        return euroqtd * europrc * (1.0 + imposto);
    }

}