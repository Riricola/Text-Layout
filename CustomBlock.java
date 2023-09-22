
/**
 * Duplicates a block
 * 
 * @author Maria Rodriguez
 * @version 1.0 September 22, 2023
 */
public class CustomBlock implements TextBlock{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  TextBlock contents;
  int width;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new line with contents _contents.
   */
  public CustomBlock(TextBlock _contents) {
    this.contents = _contents;
  } 

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

/**
   * Get one row from the block.
   * 
   * @pre i < this.height()
   * @exception Exception if the row number is invalid.
   */
  public String row(int i) throws Exception{
    int h = this.contents.height();
    
    //adds the same row onto itself
    if ((i >= 0) && (i <= h)) {
      return this.contents.row(i - 1) + this.contents.row(i - 1);
    } 
    // Everything else
    else {
      throw new Exception("Invalid row " + i);
    }
  }

  /**
   * Determine how many rows are in the block.
   */
  public int height(){
    return 1 + this.contents.height();
  }

  /**
   * Determine how many columns are in the block.
   */
  public int width(){
    return this.contents.width();
  }

}