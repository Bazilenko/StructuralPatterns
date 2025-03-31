package Proxy;

public class ServerNodejs implements IServer{
    @Override
    public void fetchData(){
        System.out.println("Load data from node js server...");
    }
}
