package constructor;

public class ProductManager {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 배열에서 상품정보의 저장위치를 추적하는 변수
		int savePosition = 0;
		
		// 상품 정보를 여러개 저장하는 배열
		Product[] db = new Product[100];
	
		
		db[savePosition++] = new Product(100, "iphone15", "apple", 150, 3);
		db[savePosition++] = new Product(101, "iphone15 pro", "apple", 170, 1);
		db[savePosition++] = new Product(111, "mac", "apple", 190, 2);
		db[savePosition++] = new Product(115, "mac pro", "apple", 230, 8);
		db[savePosition++] = new Product(117, "ipad", "apple", 110, 5);
		
		while(true) {
			System.out.println("----------------------------------------");
			System.out.println("1.전체조회 2.신규등록 3.검색 4.수정 5.삭제 0.종료");
			System.out.println("----------------------------------------");
			
			System.out.println("메뉴를 선택하세요: ");
			int menuNo = sc.nextInt();
			
			if(menuNo == 1) { 
				System.out.println("<<전체 상품 조회>>");
				/* 전체 상품 조회
				 *  - db 배열에 저장된 모든 상품정보를 화면에 출력한다
				 *  - 향상된 for문을 사용해서 배열의 처음부터 끝까지 반복처리한다
				 *    배열에 null이 저장되어 있으면 반복을 중단한다 
				 */
				for(Product p : db) {
					if (p == null) {
						break;
					}
					System.out.printf("%3d %-20s %-10s %5d만원 \n", p.no, p.name, p.maker, p.price);
				}
			} else if (menuNo == 2) {
				/* 신규 상품 정보 등록
				 *  - 상품번호, 이름, 제조회사, 가격, 입고수량을 입력받는다
				 *  - product 객체를 생성해서 입력된 상품정보를 product 개체에 저장한다
				 *  - 상품정보가 저장된 product 객체를 배열에 저장한다
				 */
				System.out.println("<<신규 상품 등록>>");
				System.out.println("### 신규 상품 정보를 입력하세요");
				
				System.out.print("### 상품번호 입력: ");
				int no = sc.nextInt();
				
				System.out.print("### 상품이름 입력: ");
				String name = sc.nextString();
				
				System.out.print("### 제조회사 입력: ");
				String maker = sc.nextString();
				
				System.out.print("### 상품가격 입력: ");
				int price = sc.nextInt();
				
				System.out.print("### 입고수량 입력: ");
				int stock = sc.nextInt();
				
				// product 객체를 생성해서 입력값을 멤버변수에 저장하기
				Product p = new Product(no, name, maker, price, stock);
				// 배열에 product 객체 저장
				db[savePosition++] = p;
				
				System.out.println("신규 상품이 등록되었습니다");
				
			} else if (menuNo == 3) {
				/* 상품정보 검색하기
				 *  - 검색옵션을 입력받는다
				 *  - 검색옵션은 1/2/3 중에서 하나를 입력받는다 
				 *    각각 1은 상품이름으로 검색, 2는 제조회사로검색, 3은 가격으로 검색이다
				 *  - 검색옵션에 맞는 검색어를 입력받는다
				 *  - 향상된 for 문으로 배열의 처음부터 끝까지 반복하면서 검색조건에 맞는 상품정보를 출력한다
				 */
				System.out.println("<<상품 정보 검색>>");
				
				System.out.println("### 검색옵션을 선택하세요 1: 번호 2: 이름, 3: 제조사, 4: 가격");
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
						if (p.name.equals(name)) { //문자열은 비교할수없음 주소값으로 대입되기때문에
							p.printProduct(); // 기본자료형의 == 비교는 동등성비교
						}					  // 참조자료형의 == 비교는 동일성비교(같은객체인가)
					}						  // p.name.equals(name)으로 비교해야한다
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
					System.out.println("### 최저가격 입력: ");
					int minPrice = sc.nextInt();
					System.out.println("### 최고가격 입력: ");
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
				
			} else if (menuNo == 4) {
				System.out.println("<<상품 정보 수정>>");
				// 수정할 상품의 번호를 입력받는다 
				// 번호에 해당하는 상품의 모든 정보를 출력한다
				// 상품명, 가격, 수량을 입력받는다
				// 위에서 검색한 상품정보의 
				System.out.println("< < 상품 정보 수정 > >");
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
					System.out.println("### 상품번호에 해당하는 상품정보가 없습니다");
				} else {
					System.out.println("### 수정할 상품정보를 확인하세요");
					origin.printProduct();
					
					System.out.println("### 이름, 가격, 수량정보를 입력해서 상품정보를 변경하세요");
					System.out.println("### 상품이름 입력: ");
					String name = sc.nextString();
					System.out.println("### 상품가격 입력: ");
					int price = sc.nextInt();
					System.out.println("### 상품수량 입력: ");
					int stock = sc.nextInt();
					
					origin.name = name;
					origin.price = price;
					origin.stock = stock;
					
					System.out.println("### 상품정보 수정이 완료되었습니다");
				}
					
				
			} else if (menuNo == 5) {
				System.out.println("<<상품 정보 삭제>>");
			} else if (menuNo == 0) {
				System.out.println("<<프로그램 종료>>");
				System.exit(0);
			}
			System.out.println();
			System.out.println();
		}
	}
}
