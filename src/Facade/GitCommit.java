package Facade;

public class GitCommit {
    private String message;
    public void commitChanges(String message){
        this.message = message;
        System.out.println("Commited with message: " + message);
    }
}
