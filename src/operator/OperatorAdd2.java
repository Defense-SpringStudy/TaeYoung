package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;
        b = ++a; // a의 값을 먼저 증가, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;
        b = a++; // a의 현재 값을 b에 먼저 대입, 그 후 a 값 증가
        System.out.println("a = " + a + ", b = " + b);
    }
}
