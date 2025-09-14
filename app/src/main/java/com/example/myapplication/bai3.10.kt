package com.example.myapplication

fun main() {
    val words = listOf("about", "acute", "balloon", "best", "brief", "class")

    // Lọc ra những từ bắt đầu bằng chữ 'b' hoặc 'B'
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()    // xáo trộn ngẫu nhiên
        .take(2)       // lấy 2 phần tử đầu
        .sorted()      // sắp xếp theo alphabet

    println("Kết quả cuối cùng: $filteredWords")
}
