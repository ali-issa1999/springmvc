package paybill;

public class Amount {
	   String numberpayed;
	   String currency;

	   public String getNumberpayed() {
	      return this.numberpayed;
	   }

	   public void setNumberpayed(String numberpayed) {
	      this.numberpayed = numberpayed;
	   }

	   public String getCurrency() {
	      return this.currency;
	   }

	   public void setCurrency(String currency) {
	      this.currency = currency;
	   }

	   public String toString() {
	      return this.getCurrency() + this.getNumberpayed();
	   }
	}