import java.lang.Math.*


fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoise = getGameChoise(options)
    val userChoice = getUserChoice(options)
}

fun getGameChoise(options: Array<String>) {
    return optionsParam[(Math.random() * optionsParam.size).toInt()]
}

fun getUserChoice(options: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        //Запросить у пользователя его выбор
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        //Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}
