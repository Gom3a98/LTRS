package ltrs;
import java.util.Vector;

public class Person {


  private String name;

  private String Email;

  private String Password;

 private Contact contact;
    private Vector<Post> myPost;
 private profile profile;


  private Vector <userServices> myuserServices;
  private Validation consists_of;

  Person()
  {
  }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Vector<Post> getMyPost() {
        return myPost;
    }

    public void setMyPost(Vector<Post> myPost) {
        this.myPost = myPost;
    }

    public profile getProfile() {
        return profile;
    }

    public void setProfile(profile profile) {
        this.profile = profile;
    }

    public Vector <userServices> getMyuserServices() {
        return myuserServices;
    }

    public void setMyuserServices(Vector <userServices> myuserServices) {
        this.myuserServices = myuserServices;
    }

    public Validation getConsists_of() {
        return consists_of;
    }

    public void setConsists_of(Validation consists_of) {
        this.consists_of = consists_of;
    }
  

}