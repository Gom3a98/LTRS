package ltrs;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class PostAccess  {

 private Post myPost;

    public Post getMyPost() {
        return myPost;
    }

    public void setMyPost(Post myPost) {
        this.myPost = myPost;
    }

  public void getpost() {
  }

  public void updatepost() {
  }

  public void deletePost() {
  }

  public void savePost() throws IOException {
      
      String Record="";
      Record+=myPost.getOwnerId();
      Record+="|";
      Record+=myPost.getMyCategory().getCatName();
      Record+="|";
      Record+=myPost.getPostId();
      Record+="|";
      
      Record+=myPost.getDescription();
       BufferedWriter writer = new BufferedWriter(new FileWriter("Posts.txt"));
       writer.append(Record);
       writer.newLine();
       writer.close();
   

  }

}