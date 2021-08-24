package domain;

public class Post {
    private int id;
    private String imageURL;
    private String name;
    private String description;
    private boolean like;
    private String share;
    private String optionsInfo;
    private int viewsInfo;
    private String commentsInfo;

    public int getPostForViews(){return id;}
    public String getImageURL(){return imageURL;}
    public String getNamePost(){return name;}
    public String getDescription() {return description;}
    public boolean getLike() {return like;}
    public String getShare() {return share;}
    public String getOptionsInfo() {return optionsInfo;}
    public int getViewsInfo() {return viewsInfo;}
    public String getCommentsInfo() {return commentsInfo;}

    public void setId(int id){
        this.id = id;
    }
    public void setImageURL(String imageURL){
        this.imageURL = imageURL;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setLike(boolean like){
        this.like = like;
    }
    public void setShare(String share){
        this.share = share;
    }
    public void setOptionsInfo(String optionsInfo){
        this.optionsInfo = optionsInfo;
    }
    public void setViewsInfo(int viewsInfo){
        this.viewsInfo = viewsInfo;
    }
    public void setCommentsInfo(String commentsInfo){
        this.commentsInfo = commentsInfo;
    }
}




