package koksha;

import java.util.ArrayList;

public class SalesSlip {
    private ArrayList<SalesItem> items;

    /**
     * Constructs ArrayList of SalesItem
     */
    public SalesSlip() {
        items = new ArrayList<>();
    }

    /**
     * Adds a sales item to the list
     * @param item SalesItem object
     */
    public void addItem(SalesItem item) {
        items.add(item);
    }

    /**
     * Returns total of all sales items in the list
     * @return Total cost combined of all items in list
     */
    public double getTotal() {
        double total = 0;
        for (SalesItem item : items) {
            total += item.getFullCost();
        }
        return total;
    }

    /**
     * Returns a string with each new line displaying an item within the list
     */
    public String toString() {
        String list = new String();
        for (SalesItem item : items) {
            list += item.toString() + "\n";
        }
        return list;
    }
}
