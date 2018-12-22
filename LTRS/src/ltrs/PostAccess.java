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
  
 //this function is not imblemented by our leader gom3a but only by me 
 // w n4kor elmo3edeen bto3 sw 3la elmaghod el3azem da w yareet na5od full mark b2a 
 //kfaya el midtem

  public void savePost() throws IOException {
      
      String Record="";
      Record+=myPost.getOwnerId();
      Record+="|";
      Record+=myPost.getMyCategory().getCatName();
      Record+="|";
      Record+=myPost.getPostId();
      Record+="|";
      
      Record+=myPost.getDescription();
      Record+="\n";

       BufferedWriter writer = new BufferedWriter(new FileWriter("Posts.txt"));
       writer.write(Record);
       writer.close();
   
  }

}
