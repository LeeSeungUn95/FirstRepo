package javaStudy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StreamCorruptedException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class F07_JSON {
	
	/*
	 	# JSON
	 	
	 		- JavaScript의 Object타입과 굉장히 유사한 형태의 데이터 표현 박식
	 		- 문자열만으로 다양한 데이터를 간결하게 표현할 수 있어서 인기가 많다
	 		- { "Key" : Value, "Key" : Value, ...}
	 	
	 	# JSON의 Value에 표현 가능한 타입들
	 	
	 		- '', "" : String
	 		- 숫자, 소수 : Number
	 		- null
	 		- [] : Array
	 		- {} : Object (JAVA의 Map)
	 */
	public static void main(String[] args) {
		
		// myMap에 저장된 데이터들을 JSON형태의 문자열로 만들어 출력하는 메서드를 만들어보세요
		// (확장자는 .json)
		HashMap<String, Object> myMap = new HashMap<>();
		
		myMap.put("name", "홍길동");
		myMap.put("age", 12);
		myMap.put("tel", "010-1234-1234");
		myMap.put("tel2", null);
		myMap.put("language", new String[] {"C", "JAVA", "Javascript", "React"});
		myMap.put("lotto", new Integer[] {1, 2, 3, 4, 5, 6, 7});

		new F07_JSON().mapToJsonFile(myMap);
		new F07_JSON().mapToJsonStr(myMap);
		
		
	}	
	public void mapToJsonFile(HashMap<String, Object> myMap) {
		
		try {
			OutputStreamWriter jsonOutFile = new OutputStreamWriter(
					new FileOutputStream("./data/myMap.json"), Charset.forName("UTF-8"));
			
			jsonOutFile.append("myMap = {\n");
			for (String key : myMap.keySet()) {
				jsonOutFile.append(String.format("\t\"%s\" : ", key));
				Object value = myMap.get(key);
				
				if (value instanceof String[]) {
					String[] arr = (String[]) value;
					
					jsonOutFile.append("[");
					for (int i = 0; i < arr.length; i++) {
						if (i < arr.length - 1) {
							jsonOutFile.append(String.format("\"%s\",", arr[i]));							
						} else {
							jsonOutFile.append(String.format("\"%s\"", arr[i]));							
						}
					}
					jsonOutFile.append("],\n");
				} else if (value instanceof Integer[]) {
					Integer[] arr = (Integer[]) value;
					
					jsonOutFile.append("[");
					for (int i = 0; i < arr.length; i++) {
						if (i < arr.length - 1) {
							jsonOutFile.append(String.format("%d,", arr[i]));							
						} else {
							jsonOutFile.append(String.format("%d", arr[i]));														
						}
					}
					jsonOutFile.append("],\n");
				} else if (value instanceof String) {
					jsonOutFile.append(String.format("\"%s\",\n", value));
				} else {			
					jsonOutFile.append(String.format("%d,\n", value));
				}
			}
			jsonOutFile.append("}");
			jsonOutFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		jsonToMap();
	}
		
	
	public void mapToJsonStr(HashMap<String, Object>myMap) {
		
		try {
			InputStreamReader in = new InputStreamReader(
					new FileInputStream(
							new File("./data/myMap.json")), Charset.forName("UTF-8"));
			
			int ch;
			while ((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Map<String, Object> jsonToMap() {
		
		Pattern regex_str = Pattern.compile("\"[\\d&&\\w]+\"");
		for (int i = 0; i < 10; i++) {
			System.out.println(regex_str);
		}
		Map<String, Object> retMap = new HashMap<>();
		
		
		return retMap;
	}
	public void printReturnMap(Map<String, Object> retMap) {
		for (String key : retMap.keySet()) {
			Object value = retMap.get(key);

			if (value instanceof String[]) {
				String[] arr = (String[]) value;

				System.out.print("[");				
				for (int i = 0; i < arr.length; i++) {
					System.out.print("\"");
					System.out.print(arr[i] + "\", ");
				}
				System.out.println("]");			
			} else {
				System.out.println("\""+key + "\" : \"" + value + "\"");				
			}			
		}
	}
}
























