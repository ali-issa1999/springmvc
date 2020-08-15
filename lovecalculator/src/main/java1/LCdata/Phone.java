package LCdata;


public class Phone {
   private String countrycode;
   private String usernumber;

   public String getCountrycode() {
      return this.countrycode;
   }

   public void setCountrycode(String countrycode) {
      this.countrycode = countrycode;
   }

   public String getUsernumber() {
      return this.usernumber;
   }

   public void setUsernumber(String usernumber) {
      this.usernumber = usernumber;
   }

   public String toString() {
      return this.getCountrycode() + "-" + this.getUsernumber();
   }
}
