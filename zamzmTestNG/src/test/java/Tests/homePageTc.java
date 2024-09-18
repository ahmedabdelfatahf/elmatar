package Tests;
import org.testng.annotations.Test;
import pages.homePage;


public class homePageTc extends BaseTest{
    homePage hp;
    @Test
    public void tc2(){
        reportTest=report.createTest("Zamzam testcase");
hp=new homePage(driver);
hp.popUpCancellation();
hp.scrollDown();
hp.clickOnFaceBook();
faceURL=hp.tabsHandles(tabs);
customSoftAssert(softAssert,((faceURL).contains("zamzam")),"yes it contains the word zamzam and the actual url is : " + faceURL,"no it doesn't contains the word zamzam and the  Actual URL is : " + faceURL);
hp.scrollUP();
hp.scrollDown();
hp.clickOnx();
xURL=hp.tabsHandles(tabs);
customSoftAssert(softAssert,((xURL).contains("zamzam")),"yes it contains the word zamzam and the actual url is : " + xURL,"no it doesn't contains the word zamzam and the  Actual URL is : " + xURL);
hp.clickOnLinkedin();
linkedinURL=hp.tabsHandles(tabs);
customSoftAssert(softAssert,((linkedinURL).contains("zamzam")),"yes it contains the word zamzam and the actual url is : " + linkedinURL,"no it doesn't contains the word zamzam and the  Actual URL is : " + linkedinURL);
hp.clickOnYoutube();
youtubeURL=hp.tabsHandles(tabs);
customSoftAssert(softAssert,((youtubeURL).contains("zamzam")),"yes it contains the word zamzam and the actual url is : " + youtubeURL,"no it doesn't contains the word zamzam and the  Actual URL is : " + youtubeURL);
hp.clickOnInstagram();
instagramURL=hp.tabsHandles(tabs);
customSoftAssert(softAssert,((instagramURL).contains("zamzam")),"yes it contains the word zamzam and the actual url is : " + instagramURL,"no it doesn't contains the word zamzam and the  Actual URL is : " + instagramURL);
hp.scrollUP();
hp.enterUmrahDestination(DES);
hp.CheckINCheckOUT();
hp.roomsANDGuests(ROOMS);
hp.nationality("Egypt");
String DEST=hp.des();
String rooms=hp.room();
customSoftAssert(softAssert,DEST.contains(DES.toLowerCase()),"THIS IS THE RIGHT DESTNATION ","THIS IS WRONG DESTINATION ");
customSoftAssert(softAssert,rooms.contains(ROOMS.toLowerCase()),"THIS IS THE RIGHT number of room ","THIS IS WRONG number of rooms  ");
hp.CheckAvailability();
String errorMSG=hp.errorMSG();
        System.out.println(errorMSG);
    }
}
