import java.util.Scanner;

public class Main {

    public String solution(String str){
        String answer="";
        //문자열 char 배열로 변환 후 조회 반복문 case 사용
        for(char x: str.toCharArray()){
            if(Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            }else{
                answer += Character.toLowerCase(x);
            }
        }
        //아스키코드 사용, 대문자(65~90) 소문자(97~122) 대문자는 소문자 -32
        for(char x: str.toCharArray()){
            if(x>=65 && x<=90){ //대문자일 경우
                answer += (char)(x+32); //+32 했을 경우 소문자됨, 형변환 해야함
            }else{
                answer += (char)(x-32); //-32 했을 경우 대문자됨, 형변환 해야함
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in=new Scanner(System.in); //스캐너 생성
        String str = in.next(); //문자열 받기
        System.out.print(T.solution(str));
    }
}