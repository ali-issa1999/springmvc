package initialize;


import config.lovecalculatorConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class app_initialize_method_2 extends AbstractAnnotationConfigDispatcherServletInitializer {
   protected Class<?>[] getRootConfigClasses() {
      return null;
   }

   protected Class<?>[] getServletConfigClasses() {
      Class[] arr = new Class[]{lovecalculatorConfig.class};
      return arr;
   }

   protected String[] getServletMappings() {
      String[] arr = new String[]{"/"};
      return arr;
   }
}