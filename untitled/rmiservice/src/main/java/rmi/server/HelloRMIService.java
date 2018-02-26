package rmi.server;

public interface HelloRMIService {
    public int  getAdd(int a, int b);

    public void loginAuthenticate(String token);
}
