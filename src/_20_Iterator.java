import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _20_Iterator {
    public static void main(String[] args) {

        String[] names = {"ala","ada","asia","kasia","beata","kamil"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        // create iterator based on list.
        // iterator is a pointer who point certain element on the list.
        // we can use iterator to remove element from dynamic list,
        // without problems with index.
        Iterator<String> iterator = nameList.iterator();

        // use while + iterator.hasNext() to walk through the list
        // hasNext() is returning boolean
        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            if (currentElement.equals("beata")) {
                iterator.remove();
            }
        }

        System.out.println(nameList);
    }
}
