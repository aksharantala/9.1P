package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

    @Test
    public void testQ1AdditionValidInput() {
        Assert.assertEquals(3.0, MathQuestionService.q1Addition("1", "2"), 0);
    }

    @Test
    public void testQ1AdditionInvalidInput() {
        Assert.assertTrue(Double.isNaN(MathQuestionService.q1Addition("a", "2")));
    }

    @Test
    public void testQ1AdditionEdgeCase() {
        Assert.assertEquals(0.0, MathQuestionService.q1Addition("0", "0"), 0);
    }

    @Test
    public void testQ2SubtractionValidInput() {
        Assert.assertEquals(1.0, MathQuestionService.q2Subtraction("3", "2"), 0);
    }

    @Test
    public void testQ2SubtractionInvalidInput() {
        Assert.assertTrue(Double.isNaN(MathQuestionService.q2Subtraction("b", "2")));
    }

    @Test
    public void testQ2SubtractionEdgeCase() {
        Assert.assertEquals(0.0, MathQuestionService.q2Subtraction("2", "2"), 0);
    }

    @Test
    public void testQ3MultiplicationValidInput() {
        Assert.assertEquals(6.0, MathQuestionService.q3Multiplication("2", "3"), 0);
    }

    @Test
    public void testQ3MultiplicationInvalidInput() {
        Assert.assertTrue(Double.isNaN(MathQuestionService.q3Multiplication("c", "3")));
    }

    @Test
    public void testQ3MultiplicationEdgeCase() {
        Assert.assertEquals(0.0, MathQuestionService.q3Multiplication("0", "5"), 0);
    }
}