

/**
 * Truncates a given block dependant on the given width
 *
 * @author Maria Rodrigeuz
 * @version 1.0 September 22 2023
 */
public class Truncated implements TextBlock {
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The stuff in the box
   */
  TextBlock contents;

  int width;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new line with contents _contents.
   */
  public Truncated(TextBlock _contents) {
    this.contents = _contents;
  } // BoxedBlock(String)

//truncate should take in a box and #, and remove # number of char from the right

  public Truncated(TextBlock myBlock, int num){
    this.contents = myBlock;
    //sets this contents to the block given

    this.width = num;
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
    // 
    if ((i >= 0) && (i <= h)) {
      if(width < this.contents.width()){
      return this.contents.row(i - 1).substring(0, width);
    } else{
      return TBUtils.spaces(width - contents.width()) + this.contents.row(i - 1);
    }
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