package domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean groupCanPost;
    private boolean canClose;
    private boolean canOpen;

    public int getCount(){return count;}
    public void setCount(int count){
        this.count = count;
    }
    public boolean getCanPost(){return canPost;}
    public void setCanPost(boolean canPost){
        this.count = count;
    }
    public boolean getGropeCanPost(){return groupCanPost;}
    public void setGroupCanPost(boolean groupCanPost){
        this.groupCanPost = groupCanPost;
    }
    public boolean getCanClose(){return canClose;}
    public void setCanClose(boolean canClose){
        this.canClose = canClose;
    }
    public boolean getCanOpen(){return canOpen;}
    public void setCanOpen(boolean canOpen){
        this.canOpen = canOpen;
    }
}
