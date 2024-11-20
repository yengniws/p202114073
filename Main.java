import static java.lang.System.out;

public class Main {
  public static void main(String[] args) {
    // 자신의 학번과 이름을 입력하라
    out.println("202114073 박예은");
    out.println(Hello.sum(10));
    out.println(Hello.sum(100));
    out.println(Hello.sum(1000));
    out.println(World.factorial(3));
    out.println(World.factorial(6));
    out.println(World.factorial(9));
    out.println(Sansu.max(new int[] {8, 5, 6, 9, 4, 1, 7, 10, 3, 2, 8}));
    out.println(Sansu.max(new int[] {-2, 5, 6, 9, -6, 1, 7, 2, 8, 10}));
  }
}
