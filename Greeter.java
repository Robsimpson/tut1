import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale;
  private String name;

  public Greeter(String language, String country, String name) {
    locale = new Locale(language, country);
    this.name = name;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
    //merged the two features here so it is upper case AND markdown highlighted
    return messages.getString("greeting") + ", " + "_" + name.toUpperCase() + "_";

  }

  public static void main(String[] args) {

    if (args.length != 3) {
      System.out.println('Incorrect number of arguments input');
      exit(0);
    }
    
    String language = args[0];
    String country = args[1];
    String name = args[2];
    Greeter greeter = new Greeter(language, country, name);
    System.out.println(greeter.sayHello());
  }
}
