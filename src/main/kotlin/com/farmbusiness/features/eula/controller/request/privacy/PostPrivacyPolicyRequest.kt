package com.farmbusiness.controller.request.privacy

import javax.validation.constraints.NotEmpty

data class PostPrivacyPolicyRequest (

    @field:NotEmpty(message = "Política de Privacidade deve ser informado")
    var privacyPolicy: String
)