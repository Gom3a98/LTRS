
package ltrs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class userServices {

    public userServices() {
        this.myPerson = new Person();
        this.myPostAcess = new Vector<>();
        this.access = new useracces();
    }

    private Person myPerson;
    public Vector <PostAccess>myPostAcess;
    public useracces access;
  public void createUser() {
  }

  public void displayUser() {
  }

  public boolean SignIn(String email,String pass ) throws IOException {
      
      if (access.GetUser(email, pass))
          return true;
      else return false;
  
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