package com.gvozdeva_deushev.student_planner.data

data class Subject(
    val id: String,
    val name: String,
    val professor: String,
    val credits: Int,
    val currentGrade: String,
    val description: String
)

val sampleSubject = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."
    ),
    Subject(
        id = "2",
        name = "Разработка программных модулей",
        professor = "Донскова Д.А.",
        credits = 95,
        currentGrade = "Отлично",
        description = "test1"
        ),
    Subject(
        id = "3",
        name = "Системное программирование",
        professor = "Токаев Т.И.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Низкоуровневая разработка на языке Rust: управление памятью без сборщика мусора, многопоточность, работа с операционной системой и создание высокопроизводительных системных компонентов.",
    ),
    Subject(
        id = "4",
        name = "Математическое моделирование",
        professor = "Трошина О.В.",
        credits = 55,
        currentGrade = "Удовлетворительно",
        description = "test2",
    ),
    Subject(
        id = "5",
        name = "Физическая культура",
        professor = "Магомедов С.К.",
        credits = 100,
        currentGrade = "Отлично",
        description = "test3",
    ),
    Subject(
        id = "5",
        name = "Иностранный язык",
        professor = "Пенькова О.В.",
        credits = 95,
        currentGrade = "Отлично",
        description = "test4"
    )
)