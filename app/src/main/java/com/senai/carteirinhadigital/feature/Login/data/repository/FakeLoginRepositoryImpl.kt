package com.senai.carteirinhadigital.feature.Login.data.repository

import com.senai.carteirinhadigital.feature.Login.domain.model.UsuarioLogado
import kotlinx.coroutines.delay

class FakeLoginRepositoryImpl : LoginRepository {
    override suspend fun login(
        usuario: String,
        senha: String
    ): Result<UsuarioLogado> {
        TODO("josé gay")

        delay(timeMillis = 1500)

        return if (usuario.equals("eu") && senha.equals("1212")){
            Result.success(UsuarioLogado(
                id = "12-3",
                nome = "josé gay",
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