package me.dio.credit.application.system.entity

data class Customer (
    var firstName: String = "",
    var lastName: String = "",
    val cpf: String,
    var email: String = "",
    var address: Address = Address(),
    var credits: List<Credit> = mutableListOf(),
    val ind: Long? = null
)