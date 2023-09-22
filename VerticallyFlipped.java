
/**
 * Flips a given composition so the order of the rows are reversed
 * 
 * @author Maria Rodriguez
 * @version 1.0 September 22, 2023
 */
public class VerticallyFlipped implements TextBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The contents of the text block.
   */
  TextBlock contents;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new block by composing top and bottom vertically.
   */
  public VerticallyFlipped(TextBlock block) {
    this.contents = block;
  } // VComposition(String)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   * 
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception{
    int h = this.contents.height();

    return this.contents.row(h - i - 1);
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    // The height is the sum of the heights of the top and bottom
    // blocks.
    return 1 + this.contents.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    // The width is the greater of the widths of the top and bottom
    // blocks.
    return 1 + this.contents.height();
  } // width()

} // class VComposition
