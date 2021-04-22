package day18_0422_03;

public class ProductDTO {

	private int pNumber;
	private String pName;
	private int pPrice;
	private int pStock;
	
	ProductDTO() {
		
	}
	
	ProductDTO(int pNumber, String pName, int pPrice, int pStock) {
		this.pNumber = pNumber;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pStock = pStock;
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getpStock() {
		return pStock;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	@Override
	public String toString() {
		return "ProductDTO [상품번호 = " + pNumber + ", 상품명 = " + pName + ", 상품가격 = " + pPrice + ", 재고 = " + pStock
				+ "]";
	}
	
}
