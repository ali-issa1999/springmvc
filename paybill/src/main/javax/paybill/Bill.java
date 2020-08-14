package paybill;

public class Bill {
	   Amount amount;
	   Cardnumber cardnumber;

	   public String toString() {
	      return "Bill [amount=" + this.amount + ", cardnumber=" + this.cardnumber + "]";
	   }

	   public Amount getAmount() {
	      return this.amount;
	   }

	   public void setAmount(Amount amount) {
	      this.amount = amount;
	   }

	   public Cardnumber getCardnumber() {
	      return this.cardnumber;
	   }

	   public void setCardnumber(Cardnumber cardnumber) {
	      this.cardnumber = cardnumber;
	   }
	}
