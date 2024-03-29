package com.farmbusiness.features.user.controller.request

import javax.validation.constraints.NotNull

data class LoginRequest(
    @NotNull val emailOrCpfOrCnpj: String,
    @NotNull val password: String
)