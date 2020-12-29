package com.enzo.unittest


import org.junit.Assert
import org.junit.Before
import org.junit.Test


/*常見的Annotation:
* @Test：註明該方法為測試方法，該方法只能public void，即kotlin中只使用fun+函數定義方法即可。
* @Before：在每個測試方法執行前調用一次。
* @After：每個測試方法執行後調用一次。
* @BeforeClass：在所有方法執行前調用一次，只會執行一次，該註解的方法必須是public static void，
*               即kotlin中添加@JvmStatic註解並使用fun+函數定義方法即可。
* @AfterClass：條件對應@BeforeClass，所有方法執行後調用一次。
* @Ignore：忽略該測試方法，當不想使用該方法時可添加該註解。
* @RunWith：表明類的測試運行器。
* */
class MathTest {

    lateinit var math: Math

    @Before
    fun setup(){
        math = Math()
    }

    /*測試單元有返回值*/
    @Test
    fun addTest(){
        val expected = 3
        val actual = math.add(1, 2)
        Assert.assertEquals(expected,actual)
    }

    /*測試單元無返回值*/
    @Test
    fun math2AddTest(){
        val math = Math2()
        val expected = 3
        math.add(1,2)
        val actual = math.result
        Assert.assertEquals(expected,actual)
    }


    /*測試涵蓋率 (Run test with Coverage)*/
    @Test
    fun testNumber1LessNumber2_minimumShouldBeNumber1(){
        //number1 比 number2 小的案例
        val expected = math.minmum(1,3)
        val actual = 1
        Assert.assertEquals(expected,actual)
    }

    @Test
    fun testNumber2LessNumber1_minimumShouldBeNumber2(){
        //number2 比 number1 小的案例
        val expected = math.minmum(3,1)
        val actual = 1
        Assert.assertEquals(expected,actual)
    }

}

/*
* 驗證被測試物件有三種方式
* 1.驗證回傳值
* 2.驗證物件狀態的改變
* 3.驗證目標與相依物件的互動
* */

/*
* 其他注意事項：
* 1.測試不該有條件判斷，如果有就代表其中有測試可能不會被執行到。
* 2.測試應該要簡單，簡單到一出錯不用debug直接看就知道哪裡錯，
*   測試程式應只是描述一件事，儘量不要有for迴圈等複雜的邏輯。
* */