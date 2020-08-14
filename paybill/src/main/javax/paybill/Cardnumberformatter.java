package paybill;

import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

public class Cardnumberformatter implements Formatter<Cardnumber> {
   public String print(Cardnumber object, Locale locale) {
      return null;
   }

   public Cardnumber parse(String creditcard, Locale locale) throws ParseException {
      System.out.println("hi");
      String[] cardnumber = creditcard.split("-");
      Cardnumber card = new Cardnumber();
      card.setFirstfournumbers(cardnumber[0]);
      card.setSecondfournumbers(cardnumber[1]);
      card.setThirdfournumbers(cardnumber[2]);
      card.setFourthfournumbers(cardnumber[3]);
      return card;
   }
}
