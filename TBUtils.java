
import java.io.PrintWriter;

/**
 * Utilities for TextBlocks.
 * 
 * @author Maria Rodriguez
 * @version 1.0 of September 22, 2023
 */
public class TBUtils {
  // +--------------+------------------------------------------------------
  // | Class Fields |
  // +--------------+

  /**
   * A really big sequence of dashes. This sequence may grow as the program operates.
   */
  static String lotsOfDashes = "--";

  /**
   * A really big sequence of spaces. This sequence may grow as the program operates.
   */
  static String lotsOfSpaces = "  ";

  // +----------------+----------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Build a sequence of dashes of a specified length.
   */
  static String dashes(int len) {
    while (lotsOfDashes.length() < len) {
      lotsOfDashes = lotsOfDashes.concat(lotsOfDashes);
    } // while
    // Extract an appropriate length substring
    return lotsOfDashes.substring(0, len);
  } // dashes(int)

  /**
   * Print a TextBlock to the specified destination.
   */
  public static void print(PrintWriter pen, TextBlock block) {
    for (int i = 0; i < block.height(); i++) {
      // Even though we only call block.row with a valid i,
      // we need to put the call in a try/catch block.
      try {
        pen.println(block.row(i));
      } catch (Exception e) {
        pen.println();
      } // catch (Exception)
    } // for
  } // print(PrintWriter, TextBlock)

  /**
   * Build a sequence of spaces of a specified length.
   */
  static String spaces(int len) {
    while (lotsOfSpaces.length() < len) {
      lotsOfSpaces = lotsOfSpaces.concat(lotsOfSpaces);
    } // while
    // Extract an appropriate length substring
    return lotsOfSpaces.substring(0, len);
  } // spaces(int)

  /**
   * Check if two blocks contains the same lines.
   */
  static void equal(TextBlock block1, TextBlock block2) throws Exception{
    int h1 = block1.height();

    //this is done in case one of the boxes is greater than the other
    String result = "";

    PrintWriter pen = new PrintWriter(System.out, true);
    
    if(block1.height() == block2.height()){
      for(int i = 0; i < h1; i++){
        if(block1.row(i).equals(block2.row(i))){
          result = "true";
        } else{
          result = "false";
        }
      }
    } else {
      result = "false";
    }

    pen.println(result);
  }

  /**
   * Check if two blocks are built the same way.
   */
  public static boolean eqv(TextBlock block1, TextBlock block2){
    
  }

  /**
   * Check if two blocks have the same space in memory.
   */
  static void eq(TextBlock block1, TextBlock block2){
    PrintWriter pen = new PrintWriter(System.out, true);
    if(block1 == block2){
      pen.println("true");
    } else{
      pen.println("false");
    }
   }


} // class TBUtils
