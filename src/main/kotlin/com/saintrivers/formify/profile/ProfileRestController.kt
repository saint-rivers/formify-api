package com.saintrivers.formify.profile

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


/**
 * made by Eam Dayan with this tutorial
 * https://www.youtube.com/watch?v=kBRdW7oQ27Y
 *
 */
@RestController
@RequestMapping("/api/v1/profile")
class ProfileRestController(val profileService: ProfileService) {

    @GetMapping
    fun getPagedProfile(): ResponseEntity<List<Profile>> {
        val profile = Profile("123", "Bob", "Nelson")
        val payload = listOf(profile)
        val data = profileService.findPagedProfile()
        return ResponseEntity.status(HttpStatus.OK).body(payload)
    }

    @GetMapping("/{profileId}")
    fun getProfileByProfileId(@PathVariable profileId: String): ResponseEntity<Profile> {
        val profile = Profile("123", "Bob", "Nelson")
        return ResponseEntity.status(HttpStatus.OK).body(profile)
    }

    @PostMapping
    fun insertNewProfile(request: ProfileDto): ResponseEntity<Profile> {
        val profile = Profile("12345", request.firstname, request.lastname)
        return ResponseEntity.status(HttpStatus.OK).body(profile)
    }

    @PutMapping("/{profileId}")
    fun updateProfile(@PathVariable profileId: String, @RequestBody request: ProfileDto): ResponseEntity<Profile> {
        val profile = Profile(profileId, request.firstname, request.lastname)
        return ResponseEntity.status(HttpStatus.OK).body(profile)
    }

    @DeleteMapping("/{profileId}")
    fun deleteProfile(@PathVariable profileId: String): ResponseEntity<Void> {
        return ResponseEntity.ok().build()
    }
}