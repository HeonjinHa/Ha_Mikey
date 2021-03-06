/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
   public static void testKeepOnlyBlue()
   {
	  Picture plane = new Picture("plane.jpg");
	  plane.explore();
	  plane.keepOnlyBlue();
	  plane.explore();
  }
  
  public static void testNegate()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.explore();
	  swan.negate();
	  swan.explore();
  }
  
   public static void testGrayscale()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.grayscale();
	  water.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.MirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
   public static void testMirrorHorizontal()
  {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.MirrorHorizontal();
	caterpillar.explore();
  }
  
  

  public static void testMirrorHorizontalBotToTop()
  {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.explore();
	caterpillar.MirrorHorizontalBotToTop();
	caterpillar.explore();
  }

  

  /** Method to test mirrorTemple */	
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
	seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
 
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.explore();
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testmyCollage()
  {
	  Picture object = new Picture("600x590.jpg");
	  object.explore();
	  object.myCollage();
	  object.explore();
	  
  }
  
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
	swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetection2()
  {
    Picture idk = new Picture("swan.jpg");
    idk.explore();
	idk.edgeDetection2(10);
    idk.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
	
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testCollage();
	//testmyCollage();
    //testCopy();
    testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}