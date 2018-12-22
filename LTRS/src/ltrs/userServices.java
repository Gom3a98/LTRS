
package ltrs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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

  public boolean SignIn(String email,String pass ) {
      String log = "/ws/priyapan-rcd/label" + "priyanka_label_test" + ".log";
      File file = new File(log);
      boolean chek=false;
      try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    String line;
    String em=" ";
    String password=" ";
    //boolean chek=false;
     String[] strArray;
    while ((line = br.readLine()) != null) {
          strArray = line.split("[@#]");
          em=strArray[0];
          password=strArray[1];
          if (em.equals(email)&&password.equals(pass)){
             chek=true;
             break;
          }
          else{
              line="";
              em="";
              password="";
              chek=false;
          }
    }
}
catch (Exception e) {
    System.out.println("come inside loop to check logs.label update faild");
}
      return chek;
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