
/**
 * Returns the block but flipped horizontally.
 * 
 * @author Maria Rodriguez
 * @version 1.0 September 22, 2023
 */
public class HorizontallyFlipped implements TextBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The contents of the textblock.
   */
  TextBlock contents;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new block.
   */
  public HorizontallyFlipped(TextBlock block) {
    this.contents = block;
  } 

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   * 
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    int height = this.contents.height();
    int length = this.contents.width();

    if ((i >= 0) && (i <= height)){
      String temp = "";
      char ch;

      //saves the characters in reverse order
      for(int j = 0; j < this.contents.row(i - 1).length(); j++){
        ch = this.contents.row(i - 1).charAt(j);
        temp = ch + temp;
      }
      TextLine reverseText = new TextLine(temp);
      return reverseText.row(0);

    } else {
      throw new Exception("Invalid row " + i);
    } // if the row is invalid
  } // row(int)

  public int height() {
    return 1 + this.contents.height();
  } // height()

  public int width() {
    return this.contents.width();
  } // width()

} // class HComposition
 