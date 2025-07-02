/*프로그래밍언어
 1. Python: 데이터, 인공지능
 2. Java: Web, APP(Android)
 3. C: 로봇, 공장, 영상, 게임

IDE(통합개발환경) 도구
 
 1. Python: VSCode, Pycharm, Colab & Jupyter
 2. Java: Eclipse, IntelliJ, STS
 3. C: Visual Basic, VSCode

Java
 - JDK: Java 개발할 때 사용
 - JRE: 런타임 실행만 가능

Java 버전
 - SE: 기본, Standard Edition
 - EE: 기업, Web
 - ME: 

Java 개발환경 구축
 1. Oracle JDK 설치
 2. Windows 시스템 환경 변수 설정
  - 터미널: java --version
    	       javac --version
 3. Eclipse 설치 */

/*
 *  Java 코드 번역과정
 *  1. JavaBasic.java : 원시파일 (개발자가 작성한 코드)
 *     javac -> 컴파일러 번역
 *  2. JavaBasic.class : 바이너리 파일 (이진 코드)
 *     JVM(Java Virtual Machine) 실행
 *  3. 코드 실행 결과 출력
 *  
 *  프로그래밍 언어가 필요한 이유?
 *   - 인간이 사용하는 언어 : 자연어
 *   - 프로그래밍 언어
 *   - 기계가 사용하는 언어 : 기계어
 *  
 *  AI시대 개발?
 *  - LLM -> 문맥 인터페이스
 *  
 *  번역 방법
 *   1. 컴파일러(통번역)
 *   	- Java, C
 *   	- 1번 번역하는데 시간이 오래 걸림
 *   	- 번역본이 생기면 향후 번역 X, 실행만(속도 빠름)
 *   2. 인터프리터(줄 번역)
 *   	- Python
 *    	- 항상 실행할 때마다 라이브 번역(상대적으로 속도 느림)
 *    	- 현재 컴퓨팅파워 발전으로 속도 차이 없음
 *    
 *   Java 특성
 *    1. C/C++(절차지향) -> Java(객체지향, OOP) -> C#(객체지향)
 *    2. 객체지향 언어
 *    	- 캡슐화(은닉성)
 *    	- 코드 재사용성
 *    	※ 코드 개발시 생산성 향상
 *    3. JVM(Java Virtual Machine)
 *     - 플랫폼(OS) 독립적 언어, OS 상관없이 어디서든 실행 가능
 *    4. Garbage Collector
 *     - Java 프로그램의 메모리를 관리
 *     - 동적으로 할당했던 영역 중 사용하지 않는 영역을 
 *       메모리에서 해제
 *     - 메모리 관리를 신경쓰지 않고 개발 가능, 하지만 메모리 관리를 하고싶어도 하지 못 함
 */

package ch01_java;
/*
 * Java의 Class -> 객체(*.class X)
 * Java는 모든 파일을 class 단위로 생성
 *   ex) JavaBasic.java 생성 -> public class JavaBasic {} 
 */
public class JavaBasic {

	/*
	 * main() 함수 필수!
	 *  - Java SE는 main() 함수를 통해서 프로그램 실행  
	 */
	public static void main(String[] args) {
		System.out.println("Hello Java");
	}
}
