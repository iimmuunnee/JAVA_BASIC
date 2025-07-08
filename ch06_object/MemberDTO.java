/*
 * DTO: Data Transfer Object
 *  - 데이터 전달 객체
 *  - 다양한 타입의 많은 변수들을 전달할 때 사용
 *  
 * DAO: Data Access Object
 *  - CRUD 작업에 사용(Database 함께 사용)
 *  - DAO + DTO + DB
 *    ex) DTO(저장할 값) → DAO_CREATE(저장) → DB 저장
 *        DAO_READ(조회) → DB 조회 → DTO 담기
 *  
 * CRUD
 *  - CREATE
 *  - READ
 *  - UPDATE
 *  - DELETE
 * */
package ch06_object;

public class MemberDTO {
	/*
	 * MemberDTO : 회원 정보를 담는 객체
	 *  1. 회원 필드
	 *  2. 생성자 + 오버로딩
	 *  3. 값을 숨기는 기능 private, getter, setter
	 *  4. 값을 출력하는 기능
	 * */
	// 멤버변수, 전역변수 (필드 field)
	// private 은닉성 (캡슐화)
	//  - 외부에서 직접 필드에 접근 불가
	//  - 우회해서 접근할 수 있도록 해줘야 함
	//    → Getter() & Setter()
	private String id;
	private String pw;
	private String email;
	private String phone;
	
	/*
	 * 메소드 오버로딩
	 *  - 기본적으로 JAVA는 동일한 이름의 함수 사용 X
	 *  - 메소드 오버로딩과 오버라이딩의 경우 예외
	 *  
	 *  1. 매개변수의 개수가 다른 경우 
	 *  2. 매개변수의 개수가 같으면, 데이터 타입이 다른 경우
	 *  3. 매개변수 개수와 타입이 같으면, 순서가 다른 경우
	 * */
//	public MemberDTO(String id) {}
//	public MemberDTO(String id, String pw) {}  // 1. 매개변수의 개수가 다른 경우
//	public MemberDTO(String id, int pw) {}     // 2. 매개변수의 데이터 타입이 다른 경우
//	public MemberDTO(int pw, String id) {}     // 3. 매개변수의 순서가 다른 경우 
	
	
	
	
	
	
	public MemberDTO() {}  // Default 생성자
	
	// 로그인 경우 사용하는 생성자 함수
	public MemberDTO(String id, String pw) {
		super();  // 모든 클래스는 object를 default로 상속받음
		this.id = id;  // 객체를 생성하면 인스턴스 명이 다 다를텐데 그 인스턴스 명을 지칭하기 위해 this를 사용함. 하드 코딩 방지
		this.pw = pw;
	}
	
	// 모든 값을 전달받는 생성자!
	// 회원 가입의 경우 사용하는 생성자 함수
	public MemberDTO(String id, String pw, String email, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.phone = phone;
	}
	// getter setter
	public String getId() {
		return id;
	}
	
	// setter 함수에 추가 보안, 유효성 작업을 함
	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
}
// 필드 접근 방법
// MemberDTO mDTO = new MemberDTO();
// mDTO.id;


// DTO에 값을 넣는 방법
//  1. Default 생성자 사용
//   - 객체 생성
//  MemberDTO mDTO = new MemberDTO();
//   - 인스턴스 사용
//  mDTO.id = "chousn_1004";
//  mDTO.pw = "1234";
//  mDTO.email = "chosun_1004@chosun.ac.kr";
//  mDTO.phone = "01012345678";

//  2. 사용자 정의 생성자 사용
//   - 객체 생성과 동시에 필드 초기화 또는 특정 작업
//  MemberDTO mDTO = new MemberDTO("chousn_1004", "1234", "chosun_1004@chosun.ac.kr", "01012345678");


// 회원가입의 경우 
//  - id, pw, email, phone
   
    
// 로그인의 경우
//  - id, pw
   
   
// 탈퇴의 경우
//  - id, pw, phone


