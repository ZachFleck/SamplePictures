package pixLab.classes;

import java.awt.Color;
import java.util.Random;

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
  public static void testChromokey()
  {
	 Picture source = new Picture("sully.jpg");
	 Picture background = new Picture("AmbuleanceHITstock_2.jpg");
	  
	  source.explore();
	    background.explore();
	   source.chromokey(background, Color.WHITE);
	    source.explore();
  }
	
	
	
	
	
	public static void testZeroBlue()
  
  
  {
    Picture beach = new Picture("sully.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("sully.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("sully.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
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
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("seagull.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void glitch()
  {
	  sully.glitch();
  }
  public static void randomColor()
  {
	  Color random;
	  int red = (int) (Math.random() * 256);
	  int green = (int) (Math.random() * 256);
	  int blue = (int) (Math.random() * 256);
	  
	  random = new Color(red, green, blue);
	  
	  return random;
  }
  
  public void randomize(int startRow, int startCol, int endCol)
  {
	  Pixel[][] pixel = this.getPixels2D();
	  
	  for (int row = startRow; row < endRow; row++)
	  {
		  for (int col = startCol; col < endCol; col++)
		  {
			  int randomNumber = (int) (Math.random() * 10);
			  if (randomNumber % 7 == 0)
			  {
				  pixels[row][col].setColor(randomColor());
			  }
		  }
	  }
	  
  }
  
   public static void testSteganography()
   {
	   Picture source = new Picture("sully.jpg");
	   
	   Picture source1 = new Picture("zebra.jpg");
	   
	   source1.explore();
	
	   source1.explore();
	   source1.revealPicture();
	   source1.explore();
   }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  testMirrorHorizontal();
	 glitch();
	 randomColor();
  }
}