package Session_9;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String args[]){

        // US
        ResourceBundle resourceBundle_us =  ResourceBundle.getBundle(
                "Session_9.Message", Locale.US);
        System.out.println(resourceBundle_us.getString("message_success"));

        // VIETNAM
        Locale locale = new Locale("vi","VN");
        ResourceBundle resourceBundle_vi =  ResourceBundle.getBundle(
                "Session_9.Message", locale);
        System.out.println(resourceBundle_vi.getString("message_success"));


        // Default app
        Locale.setDefault(new Locale("vi","VN"));

        ResourceBundle rB = ResourceBundle.getBundle("Session_9.Message");
        System.out.println(rB.getString("message_success"));

        double number = 122333.14152;

        NumberFormat numberFormat  = NumberFormat.getNumberInstance();

        String number2 = numberFormat.format(number);

        System.out.println(number2+1);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

        String currency = currencyFormat.format(number);
        System.out.println(currency);
    }
}
