package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    if (n==0){  
      return Option.some(1);
    }else if(i==0){
      return Option.some(0);
    }else if(i>0){
      int product = 1;
      if (i>=0){
        for (int j=0; j<n; j++){
          product *= i;
        }
      }
      if (product == 0) return Option.none();
      return Option.some(product);
    }else{
      return Option.none();
    }
  }
}
