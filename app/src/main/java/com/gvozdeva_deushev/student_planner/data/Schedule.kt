package com.gvozdeva_deushev.student_planner.data

data class Lesson(
    val id: String,
    val subjectName: String,
    val teacher: String,
    val dayOfWeek: Int,
    val type: String
)

val sampleSchedule = listOf(
    Lesson(
        id = "1",
        subjectName = "Разработка мобильных приложений",
        teacher = "Леонтьев Д.А",
        dayOfWeek = 1,
        type = "Лекция"
    ),
    Lesson(
        id = "2",
        subjectName = "Разработка программных модулей",
        teacher = "Донскова Д.А",
        dayOfWeek = 1,
        type = "Лабораторная"
    ),
    Lesson(
        id = "3",
        subjectName = "Системное программирование",
        teacher = "Токаев Т.И",
        dayOfWeek = 2,
        type = "Лабораторная"
    ),
    Lesson(
        id = "4",
        subjectName = "Математическое моделирование",
        teacher = "Трошина О.В",
        dayOfWeek = 2,
        type = "Лекция"
    ),
    Lesson(
        id = "5",
        subjectName = "Физическая культура",
        teacher = "Магомедов С.К",
        dayOfWeek = 3,
        type = "Практика"
    ),
    Lesson(
        id = "6",
        subjectName = "Иностранный язык",
        teacher = "Пенькова О.В",
        dayOfWeek = 4,
        type = "Практика"
    ),
    Lesson(
        id = "7",
        subjectName = "Разработка мобильных приложений",
        teacher = "Леонтьев Д.А",
        dayOfWeek = 4,
        type = "Лабораторная"
    ),
)

fun getLessonForDay(day: Int): List<Lesson> {
    return sampleSchedule.filter { it.dayOfWeek == day }
}

fun getDayName(day: Int): String {
    return when(day) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        else -> "Воскресенье"
    }
}

fun getLessonById(id: String): Lesson? {
    return sampleSchedule.find { it.id == id }
}