class PlusOne{
  public static void main(String[] args){
    int[] digits = {1, 2, 3};
    
    int[] newArray = plusOne(digits);
    for (int i = 0; i < newArray.length; i++){
      System.out.println(newArray[i]);
    }
  }

  public static int[] plusOne(int[] digits) {
      int placeHolder = 0; 
      int value = 0;
      for (int i = digits.length - 1; i >= 0; i--) {
        placeHolder = digits.length - (i + 1);
        System.out.println("placeHolder: " + placeHolder);
        value += digits[i] * (int)Math.pow(10,placeHolder);
        System.out.println("Value:  " + value);
      }
      value+=1;

      int[] newArray = {value};
      return newArray;
  } 
}
