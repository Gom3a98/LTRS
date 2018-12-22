package ltrs;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import ltrs.Category;

public class Post {

  private String PostId;

  private String Description;


  private String OwnerId;

    private Category myCategory;
    
    

  
public Post search(String match) throws FileNotFoundException, IOException {	// in post class
	   String log = "Posts.txt";
      File file = new File(log);
      
      BufferedReader br = new BufferedReader(new FileReader(file)) ;
    String line;
   
     String[] strArray = new String[4];
    while ((line = br.readLine()) != null) {
          strArray = line.split("|");
          Post obj = new Post();
          
          String  CatName=strArray[1];
          if (CatName.equals(match)){
              Category o = new Category();
              obj.setOwnerId(strArray[0]);
              o.setCatName(CatName);
              obj.setMyCategory(o);
              obj.setPostId(strArray[2]);
              obj.setDescription(strArray[3]);
              br.close();
              return obj;

          }
    
    }
    br.close();
    return null;
  
    
}

  public void viewPosts() {
  }

  public void EditPost() {
  }

  public void DeletePost() {
  }

  public void CreatePost() {
  }

    public String getPostId() {
        return "P"+i++;
    }

    public void setPostId(String PostId) {
        this.PostId = PostId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
private static int i=0 ;
    public String getOwnerId() {
        return "o"+i++;
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