package rmi.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIServiceTest {

    public static void main(String[] args) {

        new ClassPathXmlApplicationContext("rmiServer.xml");

    }

}
