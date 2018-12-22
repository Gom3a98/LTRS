package ltrs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class useracces {

    public useracces() {
        this.myPerson = new Person();
    }

    public Person myPerson;

public boolean GetUser(String email,String pass ) throws FileNotFoundException, IOException  {
      String log = "User.txt";
      File file = new File(log);
      
      BufferedReader br = new BufferedReader(new FileReader(file)) ;
    String line;
   
     String[] strArray = new String[4];
    while ((line = br.readLine()) != null) {
          strArray = line.split("&");
          System.out.println(strArray[0]+"\t"+strArray[1]);
          String em=strArray[0];
         String  password=strArray[1];
          if (em.equals(email)&&password.equals(pass)){
              myPerson.setEmail(email);
              myPerson.setPassword(pass);
              myPerson.setName(strArray[2]);
              Contact x = new Contact();
              x.setPhoneNumber(strArray[3]);
             return true;
          }
    
    }
    
      return false;

  }

  public void updateUser() {
  }

  public void deleteUser() {
  }

  public void saveUser(String Record) throws IOException {
      
       BufferedWriter writer = new BufferedWriter(new FileWriter("User.txt",true));
       writer.write(Record);
       writer.newLine();
       writer.close();
   
      
  }

}