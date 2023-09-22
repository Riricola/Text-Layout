import java.io.PrintWriter;

public class TextBlockTests{
  public static void main(String[] args) throws Exception{
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextBlock block1 = new TextLine("Hello");
    TextBlock block2 = new TextLine("Goodbye");
    BoxedBlock box1 = new BoxedBlock(block1);
    TextBlock boxedBox = new BoxedBlock(box1);
    VComposition hCompose1 = new VComposition(box1, boxedBox);
    VComposition vComposeA = new VComposition(block1, block2);
    Truncated truncatedBlock = new Truncated(block2, 8);
    Centered centeredBlock = new Centered(block2, 8);
    RightJustified rightBlock = new RightJustified(block2, 8);
    BoxedBlock boxed4a = new BoxedBlock(vComposeA);
    HorizontallyFlipped horizTest = new HorizontallyFlipped(boxed4a);
    VerticallyFlipped vertTest = new VerticallyFlipped(boxed4a);
    CustomBlock custom = new CustomBlock(boxedBox);

    // Print out the block
    TBUtils.print(pen, truncatedBlock);
    TBUtils.print(pen, centeredBlock);
    TBUtils.print(pen, rightBlock);
    TBUtils.print(pen, custom);
    TBUtils.print(pen, horizTest);
    TBUtils.print(pen, vertTest);

    //these should return true
    TBUtils.equal(boxedBox, boxedBox);
    TBUtils.eq(boxedBox, boxedBox);

    //these shold return false
    TBUtils.equal(boxedBox, block1);
    TBUtils.eq(boxedBox, block1);
    
    // Clean up after ourselves.
    pen.flush();
  }
}