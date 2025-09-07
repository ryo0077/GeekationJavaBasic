package objectExercise;

	public class Apartment extends Property {
		private String floorPlan;
		 
		public Apartment(String name, String owner, String type, int price, String floorPlan) {
			super(name, owner, type, price);
			this.floorPlan = floorPlan;
		}
		public String getFloorPlan() {
			return this.floorPlan;
		}
		public void setFloorPlan(String floorPlan) {
			this.floorPlan = floorPlan;
		}
		public void catalog() {
			super.catalog();
			System.out.println("間取り：" + this.floorPlan );
			System.out.println("==================================");
		}

	}



