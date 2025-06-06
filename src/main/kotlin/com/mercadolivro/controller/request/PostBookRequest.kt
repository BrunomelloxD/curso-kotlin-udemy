package com.mercadolivro.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import org.springframework.format.annotation.NumberFormat
import javax.validation.constraints.NotEmpty
import java.math.BigDecimal
import javax.validation.constraints.NotNull

data class PostBookRequest (
    @field:NotEmpty(message = "Nome deve ser informado")
    var name: String,

    @field:NotNull(message = "Preço deve ser informado")
    var price: BigDecimal,

    @JsonAlias("customer_id")
    var customerId: Int
)