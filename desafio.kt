// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
package org.kotlinlang.play




enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome:String, val sobrenome:String, val nascimento:Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuario: Usuario) {
//        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        for (novo in usuario) {
            inscritos.add(novo)
        }
    }
}

fun main() {
    println("Hello, World!")
//    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuário1 = Usuario("Joel", "de Oliveira", 1983)
    val usuário2 = Usuario("Maria", "da Silva", 1999)
    val conteudo1 = ConteudoEducacional("Kotlin", 120, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Java", 90, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Python", 120, Nivel.AVANCADO)
    val formacao1 = Formacao("Android", listOf(conteudo1, conteudo2))
    val formacao2 = Formacao("Big Data", listOf(conteudo3))

    formacao1.matricular(usuário1, usuário2)
    formacao2.matricular(usuário2)

    println("Formação: ${formacao1.nome}")
    for (conteudo in formacao1.conteudos){
        println("\tConteúdo: ${conteudo.nome}")
        println("\t\tCarga horária: ${conteudo.duracao}")
        println("\t\tNível: ${conteudo.nivel}")
    }
    println("\tInscritos:")
    for (inscrito in formacao1.inscritos){
        println("\t${inscrito.nome}")
    }

    println("Formação: ${formacao2.nome}")
    for (conteudo in formacao2.conteudos){
        println("\tConteúdo: ${conteudo.nome}")
        println("\t\tCarga horária: ${conteudo.duracao}")
        println("\t\tNível: ${conteudo.nivel}")
    }
    println("\tInscritos:")
    for (inscrito in formacao2.inscritos){
        println("\t${inscrito.nome}")
    }

}
