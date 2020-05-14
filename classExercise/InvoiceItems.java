package classExercise;

public class InvoiceItems {
	private int id;
	private String desc;
	private int qty;
	private int unitprice;
	public InvoiceItems(int id, String desc, int qty, int unitprice) {
		super();
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitprice = unitprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}
	@Override
	public String toString() {
		return "Invoice_item [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitprice=" + unitprice + "]";
	}

	public static void main(String[]args)
	{
		InvoiceItems i=new InvoiceItems(1,"KhadiSoap",250,5000);
		System.out.println(i);

		i.setId(10);
		System.out.println("id is :"+i.getId());
		i.setDesc("Santoor sabun");
		System.out.println("id is :"+i.getDesc());
		i.setQty(5600);;
		System.out.println("id is :"+i.getQty());
		i.setUnitprice(6000);;
		System.out.println("id is :"+i.getUnitprice());

	}
}
