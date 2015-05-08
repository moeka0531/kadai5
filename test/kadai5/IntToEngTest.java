package kadai5;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test1() {
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test2() {
		IntToEng ite = new IntToEng();
		String expected = "two";
		String actual = ite.translateEng(2);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test3() {
		IntToEng ite = new IntToEng();
		String expected = "three";
		String actual = ite.translateEng(3);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test4() {
		IntToEng ite = new IntToEng();
		String expected = "four";
		String actual = ite.translateEng(4);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test5() {
		IntToEng ite = new IntToEng();
		String expected = "five";
		String actual = ite.translateEng(5);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test6() {
		IntToEng ite = new IntToEng();
		String expected = "six";
		String actual = ite.translateEng(6);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test7() {
		IntToEng ite = new IntToEng();
		String expected = "seven";
		String actual = ite.translateEng(7);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test8() {
		IntToEng ite = new IntToEng();
		String expected = "eight";
		String actual = ite.translateEng(8);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test9() {
		IntToEng ite = new IntToEng();
		String expected = "nine";
		String actual = ite.translateEng(9);
		assertThat(actual,is(expected));
		
	}

}