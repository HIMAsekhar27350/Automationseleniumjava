# Test NG:
# what  is  testNg?
# Test Ng  is  test Next  Generation .
# its  a  testing  framework which is  used  to  organize  our test cases.
# here  annotations plays important role.
# with out  using main(),test cases can be  designed using annotations.
# About  Annotations:
# its  starts  with  @ symbol.
# it  will centerilized  the  flow.when we  use  annotations then we should  not  use main()
# annotations in testNG are
# @beforeSuit  @AfterSuite
# @BeforeTest   @AfterTest
# @BeforeClass   @AfterClass
# @BeforeMethod   @AfterMethod
# @Test
# how  the  execution flow:
# bs->bt->bc->bm->@Test->Am->Ac->At->As
# what do u ment by groping?
# we can  do grouping  with  the  help  of  @Test annotaion.
# by using  "groups"  with  particular name we will group for methods
# Ex:
# @Test(groups={"dillep","leelakanth"});
# public void  input()
# {
# }
# @Test(groups={"leelakanth"});
# public  void output()
# {
# }
# @Test(groups={"dillep"})
# public  void  get()
# {
# }
# can  we  achive  parallel  execution?
# yes we can
# in testng.xml  file  we  have  to  use parallel="classes"
# is there any  annotaion to  execute  same  method  multiple times ?
# yes,the  annotaion called  InvocationCount is  used
# @Test(InvocationCount=10)
# public  void  input()
# {
# }
# what  is the use of DependsOn ?
# Assertions?
# hard  assertion--->serious issues
# soft assertion---> cosmotic isssues
# go through with  notes 
# where u get testNG dependency ?
# there  is  mvn repository, from here we will search for test ng dependency.
# select new version ,copy it and past it in pom.xml file
# which  version of testng?
# 7.2.0
# what  is  data provider?
# -----------------------------------------------------------------------
# selenium
# where u get selenium dependency ?
# there  is  mvn repository, from here we will search for selenium dependency.
# select new version ,copy it and past it in pom.xml file.
# which version of selenium?
# selenium 4
# what  are advantages  in selenium 4  when  compare to selenium 3? 
# which  test  build u r using?
# maven test build.
# y maven?
# we can easily  add the dependencies.

# any  other  test builds?
# gradle
# external lib?
# where we write testing code?
# can  u launch  chrome browser?
# how can  u  check  website  title n given title is same or not?
# using  assetion we can do
# code
# how to get   title of web page
# diver.getTitle()
# how to get   current url of web page
# diver.getCurrentUrl()
# how to get   sourcecode of web page
# diver.getpageSource()
# what  are  basic  methods  in selenium?
# getTitle()
# getCurrenturl()
# getPageSource()
# what  are locators  in selenium?
# id,
# name,
# classname
# linktext
# partial link text
# tagname
# xpath
# css selector 
# go  to some  site  find  xpath for mobiles from flipkart?
# go to  amazon and search for samsumg phone and write  code to get price of it?
 
# same loactors  like id,
# name,
# classname which  u will prefer?

# id ,because  its unique
# if  there  are  100 hyperlinks,how to  count and display all
# hyperlinks?

# what is  xpath? types  of xpath?
# xpath is the loactor.
# there are 2  types  of  xpath
# 1.Absolute  xpath   2.Relative Xpath
# Absolute Xpath-->
# its  starts  from  root  of the web page followed by /
# relative Xpath--->
# its begin with //
# //tagname[@attribute='value']
# axis functions:
# starts_with()
# contains()
# text()
# xpath ex:
# //input[@name='q']
# //a[@id='u_0_2']
# //a[starts-with(@id,'u_0_2')]
# //a[text()='Images']
# //a[contains(text(),'create new')]

# css selector:
# name=q
# driver.findElement(By.cssSelector("input[name='q']")).sendKeys("banglore");
# id=q
# driver.findElement(by.cssSelector("#q")).sendKeys("banglore");
# driver.findElement(By.cssSelector("input[id='q']")).sendKeys("banglore");
# class=q
# driver.findElement(by.cssSelector(".q")).sendKeys("banglore");
# driver.findElement(By.cssSelector("input[class='q']")).sendKeys("banglore");

# axis  functions:
# id="twotabsearchtextbox"
# ("input[id$='box']")
# ("input[id^='two']");
# ("input[id*='tab']");

# following and preceding:

# following:
# //table[@id='table1']/tbody/tr/td[3]//following::td[4]
# preceding:
# //table[@id='table1']/tbody/tr/td[3]//preceding-sibling::td[4]

# pop up:
# (//*[starts-with(@d,'M13')])[3]

# what is the diff b/w  xpath  n css selector?
# 1.xpath is slower
# 2.css selector is  faster
# bocz  css selector  uses regular expression(#,.) n accessfunction($,*,^)

# what is the diff b/w link text and partial link text?
# explain about  chromeoptions?
# to  allow  notification and to run i headless mode(with out browser)

# just dail-->
# ChromeOptions ops=new ChromeOptions();
# ops.add_arguments("--disable-notifications");
# ops.add_arguments("--headless");
# d=new Chromedriver(ops);
# how to do scrolling?
# selenium dosn't supports  scrolling.
# we have use javascript  executor
# follow the notes
# navigate  functions()
# syntax:
# driver.navigate().back();
# driver.navigate().forward();
# driver.navigate().refresh();
# driver.navigate().tourl("https://www.google.com");  or driver.get("https://www.google.com");
# Mouse  Events:
# 1.mouseHover(move to element)
# 2.rightclick(contextclick)
# 3.drag n drop
# 4.double click

# Actions  class is  used  to  perform  mouse events
# 1.mouseHover(move to element)
# Actions act=new Actions(driver);
# act.moveToElement(xpath).buid().perform();
# 2.rightclick(contextclick)
# Actions act=new Actions(driver);
# act.contextClick(xpath).buid().perform();
# 3.drag n drop
# Actions act=new Actions(driver);
# act.dragandDrop(xpath,xpath).buid().perform();
# 4.double click
# Actions act=new Actions(driver);
# act.doubleClick(xpath).buid().perform();
# properties file:
# its stores  test  data  in the form  of key value pair
# Ex:
# url=https://www.google.com
# url---->key
# value=https://www.google.com
# properties  file extension .properties
# code  to  read  properties file:
# FileInputStream fis=new FileInputStream("path of  properties file");
# Properties prop=new Properties();
# prop.load(fis);
# String u=prop.getProperty(key);
# how  to  handle  the  drop down?
# we have  to use  Select class.
# Select sel=new Select();
# we handle the  dropdown  in 3 ways
# 1.selectbyvisibletext  2.Selectbyvalue  3.selectbyindex
# WebElement languages=driver.find....
# Select sel=new Select(languages);
# sel.selectByvisibleText("Afrikaans");
# sel.selectByIndex(1);
# sel.selectByvalue("ast");