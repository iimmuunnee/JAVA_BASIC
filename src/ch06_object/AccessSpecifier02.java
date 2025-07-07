/*
 * 접근 제한자 (Access Specifier)
 *  - 프로젝트 내에서 코드의 접근을 제한 또는 허용 범위 설정
 *  - 변수, 함수, 클래스 앞에 사용 가능
 *  - 범위: public > protected > [default] (생략하면 default) > private
 *  - public, private 가장 많이 사용
 *  - private → 은닉성(캡슐화)
 *  
 *  1. public
 *   - 프로젝트 내에 있는 모든 곳에서 사용 가능 ex) java_basic
 *   - 접근 제한을 하지 않는 것과 비슷한 개념
 *   - main() 반드시 public 사용! (외부에서 접근 하기 위해)
 *   - 불특정 다수의 접근을 허용해야 하는 경우 public 사용
 *   
 *  2. protected
 *   - 동일 패키지 내에 있는 모든 곳에서 사용 가능 ex) ch01_java
 *   - 패키지가 다르더라도 상속받은 클래스인 경우 사용 가능
 *   - 잘 사용하지 않음
 *   
 *  3. [default]
 *   - 동일 패키지 내에 있는 모든 곳에서 사용 가능
 *   - default 키워드를 작성하는 것이 아닌, 생략하면 default
 *  
 *  4. private 
 *   - 해당 클래스 내에서만 사용 가능
 *   - 클래스 외부에서는 접근이 불가! (보안성 향상, 은닉성)
 * */

package ch06_object;

public class AccessSpecifier02 {
	
}
