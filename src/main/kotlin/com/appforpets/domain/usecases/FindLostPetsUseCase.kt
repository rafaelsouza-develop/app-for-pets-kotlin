package com.appforpets.domain.usecases

import com.appforpets.domain.models.Pet
import com.appforpets.domain.repositories.PetRepository
import org.springframework.stereotype.Service

@Service
class FindLostPetsUseCase(private val petRepository: PetRepository) {
    fun execute(): List<Pet> {
        return petRepository.findByLost(true)  // Busca pets perdidos
    }
}