package objectExercise;

public class Property {
		protected String name;
		protected String owner;
		protected String type;
		protected int price;
		
	Property (String name, String owner, String type, int price) {
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public String getOwner() {
		return this.owner;
	}
	public String getType() {
		return this.type;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setTupe(String type) {
		this.type = type;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void catalog() {
		System.out.println("==================================");
		System.out.println("物件名：" + this.name );
		System.out.println("物件所有者名：" + this.owner);
		System.out.println("物件種別：" + this.type);
		System.out.println("物件価格：" + this.price + "円");
	  }

	}

