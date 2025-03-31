package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.LoanService;

public class ClientApp {
    public static void main(String[] args) {
        // Create ApplicationContext container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the LoanService bean
        LoanService service = context.getBean("service", LoanService.class);

        // Call business method
        float intramt = service.calcIntrAmt(1009, "Raja", 9000, 2, 20);
        System.out.println("Interest Amount: " + intramt);
    }
}
