package com.enzo.unittest

class Math {
    fun add(number1: Int,number2: Int): Int {
        return number1+ number2
    }

    fun minmum(number1: Int,number2: Int): Int {
        return if(number1 > number2){
            //最小值為number2
            number2
        }else{
            //最小值為number1
            number1
        }
    }
}

class Math2 {
    var result = 0
    fun add(number1: Int,number2: Int) {
        result =  number1+ number2
    }
}