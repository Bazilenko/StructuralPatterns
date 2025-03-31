package Proxy;

public class ProxyServer implements IServer {
    private ServerNodejs server;
    private static int requestCount = 0;
    private final static int MAX_REQUEST_COUNT = 3;

    @Override
    public void fetchData(){
        if (requestCount < MAX_REQUEST_COUNT){
            if (server == null){
                server = new ServerNodejs();
            }
            server.fetchData();
            requestCount++;
            System.out.println("Request " + requestCount + " executed");
        }
        else{
            System.out.println("Limit of requests!!!");
        }
    }
}
