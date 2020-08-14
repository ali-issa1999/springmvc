package paybill;

public class Cardnumber {
	   String firstfournumbers;
	   String secondfournumbers;
	   String thirdfournumbers;
	   String fourthfournumbers;

	   public String getFirstfournumbers() {
	      return this.firstfournumbers;
	   }

	   public void setFirstfournumbers(String firstfournumbers) {
	      this.firstfournumbers = firstfournumbers;
	   }

	   public String getSecondfournumbers() {
	      return this.secondfournumbers;
	   }

	   public void setSecondfournumbers(String secondfournumbers) {
	      this.secondfournumbers = secondfournumbers;
	   }

	   public String getThirdfournumbers() {
	      return this.thirdfournumbers;
	   }

	   public void setThirdfournumbers(String thirdfournumbers) {
	      this.thirdfournumbers = thirdfournumbers;
	   }

	   public String getFourthfournumbers() {
	      return this.fourthfournumbers;
	   }

	   public void setFourthfournumbers(String fourthfournumbers) {
	      this.fourthfournumbers = fourthfournumbers;
	   }

	   public String toString() {
	      return this.getFirstfournumbers() + "-" + this.getSecondfournumbers() + "-" + this.getThirdfournumbers() + "-" + this.getFourthfournumbers();
	   }
	}