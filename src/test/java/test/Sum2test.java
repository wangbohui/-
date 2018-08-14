package test;


import org.junit.Assert;
import org.junit.Test;
import com.wangbh.bean.sum;

public class Sum2test {
    private sum su;
    @Test
    public void sumTest(){
        su = new sum();
        System.out.println(su.sumn(3,5));
    }

    @Test
    public void sum2Test(){
        su = new sum();
        System.out.println(su.sumn(3,5));
    }

    @Test
    public void sum3Test(){
        su = new sum();
        System.out.println(su.sumn(3,5));
    }

    @Test
    public void sum4Test(){
        su = new sum();
        try{

            Assert.assertEquals("buxiangdeng",8,su.sumn(3,5));
        }catch (Exception e){}

//        System.out.println(su.sumn(3,5));
    }



}
