package array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2, 5};
        int[] result = Turn.back(input);
        int[] expect = new int[] {5, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWith1ElementsThenSameArray() {
        int[] input = new int[] {2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWith2ElementsThenTurnedArray() {
        int[] input = new int[] {1, 4};
        int[] result = Turn.back(input);
        int[] expect = new int[] {4, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWith3ElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3};
        int[] result = Turn.back(input);
        int[] expect = new int[] {3, 2, 1};
        assertThat(result, is(expect));
    }
}