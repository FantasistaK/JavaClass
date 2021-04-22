package day18_0422_03;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		
		List<ProductDTO> productList = new ArrayList<ProductDTO>();

		ProductDTO product = null;
		
		ProductService ps = new ProductService();
		
		do {

			System.out.println("---------------------------------------------------------");
			System.out.println("1. 상품등록 | 2. 전체상품조회 | 3. 상품정보수정 | 4. 상품삭제 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();

			switch (select) {

			case 1:

				System.out.print("상품명 : ");
				String pName = sc.next();
				System.out.print("상품가격 : ");
				int pPrice = sc.nextInt();
				System.out.print("재고량 : ");
				int pStock = sc.nextInt();
				int pNumber = productList.size()+1;
				
				product = new ProductDTO(pNumber, pName, pPrice, pStock);
				productList.add(product);

				break;
				
			case 2:
				
				ps.printProductList(productList);
				
				break;
				
			case 3:
				
				productList = ps.productUpdate(productList);
				
				break;
				
			case 4:
				
				productList = ps.productDelete(productList);
				
				break;
				
			case 5:
				
				System.out.println("프로그램을 종료 합니다.");
				run = false;
				break;

			default:
				
				System.out.println("다시 입력해 주세요.");
				
			}
			
		} while(run);

		sc.close();
		
	}

}
