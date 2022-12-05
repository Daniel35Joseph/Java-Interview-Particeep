package collection;

import java.lang.Math;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    List<Double> output = new ArrayList<>();
    for(int i=0 ; i<input.size() ; i++){
      double x = input.get(i);
      output.add(Math.pow(((x * 2) + 3),5));
    }
    return output;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    return null;
  }

}
