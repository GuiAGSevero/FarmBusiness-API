package com.farmbusiness.errors.exceptions

class NotFoundException(
    override val message: String,
    val errorCode: String
) : Exception()