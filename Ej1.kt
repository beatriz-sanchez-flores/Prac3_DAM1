open class personas{
    open fun recorrer()
    {
    println("Soy una persona")
    }
}
// 1 persona
class Beatriz:personas()
{
    override fun recorrer()
    {
    println("Soy Betriz")
    }
}
//2 persona
class Luna:personas()
{
    override fun recorrer()
    {
    println("Soy Luna la mas chula")
    }
}
//3 persona
class Marcelo:personas()
{
    override fun recorrer()
    {
    println("Soy Marcelo")
    }
}
fun main()
{
    var lista_personas= ArrayList<personas>()
    var Beatriz= Beatriz()
    var Luna= Luna()
    var Marcelo= Marcelo()


    lista_personas.add(Beatriz)
    lista_personas.add(Luna)
    lista_personas.add(Marcelo)
    for(personas in lista_personas)

    {
            personas.recorrer()
    }

}