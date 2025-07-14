package ch09_collection_framework;

import java.util.ArrayList;

public class ArrayList02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		// add(value) → append
		// add(index, value) → insert
		list.add("포도");     // [포도]
		list.add("딸기");     // [포도, 딸기]
		list.add("복숭아");    // [포도, 딸기, 복숭아]
		list.add(2, "키위");  // [포도, 딸기, 키위, 복숭아] → 복숭아가 뒤로 밀림
		list.set(0, "오렌지"); // [오렌지, 딸기, 키위, 복숭아]
		list.remove(1);      // [오렌지, 키위, 복숭아] 
		list.remove("키위");  // [오렌지, 복숭아]
		
		for (int i = 0; i < list.size(); i++) {
			// 객체자료형의 경우 동등연산자(==) 사용 불가
			//  - 객체자료형은 실제 값의 주소가 들어있기 때문에
			//  - equals()를 사용하면 주소를 찾아가 실제값과 비교
			// get: index로 value 조회
			// equals: 객체자료형일 때 비교 방법
			if (!list.get(i).equals("복숭아")) {  
				list.remove("복숭아");
			}
		}
		
		// 향상된 for문 (foreach)
		//  - 기존 for문은 i(index)를 사용하기 때문에 구조가 복잡
		//  - 데이터를 조회하는 경우에는 index 없이 
		//    빠르게 조회할 수 있도록 foreach문 새로 만듦
		
		for(String item: list) {
			System.out.println(item);
		}
		
	}
}
