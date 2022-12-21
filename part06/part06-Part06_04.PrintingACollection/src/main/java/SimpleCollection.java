
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
    /* 
    The collection alphabet is empty.

The collection alphabet has 1 element:
a
    */
    if (elements.isEmpty()) {
        return "The collection " + this.name + " is empty.";
    }
    
    String elementsString = "";
    for(String elem: elements) {
        if (elem == elements.get(elements.size() -1)) {
            elementsString += elem;
            break;
        }
        elementsString += elem + "\n";
    }
    
    String plural = "";
    
    if(elements.size() > 1) {
        plural = "s";
    }
    
    return "The collection " + this.name + " has " +
            this.elements.size() + " element"+ plural +":" + "\n" + elementsString;
 
    }
    
}
