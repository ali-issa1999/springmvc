package paybill;

import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import org.springframework.format.Formatter;

public class amountformatter implements Formatter<Amount> {
   public String print(Amount object, Locale locale) {
      return null;
   }

   public Amount parse(String text, Locale locale) throws ParseException {
      String[] amounts = text.split(" ");
      Amount amount = new Amount();
      amount.setNumberpayed(amounts[0]);
      Currency currency = Currency.getInstance(amounts[1]);
      String symbol = currency.getSymbol();
      amount.setCurrency(symbol);
      return amount;
   }
}
