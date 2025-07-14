/*
 * 컬렉션 프레임워크
 *  - 종류: List > Map > Set 순으로 많이 사용
 *  - List: ArrayList, LinkedList
 *  - Map: HashMap
 *  
 * ■ 컬레션 프레임워크 배경
 *  - 기존에 컬렉션은 배열(Array) 저장
 *  - (문제점) 배열은 동일한 자료형만 저장 가능
 *  - (문제점) 배열은 항상 고정 크기를 갖는다 (메모리 낭비)
 *  → (해결) 컬렉션 프레임워크
 *  
 * ■ ArrayList
 *  - Object 배열을 이용해서 데이터를 순차적으로 저장
 *  - 배열 타입이 모든 객체의 조상인 Object 기 때문에
 *    모든 종류의 객체를 다룰 수 있음
 *  - Capacity(용량) 부족할 경우 자동으로 기존 크기의 2배로 증가
 *  - 초기 크기는 10
 *  - ArrayList<String> list = new ArrayList<String>(50);
 *  - <> 제네릭 → 타입 세이프
 *  - ArrayList(50)의 숫자값은 크기 X, 초기 크기 O
 *   
 * ■ ArrayList와 LinkedList의 차이점
 *  - ArrayList: 배열처럼 순차적인 형식으로 저장
 *  - LinkedList: 비순차적인 형식으로 저장
 *   
 *  - 순차적으로 추가, 삭제하는 경우 → ArrayList
 *  - 중간 데이터를 추가, 삭제하는 경우 → LinkedList
 *  - 접근 시간은 ArrayList 가 더 빠름
 *   
 *  - 스택(Stack): ArrayList
 *  - 큐(Queue): LinkedList
 *   
 * ■ 제네릭
 *  - 제네릭이란 클래스 내부에서 사용할 자료형을 정의해 타입 세이프를 구현하는 기능
 *  - 제네릭의 타입을 DTO 객체로 사용하면 DTO 객체 내에 정의 된 [자료형 변수] 외에는
 *    입력 불가!
 *  + 비제네릭
 *   List list = new ArrayList();
 *   list.add("hello")
 *   String str = (String)list.get(0);
 *    
 *  + 제네릭
 *   List<String> list = new ArrayList<String>();
 *   list.add("hello");
 *   String str = list.get(0);
 *  
 * ■ Map
 *  - [Key, Value] 형식을 사용
 *  - HashMap
 *  - Key와 Value를 묶어서 하나의 데이터(Entry)로 저장
 *  - Key와 Value를 Object 타입으로 묶어서 저장
 *  - Key는 유일해야 하고 값은 중복을 허용
 *  
 * 
 * ※ JSON: 웹에서 데이터를 주고받을 때 공통형식
 */

package ch09_collection_framework;

public class Collection01 {
	
}
