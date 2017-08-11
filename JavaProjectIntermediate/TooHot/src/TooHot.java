public class TooHot {

    public static void main(String[] args) {
        System.out.println(tooHot(101,true));
    }

    static boolean tooHot(int temperature, boolean isSummer) {
        int upperLimit = 90;
        boolean status = false;
        if(isSummer) {
            upperLimit = 100;
        }
        if(temperature >= 60 && temperature<= upperLimit) {
            status = true;
        }
            return status;
    }
}
