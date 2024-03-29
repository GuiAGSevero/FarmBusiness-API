package com.farmbusiness.features.eula.controller

import com.farmbusiness.features.eula.controller.mappers.toResponse
import com.farmbusiness.features.eula.controller.mappers.toTermsOfUseModel
import com.farmbusiness.features.eula.controller.request.terms.PostTermsOfUseRequest
import com.farmbusiness.features.eula.controller.request.terms.PutTermsOfUseRequest
import com.farmbusiness.features.eula.controller.response.TermsOfUseResponse
import com.farmbusiness.features.eula.domain.terms.TermsOfUseService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("terms-of-use")
class TermsOfUseController(
    private val termsOfUseService: TermsOfUseService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid request: PostTermsOfUseRequest) {
        termsOfUseService.create(request.toTermsOfUseModel())
    }

    @GetMapping
    fun find(): TermsOfUseResponse? {
        return termsOfUseService.findTermsOfUse()?.toResponse()
    }

    @DeleteMapping("")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete() {
        termsOfUseService.delete()
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@RequestBody request: PutTermsOfUseRequest) {
        termsOfUseService.update(request.toTermsOfUseModel())
    }
}