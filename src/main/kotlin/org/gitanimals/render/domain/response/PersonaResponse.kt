package org.gitanimals.render.domain.response

import org.gitanimals.render.domain.Persona
import org.gitanimals.render.domain.PersonaType

data class PersonaResponse(
    val id: String,
    val type: PersonaType,
    val level: String,
) {
    companion object {
        fun from(persona: Persona): PersonaResponse {
            return PersonaResponse(persona.id.toString(), persona.type, persona.level.toString())
        }
    }
}
