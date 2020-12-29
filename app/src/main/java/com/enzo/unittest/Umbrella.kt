package com.enzo.unittest

class Umbrella {
    fun totalPrice(weather: IWeather, quantity: Int, price: Int): Int{
        val isSunny = weather.isSunny()
        var price = quantity * price

       if(isSunny) {
           price = (price * 0.9).toInt()
       }
        return price
    }
}

interface IWeather{
    fun isSunny():Boolean
}

class Weather: IWeather {
    override fun isSunny(): Boolean {
        return true
    }
}

class StubWeather: IWeather {
    var fakeIsSunny = false
    override fun isSunny(): Boolean {
        return fakeIsSunny
    }
}