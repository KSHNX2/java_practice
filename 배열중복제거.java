public class 배열중복제거 {
	public static void main(String[] args) {
		String[] temp = new String[] { "서울", "북경", "상해", "서울", "도쿄", "뉴욕", "부산", "런던", "로마", "방콕", "도쿄", "서울", "부산" };
		for (int i = 0; i < temp.length; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i] == temp[j])
					temp[j] = "";
			}
		}
		for (int i = 1; i < temp.length; i++) {
			System.out.println(temp[i]);
			if (temp[i - 1] == "") {
				temp[i - 1] = temp[i];
				temp[i] = "";
			}
		}
		for (int i = 1; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
