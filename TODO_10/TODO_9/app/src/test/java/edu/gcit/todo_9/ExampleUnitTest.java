package edu.gcit.todo_9;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(JUnit4.class)
public class ExampleUnitTest {
    private Calculator mCalculator;

    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void addTwoNumber(){
        double result = mCalculator.add(1d, 2d);
        assertThat(result, is(equalTo(3d)));
    }

    @Test
    public void addTwoNumberNegative(){
        double result = mCalculator.add(-1d, 2d);
        assertThat(result, is(equalTo(1d)));
    }

    @Test
    public void addFloatNumber(){
        double result = mCalculator.add(1.111f, 1.111d);
        assertThat(result, is(closeTo(2.222d, 0.01d)));
    }

    @Test
    public void subTwoNumber(){
        double result = mCalculator.sub(2d, 1d);
        assertThat(result, is(equalTo(1d)));
    }

    @Test
    public void subTwoNumberNegative(){
        double result = mCalculator.sub(2d, -1d);
        assertThat(result, is(equalTo(3d)));
    }

    @Test
    public void subTwoNumberFloat(){
        double result = mCalculator.sub(2.111f, 1.111d);
        assertThat(result, is(closeTo(1.111d,1.111d)));
    }

    @Test
    public void mulTwoNumber(){
        double result = mCalculator.mul(2d, 1d);
        assertThat(result, is(equalTo(2d)));
    }

    @Test
    public void mulTwoNumberNegative(){
        double result = mCalculator.mul(2d, -1d);
        assertThat(result, is(equalTo(-2d)));
    }

    @Test
    public void mulTwoNumberFloat(){
        double result = mCalculator.mul(2.1f, 1.1d);
        assertThat(result, is(closeTo(2.31d,1.1d)));
    }

    @Test
    public void divTwoNumber(){
        double result = mCalculator.div(2d, 2d);
        assertThat(result, is(equalTo(1d)));
    }

    @Test
    public void divTwoNumberNegative(){
        double result = mCalculator.div(2d, -2d);
        assertThat(result, is(equalTo(-1d)));
    }

    @Test
    public void divTwoNumberFloat(){
        double result = mCalculator.div(2.4f, 2.2d);
        assertThat(result, is(closeTo(1.2d,1.1d)));
    }


}