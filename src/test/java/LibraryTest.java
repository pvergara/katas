import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class LibraryTest {
    @Test 
    public void testSomeLibraryMethod() {
      	
    	float result = PotterCalculator.calculate(new ArrayList<>());
    	
    	assertThat(result,is(equalTo(0f)));

    	result = PotterCalculator.calculate(Arrays.asList(new BooksAndQuantity(1,1)));
    	
    	assertThat(result,is(equalTo(8f)));

    	result = PotterCalculator.calculate(Arrays.asList(new BooksAndQuantity(2,1)));
    	
    	assertThat(result,is(equalTo(8f)));
    	
    	result = PotterCalculator.calculate(Arrays.asList(new BooksAndQuantity(3,1)));
    	
    	assertThat(result,is(equalTo(8f)));

    	result = PotterCalculator.calculate(Arrays.asList(new BooksAndQuantity(4,1)));
    	
    	assertThat(result,is(equalTo(8f)));
    	
    	result = PotterCalculator.calculate(Arrays.asList(new BooksAndQuantity(5,1)));
    	
    	assertThat(result,is(equalTo(8f)));
    }
}