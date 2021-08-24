package domain;

public class Like {
    private int count;
    private boolean userLike;
    private boolean canLike;
    private boolean canPublish;

    public int getCount(){return count;}
    public void setCount(int count){
        this.count = count;
    }
    public boolean getUserLike(){return userLike;}
    public void setUserLike(boolean userLike){
        this.userLike = userLike;
    }
    public boolean getCanLike(){return canLike;}
    public void setCanLike(boolean canLike){
        this.canLike = canLike;
    }

    public boolean getCanPublish(){return canPublish;}
    public void setCanPublish(boolean canPublish){
        this.canPublish = canPublish;
    }

}
