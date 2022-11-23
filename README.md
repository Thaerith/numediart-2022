# numediart-2022

## Apprendre Kotlin

https://kotlinlang.org/docs/basic-syntax.html

https://play.kotlinlang.org/

### Les fonctions

```
fun main() {
	val result1 = multiplyBy(2,3)
    val result2 = multiplyBy(a = 2, b = 3)
    val result3 = multiplyBy(b = 2, a = 3)
    val result4 = multiplyBy()
    
    println("result1: $result1")
    println("result2: $result2")
    println("result3: $result3")
    println("result4: $result4")
    
    println(sayHelloWorld(a = "Hello", b = "tout le monde"))    
    println(sayHelloWorld(b = "tout le monde"))
}

fun sayHelloWorld() = println("Hello, World")

fun sayBirthday() = println("12/12/1920")

fun multiplyBy(a: Int = 2, b:Int = 3): Int {
    return a * b
}

fun sayHelloWorld(a: String = "Hello", b: String) = "$a $b"
```
