package com.appforpets.application.services

import com.appforpets.domain.models.Pet
import com.appforpets.domain.usecases.FindLostPetsUseCase
import com.appforpets.domain.usecases.RegisterPetUseCase
import org.springframework.stereotype.Service

@Service
class PetService(
    private val registerPetUseCase: RegisterPetUseCase,
    private val findLostPetsUseCase: FindLostPetsUseCase
) {
    fun registerPet(pet: Pet): Pet {
        return registerPetUseCase.execute(pet)
    }

    fun getLostPets(): List<Pet> {
        return findLostPetsUseCase.execute()
    }
}