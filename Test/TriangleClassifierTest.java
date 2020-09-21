import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void testTriang1(){
        String expected ="Tam giác cân";
        String result = TriangleClassifier.TriangleClassifier1(3,2,3);
        assertEquals(expected,result);
    }
    @Test
    void  testTriangle2(){
        String expected ="Tam giác thường";
        String result = TriangleClassifier.TriangleClassifier1(3,4,5);
        assertEquals(expected,result);
    }
    @Test
    void  testTriangle3(){
        String expected ="Tam giác đều";
        String result = TriangleClassifier.TriangleClassifier1(2,2,2);
        System.out.println(expected + result);
    }
    @Test
    void testTriang4(){
        String expected = "Lỗi";
        String result = TriangleClassifier.TriangleClassifier1(-2,-2,-3);
        System.out.println(expected+result);
    }
}