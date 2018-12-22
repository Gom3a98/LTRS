package ltrs;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class useracces {

    public Person myPerson;

  public void getuser() {
  }

  public void updateUser() {
  }

  public void deleteUser() {
  }

  public void saveUser(String Record) throws IOException {
      
       BufferedWriter writer = new BufferedWriter(new FileWriter("User.txt"));
       writer.write(Record);
       writer.close();
   
      
  }

}