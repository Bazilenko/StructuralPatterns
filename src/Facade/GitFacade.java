package Facade;

public class GitFacade {
    private GitAdd gitAdd;
    private GitRepository gitRepository;
    private GitCommit gitCommit;
    private GitPush gitPush;

    public GitFacade(){
        this.gitAdd = new GitAdd();
        this.gitRepository = new GitRepository();
        this.gitCommit = new GitCommit();
        this.gitPush = new GitPush();
    }

    public void initializeAndAdd(String file){
        gitRepository.initRepository();
        gitAdd.add(file);
    }

    public void commitAndPush(String message, String branch){
        gitCommit.commitChanges(message);
        gitPush.push(branch);
    }
}
