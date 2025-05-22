import java.util.stream.Stream;
import java.util.*;

public class StreamArray{
    public static void main(String args[]) {
        List<String> names = new ArrayList<>();
        names.add("Suriya");
        names.add("vishnu");
        names.add("ram");
        names.add("kumar");
        names.add("aathix");
        Stream<String> data = names.stream();
        data.forEach(name -> System.out.println(name));
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String search = obj.nextLine();

        Optional<String> result = names.stream().filter(name -> name.equalsIgnoreCase(search)).findFirst();
        if (result.isPresent())
        {
            System.out.println("Name Found: " + result.get());
        } 
        else 
        {
            System.out.println(search + " not found");
        }
    }
}


