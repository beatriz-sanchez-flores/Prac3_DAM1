class Persona(var nombre:String, var apellido:String)

fun main(){
    var persona = Persona("Yesser","Miranda")
    var nueva = Persona()
    nueva.nombre = "Juan"
    nueva.apellido = "Lopez"

    println(persona.nombre)
    println(nueva.nombre)
}