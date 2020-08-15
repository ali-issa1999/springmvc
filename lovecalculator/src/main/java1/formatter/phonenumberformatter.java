package formatter;

import LCdata.Phone;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

public class phonenumberformatter implements Formatter<Phone> {
   public String print(Phone object, Locale locale) {
      System.out.println("inside print method formatter class");
      return object.toString();
   }

   public Phone parse(String completephonenumber, Locale locale) throws ParseException {
      String[] phonenumberarray = completephonenumber.split("-");
      Phone phone = new Phone();
      int index = completephonenumber.indexOf("-");
      if (index == -1) {
         phone.setCountrycode("961");
         phone.setUsernumber(phonenumberarray[0]);
      } else if (index == 0) {
         phone.setCountrycode("961");
         phone.setUsernumber(phonenumberarray[1]);
      } else {
         phone.setCountrycode(phonenumberarray[0]);
         phone.setUsernumber(phonenumberarray[1]);
      }

      System.out.println("parsemethod");
      return phone;
   }
}