package br.osvaldoneves.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answer"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "A que país esta bandeira pertence?",
            R.drawable.ic_flag_of_argentina,
            "Uruguai",
            "Argentina",
            "França",
            "Peru",
            2
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "A que país esta bandeira pertence?",
            R.drawable.ic_flag_of_australia,
            "Reino Unido",
            "Australia",
            "Mexico",
            "Nova Zelândia",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "A que país esta bandeira pertence?",
            R.drawable.ic_flag_of_belgium,
            "Alemanha",
            "Bielorússia",
            "Austria",
            "Bélgica",
            4
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "A que país esta bandeira pertence?",
            R.drawable.ic_flag_of_brazil,
            "Estados Unidos",
            "Australia",
            "Brasil",
            "México",
            3
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "A que país esta bandeira pertence?",
            R.drawable.ic_flag_of_denmark,
            "Inglaterra",
            "Dinamarca",
            "Armenia",
            "Holanda",
            2
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "A que país esta bandeira pertence?",
            R.drawable.ic_flag_of_fiji,
            "Indonesia",
            "Fiji",
            "Africa do Sul",
            "Camboja",
            2
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "A que país esta bandeira pertence?",
            R.drawable.ic_flag_of_germany,
            "Alemanha",
            "Chile",
            "Inglaterra",
            "Croacia",
            1
        )

        questionsList.add(que7)


        val que8 = Question(
            8,
            "A que país esta bandeira pertence?",
            R.drawable.ic_flag_of_india,
            "Espanha",
            "Russia",
            "Italia",
            "India",
            4
        )

        questionsList.add(que8)

        val que9 = Question(
            9,
            "A que país esta bandeira pertence?",
            R.drawable.ic_flag_of_kuwait,
            "Republica do Congo",
            "Republica Tcheca",
            "Irã",
            "Kuwait",
            4
        )

        questionsList.add(que9)

        val que10 = Question(
            10,
            "A que país esta bandeira pertence?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia",
            "Holanda",
            "Nova Zelandia",
            "Suecia",
            3
        )

        questionsList.add(que10)
        
        return questionsList
    }
}