package domain;

public class Post {
    private int id;
    private String imageURL;
    private String name;
    private String description;
    private Like like;
    private RepostInfo repostInfo;
    private String optionsInfo;
    private int viewsInfo;
    private CommentsInfo commentsInfo;
    private CopyRight copyRight;
    private GeoInfo geoInfo;

    private int ownerWallId; //идентификатор владельца стены
    private int ownerPostId; //идентификатор владельца записи
    private int date;//время публикации


    public int getId(){return id;}
    public void setId(int id){
        this.id = id;
    }
    public String getImageURL(){return imageURL;}
    public void setImageURL(String imageURL){
        this.imageURL = imageURL;
    }
    public String getNamePost(){return name;}
    public void setName(String name){
        this.name = name;
    }
    public String getDescription() {return description;}
    public void setDescription(String description){
        this.description = description;
    }
    public Like getLike() {return like;}
    public void setLike(Like like){
        this.like = like;
    }
    public RepostInfo getRepostInfo() {return repostInfo;}
    public void setRepostInfo(RepostInfo repostInfo){
        this.repostInfo = repostInfo;
    }
    public String getOptionsInfo() {return optionsInfo;}
    public void setOptionsInfo(String optionsInfo){
        this.optionsInfo = optionsInfo;
    }
    public int getViewsInfo() {return viewsInfo;}
    public void setViewsInfo(int viewsInfo){
        this.viewsInfo = viewsInfo;
    }
    public CommentsInfo getCommentsInfo() {return commentsInfo;}
    public void setCommentsInfo(CommentsInfo commentsInfo){
        this.commentsInfo = commentsInfo;
    }
    public CopyRight getCopyRight() {return copyRight;}
    public void setCopyRight(CopyRight copyRight){
        this.copyRight = copyRight;
    }
    public GeoInfo getGeoInfo() {return geoInfo;}
    public void setGeoInfo(GeoInfo geoInfo){
        this.geoInfo = geoInfo;
    }
    public int getOwnerWallId(){return ownerWallId;}
    public void setOwnerWallId(int ownerPostId){
        this.ownerWallId = ownerWallId;
    }
    public int getOwnerPostId(){return ownerPostId;}
    public void setOwnerPostId(int ownerPostId){
        this.ownerPostId = ownerPostId;
    }
    public int getDate(){return date;}
    public void setDate(int date){
        this.date = date;
    }
   }




