fun main() {
    var helloWorld: String
    val NUM: Int = 0
    var word: String = "6"
    helloWorld = word + NUM
    println(helloWorld + NUM + word)

    if (NUM < 0) {
        println("Вы сохранили отрицательное число")
    } else if (NUM > 0) {
        println("Вы сохранили сохранили положительное число")
    } else {
        println("Вы сохранили ноль")
    }

    // 3 часть
    var sun: Array<Double> = arrayOf(2.0, 5.0, 3.0, 4.0, -5.0, -6.0, 8.0, 10.0, -8.0, 0.5, -3.0, 4.0, -7.0, 9.0, -9.0)
    var gfd: Boolean = false
    var jhg: Double = 0.0
    var uyt: Int = 0
    for (i in sun) {
        if (i < 0) {
            gfd = true
        }

        if (gfd == true && i > 0) {
            jhg += i
            uyt += 1
        }
    }
    println(jhg / uyt)

    // 2 часть
    println(vae(28, 58.0))
    println(vae(25, -18.0))
    println(vae(54, 45.0))
    println(vae(29, 18.0))
    println(vae(45, 63.0))
    println(vae(65, 20.0))
}

fun vae(age: Int, asdf: Double): String {
    if (age in 20..45 && asdf in -20.0..30.0) {
        return "Можно идти гулять"
    }
    if (age < 20 && asdf in 0.0..28.0) {
        return "Можно идти гулять"
    }
    if (age > 40 && asdf in -10.0..25.0) {
        return "Можно идти гулять"
    } else {
        return "оставайтесь дома"
    }
}