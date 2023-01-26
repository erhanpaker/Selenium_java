package lesson_14;

import org.junit.Test;

public class lesseon_1 {

    int sayi= 2455;

    @Test

    public void test01(){
        // 100 den büyük olduğunu
        if (sayi>100){
            System.out.println("sayi 100 den büyük 1 test passed");


        }else {
            System.out.println("sayi 100 den büyük değil 1 test faield");

        }
    }

    @Test

    public void test02(){
        // - çift sayi olduğunu
        if (sayi % 2 == 0){
            System.out.println("verilen sayi çift sayi 2 test passed");


        }else {
            System.out.println("sayi 100 den büyük değil 1 test faield");

        }
    }

    @Test

    public void test03(){
        if (sayi>99 && sayi <1000){
            System.out.println("sayi 3 basamaklı 3 test passed");


        }else {
            System.out.println("sayi3 basamaklı değil 3 test faield");

        }
    }

}
