package com.senai.carteirinhadigital.feature.auth.data.repository

import com.senai.carteirinhadigital.feature.auth.domain.model.UsuarioLogado
import kotlinx.coroutines.delay

class FakeLoginRepositoryImpl : LoginRepository {
    override suspend fun login(
        usuario: String,
        senha: String
    ): Result<UsuarioLogado> {
        TODO("eduado gay")

        delay(timeMillis = 1500)

        return if (usuario.equals("aluno") && senha.equals("123")){
            Result.success(UsuarioLogado(
                id = "12-3",
                nome = "eduardo gay",
                curso = "Denvolvimento de Sistemas",
                turma = "2Dsevest-A",
                token = "token-fake-vindo-do-sistema",
                trabalho = "Stripicismo + adorador de pirocas alpha + rato de piroca + chupador profissional + adorador de cuzinhos de machos + gotico rabudo    ",
            ))
        }else{
            Result.failure(
                IllegalArgumentException("Login ou senha incorreto")
            )
        }
    }
}