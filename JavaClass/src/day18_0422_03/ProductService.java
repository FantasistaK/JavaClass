package day18_0422_03;

import java.util.*;

public class ProductService {

	Scanner sc = new Scanner(System.in);
	
	public void printProductList(List<ProductDTO> productList) {
		
		if (productList.size()>0)
			for (int i = 0; i < productList.size(); i++)
				System.out.println(productList.get(i));
		else
			System.out.println("상품이 존재하지 않습니다.");
		
	}

	public List<ProductDTO> productUpdate(List<ProductDTO> productList) {
		
		System.out.print("상품명을 입력하세요 : ");
		String pName = sc.next();
		int none = 0;
		
		for (int i = 0; i < productList.size(); i++) {
			if (pName.equals(productList.get(i).getpName())) {
				none = 1;
				System.out.print("변경할 상품가격을 입력하세요 : ");
				int pPrice = sc.nextInt();
				productList.get(i).setpPrice(pPrice);
				System.out.print("변경할 재고량을 입력하세요 : ");
				int pStock = sc.nextInt();
				productList.get(i).setpStock(pStock);
				System.out.println(productList.get(i));
				System.out.println("상품정보 수정이 완료 되었습니다.");
			}
		}
		
		if (none != 1)
			System.out.println("상품이 존재하지 않습니다.");
		
		return productList;
		
	}

	public List<ProductDTO> productDelete(List<ProductDTO> productList) {
		
		System.out.print("상품번호를 입력하세요 : ");
		int pNumber = sc.nextInt();
		int none = 0;
		
		for (int i = 0; i < productList.size(); i++) {
			if (pNumber==productList.get(i).getpNumber()) {
				none = 1;
				productList.remove(i);
				for (int j=i; j<productList.size(); j++) {
					productList.get(j).setpNumber(productList.get(j).getpNumber()-1);
				}
				System.out.println("상품 삭제가 완료 되었습니다.");
			}
		}
		
		if (none != 1)
			System.out.println("상품이 존재하지 않습니다.");
		
		return productList;
		
	}

}
