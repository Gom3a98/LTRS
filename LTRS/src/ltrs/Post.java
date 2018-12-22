package ltrs;
import java.awt.Image;
import java.util.Vector;
import ltrs.Category;

public class Post {

  private Integer PostId;

  private String Description;


  private String OwnerId;

    private Category myCategory;
    
    

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

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    public Category getMyCategory() {
        return myCategory;
    }

    public void setMyCategory(Category myCategory) {
        this.myCategory = myCategory;
    }

}