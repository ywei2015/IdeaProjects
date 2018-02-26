package rmi.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rmi.client.HelloRMIService;

public class RMIClientTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("rmiClient.xml");
        HelloRMIService helloRMIService =  applicationContext.getBean("myRMIClient",HelloRMIService.class);
        System.out.println(helloRMIService.getAdd(3, 4));
    }
}
