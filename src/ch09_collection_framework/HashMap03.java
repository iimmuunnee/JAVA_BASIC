package ch09_collection_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMap03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		// 삽입, key가 이미 존재하면 value를 수정, 없으면 삽입
		map.put("1", "임휘훈");
		map.put("2", "홍길동");
		map.put("3", "이순신");
		map.put("4", "이도");
		map.put("5", "김덕령");
		
		map.get("3");     // key값으로 호출
		map.remove("4");  // 삭제
		
	}
}
