package javaStudy;
/*
	# import
	  - 다른 패키지에 정의되어 있는 클래스를 사용하기 위해선ㄴ
	       해당 클래스의 정확한 경로를 import 해야한다
	  - 같은 패키지에 존재하는 클래스는 import 없이도 사용할 수 있다
	  - 해당 패키지의 모든 클래스를 불러오고 싶을 때는 *를 사용한다
 */

import javaQuiz.A02_VarTypeQuiz;

// import b_chapterquiz.advance.AbcQuiz;
// import b_chapterquiz.basic.AbcTest;

public class B02_Import {

	public static void main(String[] args) {
		// 같은 패키지의 자원
		B01_Operator1.main(null);

		// 다른 패키지의 자원을 사용하기 위해서는 import가 필요하다
		A00_Hello.main(null);
		A01_Escape.main(null);
		A02_VarTypeQuiz.main(null);
		
		// 연습 : quiz밑의 advance밑의 AbcQuiz 클래스를 사용해보세요
		// AbcQuiz.main(null);
		
		// 재시험 : quiz밑에 basic이라는 패키지를 만든 후  그곳에 AbcTest 클래스를 만들어
		//        불러와서 사용해보세요. (사용했을 때 나타나는 메세지는 아무거나)
		// AbcTest.main(null);
		
	}
}
