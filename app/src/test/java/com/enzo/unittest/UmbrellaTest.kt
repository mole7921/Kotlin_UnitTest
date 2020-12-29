package com.enzo.unittest

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class UmbrellaTest {

    lateinit var umbrella: Umbrella
    lateinit var weather: StubWeather

    @Before
    fun setup(){
        umbrella = Umbrella()
        weather = StubWeather()
    }

    @Test
    fun totalPrice_sunnyDay(){
        weather.fakeIsSunny = true

        val actual = umbrella.totalPrice(weather,3,100)
        val expected = 270
        Assert.assertEquals(expected,actual)
    }

    @Test
    fun totalPrice_rainingDay(){
        weather.fakeIsSunny = false

        val actual = umbrella.totalPrice(weather,3,100)
        val expected = 300
        Assert.assertEquals(expected,actual)
    }


}