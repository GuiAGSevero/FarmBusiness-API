package com.farmbusiness.utils.extension

import com.farmbusiness.features.eula.controller.response.PageResponse
import org.springframework.data.domain.Page

/**
 * @author @jeancsanchez
 * @created 11/01/2024
 * Jesus loves you.
 */

fun <T> Page<T>.toPageResponse(): PageResponse<T> {
    return PageResponse(
        this.content,
        this.number,
        this.totalElements,
        this.totalPages
    )
}