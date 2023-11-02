package constructor;

public class ProductManager2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int savePosition = 0;
		
		Product[] db = new Product[100];
		
		db[savePosition++] = new Product(100, "asd", "asdf", 15, 3);
		db[savePosition++] = new Product(101, "asdfc", "asdzxc", 12, 3);
		db[savePosition++] = new Product(102, "xasd", "aqwe", 11, 2);
		db[savePosition++] = new Product(103, "xxxx", "aaaa", 10, 1);
		db[savePosition++] = new Product(105, "wwww", "llll", 20, 6);
		
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("1.전체조회 2.신규등록 3.검색 4.수정 5.삭제 0.종료");
			System.out.println("---------------------------------------");
			
			System.out.println("메뉴를 선택하세요");
			int menuNo = sc.nextInt();
			
			if (menuNo == 1) {
				for (Product p : db) {
					if(p == null) {
						break;
					}
					System.out.printf("%3d %-20s %-10s %5d만원", p.no, p.name, p.maker, p.price);
				}
			} 
			else if (menuNo ==2) {
				System.out.println("<< 신규 상품 등록 >>");
				System.out.println("### 신규 상품 정보를 입력하세요");
				
				System.out.println("### 상품 번호 입력");
				int no = sc.nextInt();
				
				System.out.println("### 상품 이름 입력");
				String name = sc.nextString();
				
				System.out.println("### 제조 회사 입력");
				String maker = sc.nextString();
				
				System.out.println("### 상품 가격 입력");
				int price = sc.nextInt();
				System.out.println("### 입고 수량 입력");
				int stock = sc.nextInt();
				
				Product p = new Product(no, name, maker, price, stock);
				db[savePosition++] = p;
				
				System.out.println("신규 상품이 등록되었습니다");
			} else if (menuNo == 3) {
				System.out.println("<< 상품 정보 검색 >>");
				System.out.println("### 검색옵션을 선택하세요 1.번호 2.이름 3.제조사 4.가격");
				int optNo = sc.nextInt();
				
				switch (optNo) {
				case 1:
					System.out.println("### 상품번호로 검색하기");
					System.out.println("### 검색할 상품번호 입력: ");
					int no = sc.nextInt();
					
					for (Product p : db) {
						if (p == null) {
							break;
						}
						if (p.no == no) {
							p.printProduct();
						}
					}
					break;
				case 2:
					System.out.println("### 상품명으로 검색하기");
					System.out.println("### 검색할 상품명 입력: ");
					String name = sc.nextString();
					
					for (Product p : db) {
						if (p == null) {
							break;
						}
						if (p.name.equals(name) ) {
							p.printProduct();
						}
					}
					break;
				case 3:
					System.out.println("### 제조회사로 검색하기");
					System.out.println("### 검색할 제조회사 입력: ");
					String maker = sc.nextString();
					
					for (Product p : db) {
						if (p == null) {
							break;
						}
						if (p.maker.equals(maker)) {
							p.printProduct();
						}
					}
					break;
				case 4:
					System.out.println("### 가격으로 검색하기");
					System.out.println("### 최저가격");
					int minPrice = sc.nextInt();
					System.out.println("### 최고가격");
					int maxPrice = sc.nextInt();
					
					for (Product p : db) {
						if (p == null) {
							break;
						}
						if (p.price >= minPrice && p.price <= maxPrice) {
							p.printProduct();
						}
					}
					break;
					
				} 
				
			} else if (menuNo ==4) {
				System.out.println(" << 상품 정보 수정 >>");
				System.out.println(" << 상품 정보 수정 >>");
				System.out.println("### 수정할 상품의 번호를 입력하세요");
				int no = sc.nextInt();
				
				Product origin = null;
				for (Product p : db) {
					if (p == null) {
						break;
					}
					if (p.no == no) {
						origin = p;
						break;
					}
				}
				if (origin == null) {
					System.out.println("### 상품번호에 해당하는 상품이 없습니다");
				} else {
					System.out.println("### 수정할 상품정보를 확인하세요");
					origin.printProduct();
					
					System.out.println("이름, 가격, 수량정보를 입력해서 상품정보를 변경하세요");
					System.out.println("상품 이름 입력");
					String name =sc.nextString();
					System.out.println("상품 가격 입력");
					int price =sc.nextInt();
					System.out.println("상품 수량 입력");
					int stock =sc.nextInt();
					
					origin.name = name;
					origin.price = price;
					origin.stock = stock;
					
					System.out.println(" 수정 완료 ");
				}
			}
			else if (menuNo == 5) {
				System.out.println(" << 상품 정보 삭제 >>");
			}
			else if (menuNo == 0) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			System.out.println();
			System.out.println();
		}
	}
}
