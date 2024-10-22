package com.appforpets.domain.repositories

import com.appforpets.domain.models.Pet
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PetRepository : MongoRepository<Pet, String> {
    fun findByLost(lost: Boolean): List<Pet>  // Exemplo de metodo para buscar pets perdidos
}