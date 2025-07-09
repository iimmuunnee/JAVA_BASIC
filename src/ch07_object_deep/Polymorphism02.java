/*
 * 다형성 
 *  - 인스턴스의 자료형을 부모 자료형으로 사용
 *  ex) Parent(부모) → Child(자식)
 *      Child ch1 = new Child();
 *      Child ch2 = new Child();
 *      Parent ch3 = new Child();
 *  - 다형성은 동일한 자료형이지만 실행결과가 다양한 객체를 이용할 수 있는 성질
 *  - 다형성을 사용하게되면 객체를 부품처럼 사용 가능
 *  ex) 자동차 공장 
 *        ㄴ 타이어(금호, 한국, 넥센, ...)
 *        ㄴ 금호 타이어 객체 Kumho k
 *        ㄴ 한국 타이어 객체 Hankuk h
 *        ㄴ 넥센 타이어 객체 Nexen n
 *        
 *        Tire 부모 객체를 생성
 *        Tire →(상속) Kumho
 *        Tire →(상속) Hankuk
 *        Tire →(상속) Nexen
 *        
 *        타이어를 연결한다(Kumho k) {
 *        	금호타이어를 연결합니다;
 *        }
 *        타이어를 연결한다(Tire tire) {  // 다형성
 *        	타이어를 연결합니다;
 *        }
 *        
 */

package ch07_object_deep;

public class Polymorphism02 {
	
}
