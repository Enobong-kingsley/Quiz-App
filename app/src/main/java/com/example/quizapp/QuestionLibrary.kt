package com.example.quizapp

class QuestionLibrary {
    val mQuestion = arrayListOf(
        "Which prt of the plants holds it to the soil?",
        "Which part of the plants absorbs energy from the sun",
        "Which part of the plants attracts bees and butterflies",
        "The _____ holds the plants upright"
    )

    val mChoice = arrayListOf("Roots", "Stem", "Flower", "Friut", "")

    val questions = arrayListOf(
        Quiz("Who is the greatest footballer to ever lived", arrayListOf("Messi", "Pele", "Maradonna"), "Kingsley"),
        Quiz("Which is better pizza or ice cream", arrayListOf("Messi", "Pele", "Maradonna"), "Pizza"),
        Quiz("Which prt of the plants holds it to the soil?", arrayListOf("Messi", "Pele", "Maradonna"), "Kingsley"),
        Quiz("The _____ holds the plants upright", arrayListOf("Messi", "Pele", "Maradonna"), "Kingsley"),
        Quiz("Which part of the plants absorbs energy from the sun", arrayListOf("Messi", "Pele", "Maradonna"), "Kingsley"),
        Quiz("Who is are you", arrayListOf("Messi", "Pele", "Maradonna"), "Kingsley"),
        Quiz("Who is are you", arrayListOf("Messi", "Pele", "Maradonna"), "Kingsley"),
        Quiz("Who is are you", arrayListOf("Messi", "Pele", "Maradonna"), "Kingsley"),
        Quiz("Who is are you", arrayListOf("Messi", "Pele", "Maradonna"), "Kingsley"),
        Quiz("Who is are you", arrayListOf("Messi", "Pele", "Maradonna"), "Kingsley")
    )

    fun getQuizQuestion(index: Int) : Quiz{
        return questions[index]
    }


}


data class Quiz(val question: String, val answers: MutableList<String>, var answer: String)








