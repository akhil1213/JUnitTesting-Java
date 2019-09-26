package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCustomStringTest {
	private MyCustomString mycustomstring = new MyCustomString();

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void testCountNumbers7() {
        mycustomstring.setString("I'd b3tt3r pu57t s0343453me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }
	@Test//This test checks whether method countNumbers works properly by setting the string and giving assertEquals the correct answer
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }
	//This test checks whether method countNumbers suitable throws a nullpointerexception when you dont set the string to any value so it is null.
	@Test (expected = NullPointerException.class )
    public void testCountNumbers2() {
        mycustomstring.countNumbers();
    }
	@Test
	//This test checks whether method countNumbers doesn't give the wrong answer for the given string
    public void testCountNumbers3() {
		 mycustomstring.setString("I'd b3tt3r put s0me d161ts5 in this 5tr1n6, right?");
	     assertEquals(10, mycustomstring.countNumbers());
    }
	@Test (expected = NullPointerException.class )
	//This test checks whether method countNumbers suitably doesn't throw a nullpointerexception since the string s was actually set in mycustomstring class.
    public void testCountNumbers4() {
		mycustomstring.setString("Akhil");
		mycustomstring.countNumbers();
    }

    @Test//This test checks whether method countNumbers suitably returns 0 when there are 0 numbers in the string
    public void testCountNumbers5() {
    		mycustomstring.setString("Akhil");
    		assertEquals(0, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers6() {
		 mycustomstring.setString("I'd b3tt3r put s0me d161ts5 in this 5tr1n6, right?");
	     assertEquals(8,mycustomstring.countNumbers());
   }
	@Test//This test checks if getEveryNthCharacterFromBeginingOrEnd method produces the correct answer from beginning gives correct answer and assertEquals is given the correct parameters
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }
    @Test//tests if getEveryNthCharacterFromBeginingOrEnd method wrong answer from end results in  wrong answer test case giving assertEquals bad parameters
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }
    @Test//This test checks if getEveryNthCharacterFromBeginingOrEnd method produces the correct answer for the given string by giving assert equals the correct answer.
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
    		mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
    		assertEquals("hr6r hns6 0t tb'", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test (expected = IllegalArgumentException.class )
    //tests when an illegal argument is thrown for the parameter n, it reuslts in a wrong test case
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);
    }
    //test if there is an illegalargumentexception as should be thrown since n <=0, and tests if second parameter messes anything up
    @Test (expected = IllegalArgumentException.class )
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    		mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false);
    }
    //tests if there is a null pointer exception when string is null
    @Test (expected = NullPointerException.class )
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    		mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false);
    }
    //tests if there is a null pointer exception when string is null
    @Test (expected = NullPointerException.class )
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    		mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true);
    }

    @Test (expected = NullPointerException.class )
    //tests if there is no nullpointerexception so our test case should be wrong here
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    		mycustomstring.setString("akhil");
    		mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false);
    }
    @Test//tests if wrong answer from beginning gives wrong answer so our test case should be wrong
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d3fp md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
  //This test checks whether method testConvertDigitsToNamesInSubstring works properly if '0' doesn't turns into 'zero' since its not inside the bounds so wrong test case result is expected
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }
    @Test
    //This test checks whether method ConvertDigitsToNamesInSubstring works properly by giving the correct answer for string parameter in assertEquals with correct parameters giving to method testConvert..
    public void testConvertDigitsToNamesInSubstring2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put s0me dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }
  //This test checks whether method convertDigitsToNamesInSubstring  suitably throws an IllegalArgumentException if startPosition is greater than endPosition
    @Test (expected = IllegalArgumentException.class )
    public void testConvertDigitsToNamesInSubstring3() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(25, 23);
    }
    //This test checks whether method convertDigitsToNamesInSubstring  suitably throws a  MyIndexOutOfBoundsException if startPosition is < 0
    @Test (expected = MyIndexOutOfBoundsException.class )
    public void testConvertDigitsToNamesInSubstring4() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(-1, 23);
    }
  //This test checks whether method convertDigitsToNamesInSubstring  suitably throws a  MyIndexOutOfBoundsException if endPosition is > length of string
    @Test (expected = MyIndexOutOfBoundsException.class )
    public void testConvertDigitsToNamesInSubstring5() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(12, 90);
    }
  //This test checks whether method convertDigitsToNamesInSubstring  suitably throws a  NullPointerException if string is null.
    @Test (expected = NullPointerException.class )
    public void testConvertDigitsToNamesInSubstring6() {
        mycustomstring.convertDigitsToNamesInSubstring(12, 90);
    }
    @Test
    //This test checks whether method convertDigitsToNamesInSubstring given string remains unchanged since the indexes the substring don't contain numbers.
    public void testConvertDigitsToNamesInSubstring7() {
        mycustomstring.setString("Akh1l");
        mycustomstring.convertDigitsToNamesInSubstring(0,1);
        assertEquals("Akh1l", mycustomstring.getString());
    }
    @Test
    //This test checks whether method convertDigitsToNamesInSubstring given string changes since the indexes of the string have numbers that should be changed to word versions of that number.
    public void testConvertDigitsToNamesInSubstring8() {
        mycustomstring.setString("Akh1l");
        mycustomstring.convertDigitsToNamesInSubstring(3, 5);
        assertEquals("AkhOnel", mycustomstring.getString());
    }
}
