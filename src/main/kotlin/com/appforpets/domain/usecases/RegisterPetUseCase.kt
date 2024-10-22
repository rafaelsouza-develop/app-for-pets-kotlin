package com.appforpets.domain.usecases

import com.appforpets.domain.models.Pet
import com.appforpets.domain.repositories.PetRepository
import org.springframework.stereotype.Service

@Service
class RegisterPetUseCase(private val petRepository: PetRepository) {
    fun execute(pet: Pet): Pet {
        return petRepository.save(pet)  // Salva o pet no MongoDB
    }
}