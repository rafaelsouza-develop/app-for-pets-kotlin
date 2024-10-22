package com.appforpets.presentation.controllers

import com.appforpets.application.services.PetService
import com.appforpets.domain.models.Pet
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/pets")
class PetController(private val petService: PetService) {

    @PostMapping
    fun registerPet(@RequestBody pet: Pet): ResponseEntity<Pet> {
        val registeredPet = petService.registerPet(pet)
        return ResponseEntity.ok(registeredPet)
    }

    @GetMapping("/lost")
    fun getLostPets(): ResponseEntity<List<Pet>> {
        val lostPets = petService.getLostPets()
        return ResponseEntity.ok(lostPets)
    }
}