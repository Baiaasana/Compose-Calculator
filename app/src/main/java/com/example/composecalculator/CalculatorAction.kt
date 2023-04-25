package com.example.composecalculator

sealed class CalculatorAction{
    data class Number(val number: Int): CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
    object Clear: CalculatorAction()
    object Remove: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
}
