package paybill;



import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class appinitialize extends AbstractAnnotationConfigDispatcherServletInitializer {
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
