package main

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    do {
        val pilihOpsi = menuCetakInfo()
        pengecekanMenu(pilihOpsi)
        print("\nApakah ingin mencoba lagi(y/n)? ")
        val scanner = Scanner(System.`in`)
        val decision = scanner.next().single()
        print("\n")
    } while (decision == 'y' || decision == 'Y')
}

fun menuCetakInfo(): Int {
    println("Aplikasi Implementasi For, While, dan Lambda")
    println("=====")
    println("1. Info Hero ML")
    println("2. Info Hero Valorant")
    print("Pilih Menu: ")
    return readLine()?.toInt()!!
}

fun pengecekanMenu(input: Int){
    if (input == 1) {
        cetakInfoHeroML(arrayListOf("Ling", "Barats", "Lancelot", "Granger", "Esmeralda"))
    } else if (input == 2) {
        cetakInfoHeroValorant(arrayListOf("Jett", "Reyna", "Raze", "Yoru", "Kay/O"))
    } else {
        println("tidak ada menu yang tersedia")
        return
    }
}

val cetakInfoHeroML: (ArrayList<String>) -> Unit = {
    print("Beberapa Hero ML: ")
    for (list in it) {
        print("$list, ")
    }
}

val cetakInfoHeroValorant: (ArrayList<String>) -> Unit = {
    print("Beberapa Hero Valorant: ")
    while (it.toArray().isNotEmpty()) {
        print("${it.joinToString( ", ")}, ")
        break
    }
}