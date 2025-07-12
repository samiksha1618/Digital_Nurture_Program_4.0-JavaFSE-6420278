import java.util.*;

public class SearchDemo {

    // Linear Search3
    static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.productId == id)
                return p;
        }
        return null;
    }

    // Binary Search 
    static Product binarySearch(Product[] products, int id) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == id)
                return products[mid];
            else if (products[mid].productId < id)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter product details for product " + (i + 1));
            System.out.print("Enter product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter category: ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }

        System.out.print("\nEnter the product ID to search: ");
        int searchId = sc.nextInt();

        
        Product foundLinear = linearSearch(products, searchId);
        if (foundLinear != null)
            System.out.println(" Product found using Linear Search: " + foundLinear);
        else
            System.out.println("Product not found using Linear Search.");

        
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        
        Product foundBinary = binarySearch(products, searchId);
        if (foundBinary != null)
            System.out.println(" Product found using Binary Search: " + foundBinary);
        else
            System.out.println(" Product not found using Binary Search.");
    }
}
