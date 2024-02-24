enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val id: Int)

data class ConteudoEducacional(val nome: String, var duracao: Int)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: MutableList<ConteudoEducacional>) {

val inscritos = mutableListOf<Usuario>()
    
fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("$usuario matriculado na formação $nome")
    }
}

fun main() {
    val sandra = Usuario("Sandra", 1)
    val androidDeveloper = Formacao("Android Developer", Nivel.BASICO, mutableListOf())
    val conteudo1 = ConteudoEducacional("Princípios de Interface de Usuário e Layouts Android", 2)
    val conteudo2 = ConteudoEducacional("Manipulando Entradas do Usuário em Apps Android", 2)

    androidDeveloper.conteudos.add(conteudo1)
    androidDeveloper.conteudos.add(conteudo2)
    
    androidDeveloper.matricular(sandra)
}