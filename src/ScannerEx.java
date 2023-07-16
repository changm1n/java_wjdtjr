import java.util.*;

class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요. :");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :"+input); // 묹자열 + ? -> ?는 문자열
        System.out.printf("num=%d%n", num); //%n은 줄바꿈 printf 와 println의 차이점은 printf는 지시자를 사용해서 출력값의 형을 변환할 수 있다.
    }
}