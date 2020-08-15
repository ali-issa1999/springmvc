package controllers;

import LCdata.Phone;
import LCdata.UserInfoDTO;
import LCdata.communications;
import LCdata.registerinfo;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LCappcontroller {
   @RequestMapping({"/"})
   public String showhomepage(@ModelAttribute("userinfo") UserInfoDTO userinfodto) {
      return "homepage";
   }

   @RequestMapping({"/process-homepage"})
   public String showResultpage(@Valid @ModelAttribute("userinfo") UserInfoDTO userinfodto, BindingResult result) {
      return result.hasErrors() ? "homepage" : "resultpage";
   }

   @RequestMapping({"/register"})
   public String registerpage(@ModelAttribute("registerinfo") registerinfo registerinf) {
      Phone phone = new Phone();
      phone.setCountrycode("91");
      phone.setUsernumber("123131313");
      communications communication = new communications();
      communication.setPhone(phone);
      registerinf.setCommunication(communication);
      return "register";
   }

   @RequestMapping({"/register-info"})
   public String showregisterinfo(@ModelAttribute("registerinfo") registerinfo registerinfo) {
      return "registerinfo";
   }

//   @RequestMapping({"/bill"})
//   public String paybill(@ModelAttribute("paybill") Bill var1) {
//      throw new Error("Unresolved compilation problem: \n\tBill cannot be resolved to a type\n");
//   }
//
//   @RequestMapping({"/showinfobill"})
//   public String billinfo(@ModelAttribute("paybill") Bill var1) {
//      throw new Error("Unresolved compilation problem: \n\tBill cannot be resolved to a type\n");
//   }
}