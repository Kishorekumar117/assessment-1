package ShopingCart;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String pName;
    private double pBasePrice;
    private int pQuantity;

    public Product(String pName, double pBasePrice, int pQuantity) {
        this.pName = pName;
        this.pBasePrice = pBasePrice;
        this.pQuantity = pQuantity;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpBasePrice() {
        return pBasePrice;
    }

    public void setpBasePrice(double pBasePrice) {
        this.pBasePrice = pBasePrice;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public double getTotalPrice() {
        return pBasePrice * pQuantity;
    }


}

class Cart {

    private ArrayList<Product> productList;
private ArrayList<Product> cart;
    private Scanner scanner;
    private ArrayList<Product> copyProduct;
double oldPrice;
double pTotal;


    public Cart() {
        productList = new ArrayList<>();
cart=new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeProducts();
copyProduct = new ArrayList<>(productList);
    }

    private void initializeProducts() {
        productList.add(new Product("Butter", 45, 0));
        productList.add(new Product("Milk", 30, 0));
        productList.add(new Product("Bread", 25, 0));
        productList.add(new Product("Eggs", 50, 0));
        productList.add(new Product("Cheese", 60, 0));
        productList.add(new Product("Yogurt", 40, 0));
        productList.add(new Product("Jam", 55, 0));
    }

    public void viewCart() {
System.out.println("\nView Products");
System.out.println("---------------------------------------");
        for (Product product : productList) {
            System.out.print(product.getpName());
            System.out.println("        " + product.getpBasePrice());
        }
System.out.println("----------------------------------------");
    }

    public void addToCart() {

			System.out.println("\nView Products");
			System.out.println("---------------------------------------");
			        for (Product product : productList) {
			            System.out.print(product.getpName());
			            System.out.println("        " + product.getpBasePrice());
			        }
			System.out.println("----------------------------------------");
			
			boolean flag=true;
			int z=0;
			boolean found = false;
			while(flag){
			scanner.nextLine();
			System.out.print("Enter product name to add: ");
			String productName = scanner.nextLine();
			
			for (Product product : cart) {
	            if (product.getpName().equalsIgnoreCase(productName)) {
	            	
	            	System.out.print("The Product is already avalible ");
	            	z=1;
	         
	            }
	            else {
	            	z=0;
	            }
	            
	            
	        }
			if(z==0) {
			 for (Product product : productList) {
			            if (product.getpName().equalsIgnoreCase(productName)) {
			            	
				            	System.out.print("Enter quantity: ");
				    			int quantity = scanner.nextInt();
		
				            	Product selectedProduct = new Product(product.getpName(), product.getpBasePrice()*quantity, quantity);
				            	cart.add(selectedProduct);
				            
				            	System.out.println("\nProduct added to the cart!");
				            	found=true;
			         
			            }
			            
			        }
			}
			 
			 if (!found) {
		            System.out.print("\nProduct not found Product List \n"
		            		+ "Do you want to add products? (1 for Yes / 0 for No): ");
		        }
			 else {
				 System.out.print("\nDo you want to add more products? (1 for Yes / 0 for No): ");
			 }
			int choice = scanner.nextInt();
			scanner.nextLine();
			if (choice == 0) {
			flag = false;
			}
			        }
			
			
			System.out.println("\nView Products");
			System.out.println("---------------------------------------");
			        for (Product product : cart) {
			            System.out.print(product.getpName());
			System.out.print("        " +product.getpQuantity());
			            System.out.println("        " + product.getpBasePrice());
			        }
			System.out.println("----------------------------------------");
			    }

    public void modifyQuantity() {
    System.out.println("\nView Products in Cart");
    System.out.println("---------------------------------------");
    for (Product product : cart) {
        System.out.print(product.getpName());
        System.out.print("        " + product.getpQuantity());
        System.out.println("        " + product.getpBasePrice());
    }
    System.out.println("----------------------------------------");

    boolean flag = true;
    while (flag) {
        scanner.nextLine();
        System.out.print("Enter product name to modify quantity: ");
        String productName = scanner.nextLine();


        for (Product product : productList) {
            if (product.getpName().equalsIgnoreCase(productName)) {
            	oldPrice=product.getpBasePrice();
            }
        }


        boolean found = false;
        for (Product product : cart) {
            if (product.getpName().equalsIgnoreCase(productName)) {
                System.out.print("Enter new quantity: ");
                int newQuantity = scanner.nextInt();
                product.setpQuantity(newQuantity);
                product.setpBasePrice(oldPrice*newQuantity);
                System.out.println("Quantity modified for " + productName);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found in the cart!");
        }

        System.out.println("Do you want to modify quantity of more products? (1 for Yes / 0 for No): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 0) {
            flag = false;
        }
    }

    System.out.println("\nView Products in Cart after modification");
    System.out.println("---------------------------------------");
    for (Product product : cart) {
        System.out.print(product.getpName());
        System.out.print("        " + product.getpQuantity());
        System.out.println("        " + product.getpBasePrice());
    }
    System.out.println("----------------------------------------");
}

    public void removeFromCart() {
    System.out.println("\nView Products in Cart");
    System.out.println("---------------------------------------");
    for (Product product : cart) {
        System.out.print(product.getpName());
        System.out.print("        " + product.getpQuantity());
        System.out.println("        " + product.getpBasePrice());
    }
    System.out.println("----------------------------------------");

    boolean flag = true;
    while (flag) {
        scanner.nextLine();
        System.out.print("Enter product name to remove from cart: ");
        String productName = scanner.nextLine();

        boolean found = false;
        for (Product product : cart) {
            if (product.getpName().equalsIgnoreCase(productName)) {
                cart.remove(product);
                System.out.println(productName + " removed from the cart!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found in the cart!");
        }

        System.out.println("Do you want to remove more products from the cart? (1 for Yes / 0 for No): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 0) {
            flag = false;
        }
    }

    System.out.println("\nView Products in Cart after removal");
    System.out.println("---------------------------------------");
    for (Product product : cart) {
        System.out.print(product.getpName());
        System.out.print("        " + product.getpQuantity());
        System.out.println("        " + product.getpBasePrice());
    }
    System.out.println("----------------------------------------");
}

    public void exit(){

    System.out.println("\nView Products in Cart");
    System.out.println("---------------------------------------");
    for (Product product : cart) {
        System.out.print(product.getpName());
        System.out.print("        " + product.getpQuantity());
        System.out.println("        " + product.getpBasePrice());
pTotal += product.getpBasePrice();
    }
    System.out.println("----------------------------------------");
System.out.println(" TOTAL PRICE    :    "+pTotal);
}

    public void start() {
        int choice=0;
        do {
        try {
            System.out.println("\nMenu:");
            System.out.println("---------------------------------------");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. Modify Quantity");
            System.out.println("4. Remove Product");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewCart();
                    break;

                case 2:
                    scanner.nextLine();
                    addToCart();
                    break;

                case 3:
                    scanner.nextLine();
                    modifyQuantity();
                    break;

                case 4:
                    scanner.nextLine();
                    removeFromCart();
                    break;

                case 5:
                	exit();
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }catch (Exception e) {
                System.out.println("Select the number inside 1 to 5 based on your MENU.");
                scanner.nextLine();
            }

        } while (choice != 5);
        scanner.close();
    }
}
