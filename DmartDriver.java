import java.util.*;
class Dmart
{
	String address;
	long contact;
	String email;
	String website;
	ArrayList<Product> productList = new ArrayList<>();
	Cashier cashier;
	Customer customer;
	Cart cart;

	Dmart(String address, long contact, String email, String website)
	{
		this.address=address;
		this.contact=contact;
		this.email=email;
		this.website=website;
	}

	public void displayDmart()
	{
		System.out.println();
		System.out.println("Dmart Details");
		System.out.println("Address: "+address);
		System.out.println("Contact Number: "+contact);
		System.out.println("Email Id: "+email);
		System.out.println("Website: "+ website);
	}
	public void addProduct(String cate, String name, double orgPrice, Barcode barcode)
	{
		Product product = new Product(cate, name, orgPrice, barcode);
		productList.add(product);
	}
	public void addCart(String type, double capacity)
	{
		cart = new Cart(type,capacity);
	}
	public void addCashier(String name, String id, long contact, int counterNum)
	{
		cashier = new Cashier(name, id, contact, counterNum);
	}
	public void addCustomer(String name, long contact, String paymentMode, String billNo, double totalBill)
	{
		if(cashier!=null && productList.size()!=0)
		{
			customer = new Customer(name, contact, paymentMode, billNo, totalBill);
		}
		else
		{
			System.out.println("Add Cashier and product first");
		}
		
	}
}

class Product
{
	String cate;
	String name;
	double orgPrice;
	Barcode barcode;

	Product(String cate, String name, double orgPrice,Barcode barcode)
	{
		this.cate=cate;
		this.name=name;
		this.orgPrice=orgPrice;
		this.barcode=barcode;
	}

	public void displayProduct()
	{
		System.out.println();
		System.out.println("Product Details [ Category: "+cate+", Name: "+name+ ", Original Price: "+orgPrice+" ]");
	}
	public void addBarcode(String productId, double dmartPrice)
	{
		barcode = new Barcode(productId,dmartPrice);
	}
}

class Barcode
{
	String productId;
	double dmartPrice;
	
	Barcode(String productId, double dmartPrice)
	{
		this.productId=productId;
		this.dmartPrice=dmartPrice;
	}

	public void displayBarcode()
	{
		//System.out.println();
		System.out.println("Barcode Details [ Product Id: "+productId+", Dmart Price: "+dmartPrice+" ]");
	}
}
class Customer
{
	String name;
	long contact;
	String paymentMode;
	String billNo;
	double totalBill;

	Customer(String name, long contact, String paymentMode, String billNo, double totalBill)
	{
		this.name=name;
		this.contact=contact;
		this.paymentMode=paymentMode;
		this.billNo=billNo;
		this.totalBill=totalBill;
	}

	public void displayCustomer()
	{
		System.out.println();
		System.out.println("Customer Details");
		System.out.println("Name: "+name);
		System.out.println("Contact Number: "+contact);
		System.out.println("Payment Mode: "+paymentMode);
		System.out.println("Bill Number: "+billNo);
		System.out.println("Total Bill: "+totalBill);
	}
}

class Cashier
{
	String name;
	String id;
	long contact;
	int counterNum;

	Cashier(String name, String id, long contact, int counterNum)
	{
		this.name=name;
		this.id=id;
		this.contact=contact;
		this.counterNum=counterNum;
	}

	public void displayCashier()
	{
		System.out.println();
		System.out.println("Cashier Details");
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Contact Number: "+contact);
		System.out.println("Counter Number: "+ counterNum);
	}
}

class Cart
{
	String type;
	double capacity;
	ArrayList<Product> cart = new ArrayList<>();
	Cart(String type, double capacity)
	{
		this.type=type;
		this.capacity=capacity;
	}

	public void displayCart()
	{
		System.out.println();
		System.out.println("Cart Details");
		System.out.println("Type: "+type);
		System.out.println("Capacity: "+cart.size());
		for(Product i : cart)
		{
			i.displayProduct();
			i.barcode.displayBarcode();
		}
	}
}


class DmartDriver
{
	public static void main(String [] args)
	{
		Dmart dmart = new Dmart("Deccan", 9876543210l, "dmart@gmail.com","www.dmart.com");
		dmart.displayDmart();
		System.out.println();
		System.out.println("Add Product");
		System.out.println();
		for(int i =1;i<=5;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Category: ");
			String cate = sc.nextLine();
			System.out.print("Product Name: ");
			String name = sc.nextLine();
			System.out.print("Original Price: ");
			double orgPrice = sc.nextDouble();
			System.out.print("Product Id: ");
			String productId = sc.next();
			System.out.print("Dmart Price: ");
			double dmartPrice = sc.nextDouble();
			dmart.addProduct(cate,name,orgPrice,(new Barcode(productId,dmartPrice)));
			System.out.println();
		}

		for(Product i : dmart.productList)
		{
			i.displayProduct();
			i.barcode.displayBarcode();
		}
		
		dmart.addCashier("Ramesh Kumar", "DCASH123", 8976543232l, 2);
		dmart.cashier.displayCashier();
	}
}