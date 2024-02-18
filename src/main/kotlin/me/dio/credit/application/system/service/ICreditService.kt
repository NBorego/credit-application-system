package me.dio.credit.application.system.service

import me.dio.credit.application.system.entity.Credit
import org.hibernate.validator.constraints.UUID

interface ICreditService {
    fun save(credit: Credit): Credit

    fun findAllByCustomerId(customerId: Long): List<Credit>

    fun findByCreditCode(customerId: Long, creditCode: UUID): Credit
}

