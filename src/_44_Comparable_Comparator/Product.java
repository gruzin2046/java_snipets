package _44_Comparable_Comparator;

public class Product implements Comparable<Product>
       // , Comparator<Product>
{
    double price;
    String name;

    // Comparable<T> is the best way if we want to have one standard for comparing objects.
    // interface has one method - CompareTo()
    // We need to overwrite and decide about that standard:

    @Override
    public int compareTo(Product o) {
        // in this case we compare price at first:
        if (this.price > o.price) return 1;
        else if (this.price < o.price) return -1;
        // if prices are equal we compare names (alphabetical order):
        return this.name.compareTo(o.name);
    }

    // Comparator<T> is the best way if we want to have different methods for compare
    // here we have
    /*@Override
    public int compare(Product o1, Product o2) {
        return 0;*/
        // we can define default implementation for compare() method:
        /*if (o1.price > o2.price) return 1;
        else if (o1.price < o2.price) return -1;
        return this.name.compareTo(o2.name);*/
    //}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + "Product{" +
                "name=" + name +
                "price=" + price +
                '}';
    }



}
