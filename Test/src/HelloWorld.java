import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World");
    List<String> cities = new ArrayList<String>();
    cities.add("Kyoto");
    cities.add("Oosaka");
    cities.add("Kobe");

    for (int i = 0; i < cities.size(); i++) {
      System.out.println(cities.get(i));
    }

    for (Iterator<String> iterator = cities.iterator(); iterator.hasNext();) {
      System.out.println(iterator.next());
    }

    for (String city : cities) {
      System.out.println(city);
    }

    cities.forEach(new Consumer<String>() {
      public void accept(final String city) {
        System.out.println(city);
      }
    });

    cities.forEach((final String city) -> System.out.println(city));

    System.out.println("Hi, what's up?");
  }
}