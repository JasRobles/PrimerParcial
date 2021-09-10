package com.example.primerexamenparcial_jacquelinerobles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Ejercicio1()
        Ejercicio2()
        Ejercicio3()

    }

    private fun Ejercicio3() {
        //Realizar una función que tenga una bucle en donde me recorra
        // los valores de X de (1 en 1), (2 en 2), (1 en 1 hacia bajo)
        // y (3 en 3 hacia bajo) y imprima el resultado de X en consola.
        // colocar el enlace al repositorio de GitHub
        for(x in 0..10){
            println(x)
        }
        for(x in 0..20 step 2){
            println(x)
        }
        for(x in 0..15 step 1){
            println(x)
        }
        for(x in 30 downTo 0 step 3){
            println(x)
        }
    }

    private fun Ejercicio2() {
        //Ejercicio 2 Realizar una función que tenga una senteciaWhen
        // en donde me compare el valor de la variable (tipodecomida)
       // y al encontrar muestre un mensaje en consola que diga el país
        // de origen del tipodecomida agrupar los que pertenezcan al
        // mismo país de origen.
       // colocar el enlace al repositorio de GitHub
        val tipodecomida = "tacos";

        when(tipodecomida){
            "tacos" ->{
                println("El pais de tipo de comida es $tipodecomida es de Mexico")
            }
            "Pupusas" ->{
                println("El pais de tipo de comida es  $tipodecomida es de El Salvador")
            }
            "Pastas" ->{
                println("El pais de tipo de comida es  $tipodecomida es de Francia")
            }
            "Valiadas" ->{
                println("El pais de tipo de comida es  $tipodecomida es de Honduras")
            }
            "Asado" ->{
                println("El pais de tipo de comida es  $tipodecomida es de Argentina")
            }
            else ->{
                println("No se conoce el pais que posee ese tipo de comida")
            }
        }
    }

    private fun Ejercicio1() {
    //Ejercicio 1 Realizar una función que tenga una sentencia
    // ifelse-elseif en donde me compare el valor de la variable
    // (Color) y de encontrarlo me muestre un mensaje en consola
    // que diga el color de la variable y el color no existiera
    // que me muestre un mensaje no se identifico el color.
    // colocar el enlace al repositorio de GitHub
        var color = "Rojo";
        if(color == "Rojo"){
        println("El color es $color");
        }else if(color == "Amarillo") {
            println("El color $color que busca no se identifico")
        }else if (color == "verde"){
            println("El color $color que busca no se identifico")
        }else if (color == "Azul"){
            println("El color $color que busca no se identifico")
        }else if (color == "violeta"){
            println("El color $color que busca no se identifico")
        }else{
            println("El color $color que busca no se identifico")
        }
    }
}