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
    private String OwnerName;
    private Category myCategory;
    

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
    public String getName() {
        return OwnerName;
    }

    public void setName(String OwnerId) {
        this.OwnerName = OwnerId;
    }

    public Category getMyCategory() {
        return myCategory;
    }

    public void setMyCategory(Category myCategory) {
        this.myCategory = myCategory;
    }

}