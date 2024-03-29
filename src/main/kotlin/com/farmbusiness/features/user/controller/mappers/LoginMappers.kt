package com.farmbusiness.features.user.controller.mappers

import com.farmbusiness.features.user.controller.response.LoginResponse
import com.farmbusiness.features.user.domain.model.UsersModel

/**
 * @author @jeancsanchez
 * @created 11/01/2024
 * Jesus loves you.
 */

fun Pair<String?, UsersModel?>.toLoginResponse(): LoginResponse =
    LoginResponse(
        token = first,
        userData = second
    )