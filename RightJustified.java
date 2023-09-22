
/**
 * Moves a given block to right justified, specific to the given width
 * 
 * @author Maria Rodriguez
 * @version 1.0 September 22, 2023
 */
public class RightJustified implements TextBlock{
   // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The stuff in the box
   */
  TextBlock contents;

   /**
   * The desired width of the new box
   */
  int width;

// +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new line with contents _contents.
   */
  public RightJustified(TextBlock _contents, int rightWidth) {
    this.contents = _contents;
    this.width = rightWidth - this.contents.width();
  } // BoxedBlock(String)


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
    int h = this.contents.height();
    // The top and bottom of the box
    if ((i >= 0) && (i <= h)) {
      return TBUtils.spaces(width) + this.contents.row(i - 1);
    }
    // Everything else
    else {
      throw new Exception("Invalid row " + i);
    }
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    return 2 + this.contents.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return 2 + this.contents.width();
  } // width()

}
