package variable;

public class String_Ex {

	public static void main(String[] args) {
		String jumin = "001234-2234567";
		
		//주민번호를 이용해서 남자, 여자 표시하시오.
		//1, 2
		//1, 2, 3, 4
		if(jumin.substring(7, 8).equals("1")) {
			System.out.println("Male");
		}else {
			System.out.println("Female");
		}
		
		System.out.println("-------------------------------");
		int tmp = Integer.parseInt(jumin.substring(7, 8));
		
		System.out.println(tmp);
		//1,3 남자, 2,4 여자 % 2 == 0;
		if(tmp % 2 == 1) {
			System.out.println("남성입니다.");
		}else {
			System.out.println("여성입니다.");
		}
		
		//문장에 "" 필요할 때
		//부산 "코리아아이티" 아카데미
		System.out.println("부산 \"코리아아이티\" 아카데미");
		
		//escape 문자
		//\t(탭 : 7칸 띄우기), \n(개행)
		String str = "입력\t보기\t수정\t삭제"; //Create Read Update Delete
		System.out.println(str);
		
		String str2 = "입력\n보기\n수정\n삭제";
		System.out.println(str2);
	}

}
