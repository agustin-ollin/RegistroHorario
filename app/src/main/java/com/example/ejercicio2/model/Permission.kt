package com.example.ejercicio2.model

import java.time.LocalDate

/**
 * Agregar Empleado y justificación
 */
data class Permission(
    val employee: Employee,
    val date: LocalDate,
    val justification: String
)
