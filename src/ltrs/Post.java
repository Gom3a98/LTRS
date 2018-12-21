import java.awt.Image;
import java.util.Vector;
import ltrs.Category;

public class Post {

  private Integer PostId;

  private String Description;

  private Image Photo;

  private String OwnerId;

    public Vector  <Category> myCategory;
    
    

  public void search() {
  }

  public void viewPosts() {
  }

  public void EditPost() {
  }

  public void DeletePost() {
  }

  public void CreatePost() {
  }

    public Integer getPostId() {
        return PostId;
    }

    public void setPostId(Integer PostId) {
        this.PostId = PostId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Image getPhoto() {
        return Photo;
    }

    public void setPhoto(Image Photo) {
        this.Photo = Photo;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

}