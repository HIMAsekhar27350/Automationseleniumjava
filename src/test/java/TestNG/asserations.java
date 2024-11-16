package TestNG;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class asserations {
    public static void main(String[] args) {
        String actual,excepted;
        actual="mpl";
        excepted="npl";

       /* Assert.assertEquals(actual,excepted,"Both are different");
        System.out.println("Hero");
        System.out.println("Super Hero");*/

        SoftAssert sa =new SoftAssert();
        sa.assertEquals(actual,excepted,"Both are not same");
        System.out.println("Hero");
        System.out.println("Super Hero");
        sa.assertAll();

    }
}
