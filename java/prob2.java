class Main {
  public static void main(String[] args) {
    int limit = 4000000;
    int ans = 0;
    int x = 1;
    int y = 2;
    int z = 0;
    while (x < limit) {
        if (y % 2 == 0) {
            ans += y;
        }
        z = y;
        y = x + y;
        x = z;
    }
    System.out.println(ans);
  }
}

