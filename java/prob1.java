public class Main {
  public static void main(String[] args) {
    int answer = 0;
    for (int i = 1; i < 1000; i ++) {
        if (i % 3 == 0 || i % 5 == 0) {
            answer += i;
        }
    }
    System.out.println(answer);
  }
}

