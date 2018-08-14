package test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class Sumtest {
        private int num;
        private int fInput;
        private int fExpect;
        private int fBack_way;
        private int fContract_money;
        public Sumtest(int input, int expect, int fBack_way, int fContract_money){
            fInput = input;
            fExpect = expect;
            this.fBack_way = fBack_way;
            this.fContract_money = fContract_money;
        }

//        @Before
//        public void setNum(){
//            num =1;
//        }
        @Test
        public void test1(){
//            System.out.println(fContract_money);
            Assert.assertEquals("期望："+fExpect+"实际是："+fInput,fExpect,fInput);
//            Assert.assertEquals(fExpect,fInput);
        }
//        @Test
//        public void test2(){
//            System.out.println("测试失败");
//            Assert.assertTrue(2>1);
//        }
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                { 0, 0 ,0,0}, { 1,1, 1,2 }, { 2, 1 , 1,3},
                { 3, 2 , 1,4}, { 4, 3 , 1,5}, { 5, 5, 1,2 }, { 6, 8 , 1,2}
        });
    }
}
