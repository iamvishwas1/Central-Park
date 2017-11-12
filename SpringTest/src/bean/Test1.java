package bean;  
  
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test1 {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("resources/spring.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      System.out.println("Validate");
    //Employee emp=(Employee)factory.getBean("employeebean");  
    
}  
} 