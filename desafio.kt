
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }


data class Usuario(val nome: String, val email: String)


data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)


data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    
    val inscritos = mutableListOf<Usuario>()
    
    
    fun matricular(usuario: Usuario) {
       
        inscritos.add(usuario)
        
        println("${usuario.nome} foi matriculado na formação $nome.")
    }
}

fun main() {
    
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 30, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Estruturas de dados em Kotlin", 45, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Programação orientada a objetos em Kotlin", 90, Nivel.DIFICIL)

    
    val formacao = Formacao("Desenvolvimento Android com Kotlin", listOf(conteudo1, conteudo2, conteudo3))

   
    val usuario1 = Usuario("João", "joao@gmail.com")
    val usuario2 = Usuario("Maria", "maria@hotmail.com")
    val usuario3 = Usuario("Pedro", "pedro@yahoo.com")

    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

  
}