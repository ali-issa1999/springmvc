package LCdata;

public class registerinfo {
	   String user;
	   String username;
	   char[] password;
	   String country;
	   String[] hobbies;
	   communications communication;
	   String gender;
	   String number;

	   public communications getCommunication() {
	      return this.communication;
	   }

	   public void setCommunication(communications communication) {
	      this.communication = communication;
	   }

	   public String getNumber() {
	      return this.number;
	   }

	   public void setNumber(String number) {
	      this.number = number;
	   }

	   public String getGender() {
	      return this.gender;
	   }

	   public void setGender(String gender) {
	      this.gender = gender;
	   }

	   public String[] getHobbies() {
	      return this.hobbies;
	   }

	   public void setHobbies(String[] hobbies) {
	      this.hobbies = hobbies;
	   }

	   public String getUser() {
	      return this.user;
	   }

	   public void setUser(String user) {
	      this.user = user;
	   }

	   public String getUsername() {
	      return this.username;
	   }

	   public void setUsername(String username) {
	      this.username = username;
	   }

	   public char[] getPassword() {
	      return this.password;
	   }

	   public void setPassword(char[] password) {
	      this.password = password;
	   }

	   public String getCountry() {
	      return this.country;
	   }

	   public void setCountry(String country) {
	      this.country = country;
	   }
	}