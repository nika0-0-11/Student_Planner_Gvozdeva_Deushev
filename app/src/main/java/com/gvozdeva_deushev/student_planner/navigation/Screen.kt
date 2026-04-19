package com.gvozdeva_deushev.student_planner.navigation

import javax.security.auth.Subject

sealed class Screen(val route: String) {
    object Home : Screen("home")

    object Details : Screen("details/{subjectId}") {
        fun createRoute(subjectId: String) = "details/$subjectId"
    }

    object Profile : Screen("profile")

    object Settings : Screen("settings")

    object Schedule : Screen("schedule")

    object LessonDetails : Screen("lesson/{lessonId}") {
        fun createdRoute(lessonId: String) = "lesson/$lessonId"
    }
}