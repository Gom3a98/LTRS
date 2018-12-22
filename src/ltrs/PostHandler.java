package ltrs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PostHandler {

    public Post search(String match) throws FileNotFoundException, IOException {	// in post class
	   String log = "Posts.txt";
      File file = new File(log);
      
      BufferedReader br = new BufferedReader(new FileReader(file)) ;
    String line;
   
     String[] strArray = new String[4];
    while ((line = br.readLine()) != null) {
          strArray = line.split("&");
          Post obj = new Post();
          System.out.println(strArray[0]);
          String  CatName=strArray[1];
          if (CatName.equals(match)){
              Category o = new Category();
              obj.setName(strArray[0]);
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

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public PostAccess getAccess() {
        return access;
    }

    public void setAccess(PostAccess access) {
        this.access = access;
    }

  public void EditPost() {
  }

  public void DeletePost() {
  }

  public void CreatePost() throws IOException {
    
      String Record="";
      Record+=user.getName();
      Record+="&";
      Record+=myPost.getMyCategory().getCatName();
      Record+="&";
      Record+=myPost.getPostId();
      Record+="&";
      
      Record+=myPost.getDescription();
      access.setMyPost(myPost);
      access.savePost(Record);
  
  }

    private Person user;
    private PostAccess access;

    private Post myPost;
    
    public Post getMyPost() {
        return myPost;
    }

    public PostHandler() {
        this.user = new Person();
        this.access = new PostAccess();
        this.myPost = new Post();
    }

    public void setMyPost(Post myPost) {
        this.myPost = myPost;
    }
}
