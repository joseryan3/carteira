package com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.data

import com.senai.carteirinhadigital.feature.unidadeCurricular.domain.model.UnidadeCurricular
import com.senai.carteirinhadigital.feature.unidadeCurricular.presentation.component.UnidadeCurricularCard

fun dataSouce (): List<UnidadeCurricular> {
    return listOf(
        UnidadeCurricular(id = "1", nome = "Matematica", professor = "jorge", nota1 = 8.5, nota2 = 7.0, media = 8.90, faltas = 2),
        UnidadeCurricular(id = "2", nome = "Português", professor = "jacy", nota1 = 8.5, nota2 = 7.0, media = 8.90, faltas = 2),
        UnidadeCurricular(id = "3", nome = "Englesh", professor = "kley", nota1 = 8.5, nota2 = 7.0, media = 8.90, faltas = 2),
        UnidadeCurricular(id = "4", nome = "Geografia", professor = "Laura", nota1 = 8.5, nota2 = 7.0, media = 8.90, faltas = 2),
        UnidadeCurricular(id = "5", nome = "Filosofia", professor = "Leonardo", nota1 = 8.5, nota2 = 7.0, media = 8.90, faltas = 2),
        UnidadeCurricular(id = "6", nome = "História", professor = "Amer", nota1 = 8.5, nota2 = 7.0, media = 8.90, faltas = 2),
        UnidadeCurricular(id = "7", nome = "quimica", professor = "cybele", nota1 = 8.5, nota2 = 7.0, media = 8.90, faltas = 2)

    )
}