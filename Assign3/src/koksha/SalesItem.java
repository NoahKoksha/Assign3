package koksha;

public class SalesItem {
    private String name;
    private double cost;
    private int quant;

    /**
     * Constructs a item
     * @param n Item name
     * @param p Item price
     * @param q Item quantity
     */
    public SalesItem(String n, double p, int q) {
        this.name = n;
        this.cost = p;
        this.quant = q;
    }
    /**
     * Sets item name
     * @param n Name of item
     */
    public void setName(String n) {
        this.name = n;
    }
    
    /**
     * Returns item's name
     * @return String - Items name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets item cost
     * @param c Cost of item
     */
    public void setCost(double c) {
        this.cost = c;
    }

    /**
     * Returns item's cost
     * @return double - cost of item
     */
    public double getCost() {
        return cost;
    }
    
    /**
     * Sets quantity of an item
     * @param q Amount of an item
     */
    public void setQuant(int q) {
        this.quant = q;
    }

    /**
     * Returns quantity of an item
     * @return Intriguer - Amount of a specific item
     */
    public int getQuantity() {
        return quant;
    }

    /**
     * Returns total cost of a specific item based off of how many are purchased
     * @return  Cost of the item multiplied by amount purchased
     */
    public double getFullCost() {
        return cost * quant;
    }

    /**
     * Returns string formated to display item name, cost, and quantity
     */
    public String toString() {
        return name + " $" + String.format("%.2f", cost) + " " + quant;
    }

}
