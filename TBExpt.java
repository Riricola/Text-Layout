
import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2019
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextBlock block1 = new TextLine("Hello");
    TextBlock block2 = new TextLine("Goodbye");
    TextBlock emptyBox = new TextLine(" ");
    // Print out the block
    TBUtils.print(pen, block1);
    BoxedBlock box1 = new BoxedBlock(block1);
    BoxedBlock emptyTextBox = new BoxedBlock(emptyBox);
    BoxedBlock boxedBlock1 = new BoxedBlock(block1);
    BoxedBlock boxedBlock2 = new BoxedBlock(block2);

    TBUtils.print(pen, box1);
    TBUtils.print(pen, emptyTextBox);
    TextBlock boxedBox = new BoxedBlock(box1);

    VComposition vComposeB = new VComposition(boxedBlock1, boxedBlock2);
    VComposition vComposeA = new VComposition(block1, block2);
    BoxedBlock boxed4a = new BoxedBlock(vComposeA);
    TBUtils.print(pen, boxed4a);
    TBUtils.print(pen, vComposeB);
    TBUtils.print(pen, boxedBox);
   
    HComposition hCompose1 = new HComposition(box1, block2);
    TBUtils.print(pen, hCompose1);
    HComposition hCompose2 = new HComposition(block2, box1);
    TBUtils.print(pen, hCompose2);

    
    
    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
