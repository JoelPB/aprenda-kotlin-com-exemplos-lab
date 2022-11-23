// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
package org.kotlinlang.play




enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome:String, val sobrenome:String, val nascimento:Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        for (novo in usuario) {
            inscritos.add(novo)
        }
    }
}

fun main() {
    println("Hello, World!")
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
