package paybill;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(
   basePackages = {"paybill"}
)
public class lovecalculatorConfig implements WebMvcConfigurer {
   @Bean
   public InternalResourceViewResolver viewresolver() {
      InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();
      viewresolver.setPrefix("/WEB-INF/view/");
      viewresolver.setSuffix(".jsp");
      return viewresolver;
   }

   public void addFormatters(FormatterRegistry registry) {
      System.out.println("formatter in config file");
      registry.addFormatter(new Cardnumberformatter());
      System.out.println("formatter in config file");
      registry.addFormatter(new amountformatter());
   }
}
