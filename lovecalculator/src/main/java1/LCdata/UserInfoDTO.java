package LCdata;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
   @NotBlank(
      message = "* user name can't be blank"
   )
   @Size(
      min = 3,
      max = 15,
      message = "length between 3 and 15"
   )
   private String username;
   private String crushname;
   @AssertTrue(
      message = "you have to agree to terms and conditions"
   )
   private boolean agree;

   public boolean isAgree() {
      return this.agree;
   }

   public void setAgree(boolean agree) {
      this.agree = agree;
   }

   public String getUsername() {
      return this.username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getCrushname() {
      return this.crushname;
   }

   public void setCrushname(String crushname) {
      this.crushname = crushname;
   }
}