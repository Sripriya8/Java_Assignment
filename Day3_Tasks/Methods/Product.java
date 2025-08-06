public class Product {
    String name;
    float price;
    String category;
    int quantity;

    public Product(String name, float price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    // 1. Method to print product details (no return, no parameter)
    public void printDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }

    // 2. Method to apply discount and return new price (return type, with parameters)
    public float applyDiscount(float discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount percentage!");
            return price;
        }
        return (price - (price * discountPercentage / 100));
    }

    // 3. Method to check if product is available in stock (return type, with parameter)
    public boolean isAvailable(int requiredQuantity) {
        return quantity >= requiredQuantity;
    }

    // 4. Method to print out-of-stock alert (no return, with parameter)
    public void printOutOfStockAlert(int requiredQuantity) {
        if (!isAvailable(requiredQuantity)) {
            System.out.println(String.format("Product %s is out of stock or insufficient quantity.", this.name));
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000, "Electronics", 5);

        // 1. Print product details
        p1.printDetails();

        // 2. Apply discount
        float newPrice = p1.applyDiscount(10);
        System.out.println(String.format("Price after discount: %.2f" , newPrice));
        System.out.println();

        // 3. Check availability
        int requiredQty = 3;
        if (p1.isAvailable(requiredQty)) {
            System.out.println(String.format("Product is available for quantity: %d", requiredQty));
        } else {
            System.out.println(String.format("Product is NOT available for quantity: %d" , requiredQty));
        }
        System.out.println();

        // 4. Print out-of-stock alert
        p1.printOutOfStockAlert(10);
    }
}
