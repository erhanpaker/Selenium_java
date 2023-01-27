package lesson_15;

import org.junit.Assert;
import org.junit.Test;

public class lesson_1 {

    int sayi = 2455;

    @Test
    public void test01(){

        Assert.assertTrue(sayi>100);
    }

    @Test

    public void test02(){

        Assert.assertEquals( 0, sayi&2 );
    }

    @Test public void test03(){
        // 3 basamaklı olduğunu test et
        Assert.assertTrue(sayi>99 && sayi<1000);
    }
}
