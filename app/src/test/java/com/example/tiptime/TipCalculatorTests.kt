package com.example.tiptime
import junit.framework.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {
    @Test
    fun calculate_20_percent_tip_no_roundup(amount: Double, tipPercent: Double, roundup: Boolean){
        val amount = 10.00
        val tipPercent = 20.00
        val expected = "$2.00"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expected, actualTip)
    }
}