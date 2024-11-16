package TestNG;

import org.testng.annotations.Test;

public class inncocations_count extends launch_Brower {

    @Test(invocationCount = 3)
    public void seachring_details(){
        System.out.println("I am the real Fan");
    }
}
