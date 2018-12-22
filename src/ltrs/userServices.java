package ltrs;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class userServices {

    private Person myPerson;
    public Vector <PostAccess>myPostAcess;
    public useracces access;
  public void createUser() {
  }

  public void displayUser() {
  }

  public void SignIn() {
  }

  public void SignUp() throws IOException {
      String Record="";
      Record+=myPerson.getEmail();
      Record+="|";
      Record+=myPerson.getPassword();
      Record+="|";
      Record+=myPerson.getName();
      Record+="|";
      Record+=myPerson.getContact().getPhoneNumber();
      Record+="#";

      access.saveUser(Record);
      
  }

  public void edituser() {
  }

  public void updateUserinf() {
  }

    public Person getMyPerson() {
        return myPerson;
    }

    public void setMyPerson(Person myPerson) {
        this.myPerson = myPerson;
    }

}