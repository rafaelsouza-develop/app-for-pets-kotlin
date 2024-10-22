package com.appforpets.domain.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "pets")  // Define que este é um documento do MongoDB
data class Pet(
    @Id val id: String? = null,  // ID gerado automaticamente pelo MongoDB
    val name: String,
    val species: String,
    val breed: String?,
    val age: Int,
    val ownerId: String,  // Relacionado ao dono do pet
    val lost: Boolean = false,  // Indica se o pet está perdido
    val location: String? = null  // Última localização conhecida
)
