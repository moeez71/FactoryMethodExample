package uk.co.planetbeyond.factorymethod

interface Coffee {
    fun name(): String
    fun recipe(): String
}

class CaffeLatte : Coffee {
    override fun name(): String  ="CaffeLatte"
    override fun recipe(): String  ="Expresso"
}

class Americano : Coffee {
    override fun recipe(): String = "Expresso, Hot water"
    override fun name(): String = "Caffè Americano"
}