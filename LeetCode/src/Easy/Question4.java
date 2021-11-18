package Easy;
class Question4 {
  public static void main(String[] args) {
	Question4 main = new Question4();
    int result = main.decimalToBinary(545);
    System.out.println(result);

  }

  // Question 4 - Decimal to Binary

  public int decimalToBinary(int n) {
    if (n==0) {
      return 0;
    }
    return n%2 + 10*decimalToBinary(n/2);
  }


}
