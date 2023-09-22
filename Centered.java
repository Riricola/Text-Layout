
/**
 * Centers a block within the given width
 *
 * @author Maria Rodriguez
 * @version 1.0 September 22, 2023
 */
public class Centered implements TextBlock {
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
  public Centered(TextBlock _contents, int centerWidth) {
    this.contents = _contents;
    this.width = centerWidth;
  } // BoxedBlock(String)


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
    // The top and bottom of the box

    //if width is less than the length of the string
    if(width < this.contents.width()){
      //if((i >= 0) && (i <= h)){
        return this.contents.row(i - 1).substring(0, width);
      //} else{
    
    } else if(width > this.contents.width()){ //if the width is greater than the length of the string
        return TBUtils.spaces((width / 2) + (width % 2)) + this.contents.row(i - 1) + TBUtils.spaces(width / 2);
    } else {
        throw new Exception("Invalid row " + i);
      }
  }

  /**
   * Determine how many rows are in the block.
   */
  public int height(){
    return 2 + this.contents.height();
  }

  /**
   * Determine how many columns are in the block.
   */
  public int width(){
    return this.contents.width();
  }


  // public String eqv(TextBlock other){
  //   String result = "";
  //   if(contents = other.contents){
  //     result = "true";
  //   } else {
  //     result = "false";
  //   }
  // }


}
