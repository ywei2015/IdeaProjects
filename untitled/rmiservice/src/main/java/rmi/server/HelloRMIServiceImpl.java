package rmi.server;

public class HelloRMIServiceImpl implements HelloRMIService{
    public int getAdd(int a, int b) {
        return a+b+3;
    }
}
