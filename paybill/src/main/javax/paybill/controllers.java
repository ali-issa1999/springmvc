package paybill;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllers {
   @RequestMapping({"/"})
   public String paybill(@ModelAttribute("Bill") Bill bill) {
      return "paybill";
   }

   @RequestMapping({"/showinfo"})
   public String billinfo(@ModelAttribute("Bill") Bill bill) {
      return "billinfo";
   }
}
