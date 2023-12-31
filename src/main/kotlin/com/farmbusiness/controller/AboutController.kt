package com.farmbusiness.controller

import com.farmbusiness.controller.request.PostAboutRequest
import com.farmbusiness.controller.request.PutAboutRequest
import com.farmbusiness.controller.response.AboutResponse
import com.farmbusiness.extension.toAboutModel
import com.farmbusiness.extension.toResponse
import com.farmbusiness.service.AboutService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("about")
class AboutController(
    private val aboutService: AboutService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid request: PostAboutRequest) {
        aboutService.create(request.toAboutModel())
    }

    @GetMapping
    fun find(): AboutResponse? {
        return aboutService.findAbout()?.toResponse()
    }

    @DeleteMapping("")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete() {
        aboutService.delete()
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@RequestBody request: PutAboutRequest) {
        aboutService.update(request.toAboutModel())
    }
}