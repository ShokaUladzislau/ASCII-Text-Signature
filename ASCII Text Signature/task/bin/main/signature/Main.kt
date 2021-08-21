package signature

fun main() {

    val nameOfPerson = readLine()!!
    var nameOne: String = ""
    var nameTwo: String = ""
    var nameThree: String = ""
    var nameFour: String = ""
    var nameFive: String = ""
    var nameSix: String = ""
    var nameSeven: String = ""
    var nameEight: String = ""
    var nameNine: String = ""
    var nameTen: String = ""

    for (letter in nameOfPerson) {
        val newLetter =

            when (letter) {
                'a' -> (arrayOf(
                    "         ",
                    "         ",
                    " .oooo.  ",
                    "`P  )88b ",
                    " .oP\"888 ",
                    "d8(  888 ",
                    "`Y888\"\"8o",
                    "         ",
                    "         ",
                    "         "
                ))
                'b' -> (arrayOf(
                    " .o8      ",
                    "\"888      ",
                    " 888oooo. ",
                    " d88' `88b",
                    " 888   888",
                    " 888   888",
                    " `Y8bod8P'",
                    "          ",
                    "          ",
                    "          "
                ))
                'c' -> (arrayOf(
                    "         ",
                    "         ",
                    " .ooooo. ",
                    "d88' `\"Y8",
                    "888      ",
                    "888   .o8",
                    "`Y8bod8P'",
                    "         ",
                    "         ",
                    "         "
                ))
                'd' -> (arrayOf(
                    "      .o8 ",
                    "     \"888 ",
                    " .oooo888 ",
                    "d88' `888 ",
                    "888   888 ",
                    "888   888 ",
                    "`Y8bod88P\"",
                    "          ",
                    "          ",
                    "          "
                ))
                'e' -> (arrayOf(
                    "         ",
                    "         ",
                    " .ooooo. ",
                    "d88' `88b",
                    "888ooo888",
                    "888    .o",
                    "`Y8bod8P'",
                    "         ",
                    "         ",
                    "         "
                ))
                'f' -> (arrayOf(
                    " .o88o.",
                    " 888 `\"",
                    "o888oo ",
                    " 888   ",
                    " 888   ",
                    " 888   ",
                    "o888o  ",
                    "       ",
                    "       ",
                    "       "
                ))
                'g' -> (arrayOf(
                    "          ",
                    "          ",
                    " .oooooooo",
                    "888' `88b ",
                    "888   888 ",
                    "`88bod8P' ",
                    "`8oooooo. ",
                    "d\"     YD ",
                    "\"Y88888P' ",
                    "          "
                ))
                'h' -> (arrayOf(
                    "oooo       ",
                    "`888       ",
                    " 888 .oo.  ",
                    " 888P\"Y88b ",
                    " 888   888 ",
                    " 888   888 ",
                    "o888o o888o",
                    "           ",
                    "           ",
                    "           "
                ))
                'i' -> (arrayOf(
                    " o8o ",
                    " `\"' ",
                    "oooo ",
                    "`888 ",
                    " 888 ",
                    " 888 ",
                    "o888o",
                    "     ",
                    "     ",
                    "     "
                ))
                'j' -> (arrayOf(
                    "    o8o",
                    "    `\"'",
                    "   oooo",
                    "   `888",
                    "    888",
                    "    888",
                    "    888",
                    "    888",
                    ".o. 88P",
                    "`Y888P "
                ))
                'k' -> (arrayOf(
                    "oooo       ",
                    "`888       ",
                    " 888  oooo ",
                    " 888 .8P'  ",
                    " 888888.   ",
                    " 888 `88b. ",
                    "o888o o888o",
                    "           ",
                    "           ",
                    "           "
                ))
                'l' -> (arrayOf(
                    "oooo ",
                    "`888 ",
                    " 888 ",
                    " 888 ",
                    " 888 ",
                    " 888 ",
                    "o888o",
                    "     ",
                    "     ",
                    "     "
                ))
                'm' -> (arrayOf(
                    "                 ",
                    "                 ",
                    "ooo. .oo.  .oo.  ",
                    "`888P\"Y88bP\"Y88b ",
                    " 888   888   888 ",
                    " 888   888   888 ",
                    "o888o o888o o888o",
                    "                 ",
                    "                 ",
                    "                 "
                ))
                'n' -> (arrayOf(
                    "           ",
                    "           ",
                    "ooo. .oo.  ",
                    "`888P\"Y88b ",
                    " 888   888 ",
                    " 888   888 ",
                    "o888o o888o",
                    "           ",
                    "           ",
                    "           "
                ))
                'o' -> (arrayOf(
                    "         ",
                    "         ",
                    " .ooooo. ",
                    "d88' `88b",
                    "888   888",
                    "888   888",
                    "`Y8bod8P'",
                    "         ",
                    "         ",
                    "         "
                ))
                'p' -> (arrayOf(
                    "          ",
                    "          ",
                    "oo.ooooo. ",
                    " 888' `88b",
                    " 888   888",
                    " 888   888",
                    " 888bod8P'",
                    " 888      ",
                    "o888o     ",
                    "          "
                ))
                'q' -> (arrayOf(
                    "          ",
                    "          ",
                    " .ooooo oo",
                    "d88' `888 ",
                    "888   888 ",
                    "888   888 ",
                    "`V8bod888 ",
                    "      888.",
                    "      8P' ",
                    "      \"   "
                ))
                'r' -> (arrayOf(
                    "        ",
                    "        ",
                    "oooo d8b",
                    "`888\"\"8P",
                    " 888    ",
                    " 888    ",
                    "d888b   ",
                    "        ",
                    "        ",
                    "        "
                ))
                's' -> (arrayOf(
                    "        ",
                    "        ",
                    " .oooo.o",
                    "d88(  \"8",
                    "`\"Y88b. ",
                    "o.  )88b",
                    "8\"\"888P'",
                    "        ",
                    "        ",
                    "        "
                ))
                't' -> (arrayOf(
                    "    .  ",
                    "  .o8  ",
                    ".o888oo",
                    "  888  ",
                    "  888  ",
                    "  888 .",
                    "  \"888\"",
                    "       ",
                    "       ",
                    "       "
                ))
                'u' -> (arrayOf(
                    "           ",
                    "           ",
                    "oooo  oooo ",
                    "`888  `888 ",
                    " 888   888 ",
                    " 888   888 ",
                    " `V88V\"V8P'",
                    "           ",
                    "           ",
                    "           "
                ))
                'v' -> (arrayOf(
                    "           ",
                    "           ",
                    "oooo    ooo",
                    " `88.  .8' ",
                    "  `88..8'  ",
                    "   `888'   ",
                    "    `8'    ",
                    "           ",
                    "           ",
                    "           "
                ))
                'w' -> (arrayOf(
                    "                ",
                    "                ",
                    "oooo oooo    ooo",
                    " `88. `88.  .8' ",
                    "  `88..]88..8'  ",
                    "   `888'`888'   ",
                    "    `8'  `8'    ",
                    "                ",
                    "                ",
                    "                "
                ))
                'x' -> (arrayOf(
                    "           ",
                    "           ",
                    "oooo    ooo",
                    " `88b..8P' ",
                    "   Y888'   ",
                    " .o8\"'88b  ",
                    "o88'   888o",
                    "           ",
                    "           ",
                    "           "
                ))
                'y' -> (arrayOf(
                    "           ",
                    "           ",
                    "oooo    ooo",
                    " `88.  .8' ",
                    "  `88..8'  ",
                    "   `888'   ",
                    "    .8'    ",
                    ".o..P'     ",
                    "`Y8P'      ",
                    "           "
                ))
                'z' -> (arrayOf(
                    "          ",
                    "          ",
                    "  oooooooo",
                    " d'\"\"7d8P ",
                    "   .d8P'  ",
                    " .d8P'  .P",
                    "d8888888P ",
                    "          ",
                    "          ",
                    "          "
                ))

                'A' -> (arrayOf(
                    "      .o.      ",
                    "     .888.     ",
                    "    .8\"888.    ",
                    "   .8' `888.   ",
                    "  .88ooo8888.  ",
                    " .8'     `888. ",
                    "o88o     o8888o",
                    "               ",
                    "               ",
                    "               "
                ))
                'B' -> (arrayOf(
                    "oooooooooo. ",
                    "`888'   `Y8b",
                    " 888     888",
                    " 888oooo888'",
                    " 888    `88b",
                    " 888    .88P",
                    "o888bood8P' ",
                    "            ",
                    "            ",
                    "            "
                ))
                'C' -> (arrayOf(
                    "  .oooooo.  ",
                    " d8P'  `Y8b ",
                    "888         ",
                    "888         ",
                    "888         ",
                    "`88b    ooo ",
                    " `Y8bood8P' ",
                    "            ",
                    "            ",
                    "            "
                ))
                'D' -> (arrayOf(
                    "oooooooooo.  ",
                    "`888'   `Y8b ",
                    " 888      888",
                    " 888      888",
                    " 888      888",
                    " 888     d88'",
                    "o888bood8P'  ",
                    "             ",
                    "             ",
                    "             "
                ))
                'E' -> (arrayOf(
                    "oooooooooooo",
                    "`888'     `8",
                    " 888        ",
                    " 888oooo8   ",
                    " 888    \"   ",
                    " 888       o",
                    "o888ooooood8",
                    "            ",
                    "            ",
                    "            "
                ))
                'F' -> (arrayOf(
                    "oooooooooooo",
                    "`888'     `8",
                    " 888        ",
                    " 888oooo8   ",
                    " 888    \"   ",
                    " 888        ",
                    "o888o       ",
                    "            ",
                    "            ",
                    "            "
                ))
                'G' -> (arrayOf(
                    "  .oooooo.   ",
                    " d8P'  `Y8b  ",
                    "888          ",
                    "888          ",
                    "888     ooooo",
                    "`88.    .88' ",
                    " `Y8bood8P'  ",
                    "             ",
                    "             ",
                    "             "
                ))
                'H' -> (arrayOf(
                    "ooooo   ooooo",
                    "`888'   `888'",
                    " 888     888 ",
                    " 888ooooo888 ",
                    " 888     888 ",
                    " 888     888 ",
                    "o888o   o888o",
                    "             ",
                    "             ",
                    "             "
                ))
                'I' -> (arrayOf(
                    "ooooo",
                    "`888'",
                    " 888 ",
                    " 888 ",
                    " 888 ",
                    " 888 ",
                    "o888o",
                    "     ",
                    "     ",
                    "     "
                ))
                'J' -> (arrayOf(
                    "   oooo",
                    "   `888",
                    "    888",
                    "    888",
                    "    888",
                    "    888",
                    ".o. 88P",
                    "`Y888P ",
                    "       ",
                    "       "
                ))
                'K' -> (arrayOf(
                    "oooo    oooo",
                    "`888   .8P' ",
                    " 888  d8'   ",
                    " 88888[     ",
                    " 888`88b.   ",
                    " 888  `88b. ",
                    "o888o  o888o",
                    "            ",
                    "            ",
                    "            "
                ))
                'L' -> (arrayOf(
                    "ooooo       ",
                    "`888'       ",
                    " 888        ",
                    " 888        ",
                    " 888        ",
                    " 888       o",
                    "o888ooooood8",
                    "            ",
                    "            ",
                    "            "
                ))
                'M' -> (arrayOf(
                    "ooo        ooooo",
                    "`88.       .888'",
                    " 888b     d'888 ",
                    " 8 Y88. .P  888 ",
                    " 8  `888'   888 ",
                    " 8    Y     888 ",
                    "o8o        o888o",
                    "                ",
                    "                ",
                    "                "
                ))
                'N' -> (arrayOf(
                    "ooooo      ooo",
                    "`888b.     `8'",
                    " 8 `88b.    8 ",
                    " 8   `88b.  8 ",
                    " 8     `88b.8 ",
                    " 8       `888 ",
                    "o8o        `8 ",
                    "              ",
                    "              ",
                    "              "
                ))
                'O' -> (arrayOf(
                    "  .oooooo.  ",
                    " d8P'  `Y8b ",
                    "888      888",
                    "888      888",
                    "888      888",
                    "`88b    d88'",
                    " `Y8bood8P' ",
                    "            ",
                    "            ",
                    "            "
                ))
                'P' -> (arrayOf(
                    "ooooooooo.  ",
                    "`888   `Y88.",
                    " 888   .d88'",
                    " 888ooo88P' ",
                    " 888        ",
                    " 888        ",
                    "o888o       ",
                    "            ",
                    "            ",
                    "            "
                ))
                'Q' -> (arrayOf(
                    "  .oooooo.     ",
                    " d8P'  `Y8b    ",
                    "888      888   ",
                    "888      888   ",
                    "888      888   ",
                    "`88b    d88b   ",
                    " `Y8bood8P'Ybd'",
                    "               ",
                    "               ",
                    "               "
                ))
                'R' -> (arrayOf(
                    "ooooooooo.  ",
                    "`888   `Y88.",
                    " 888   .d88'",
                    " 888ooo88P' ",
                    " 888`88b.   ",
                    " 888  `88b. ",
                    "o888o  o888o",
                    "            ",
                    "            ",
                    "            "
                ))
                'S' -> (arrayOf(
                    " .oooooo..o",
                    "d8P'    `Y8",
                    "Y88bo.     ",
                    " `\"Y8888o. ",
                    "     `\"Y88b",
                    "oo     .d8P",
                    "8\"\"88888P' ",
                    "           ",
                    "           ",
                    "           "
                ))
                'T' -> (arrayOf(
                    "ooooooooooooo",
                    "8'   888   `8",
                    "     888     ",
                    "     888     ",
                    "     888     ",
                    "     888     ",
                    "    o888o    ",
                    "             ",
                    "             ",
                    "             "
                ))
                'U' -> (arrayOf(
                    "ooooo     ooo",
                    "`888'     `8'",
                    " 888       8 ",
                    " 888       8 ",
                    " 888       8 ",
                    " `88.    .8' ",
                    "   `YbodP'   ",
                    "             ",
                    "             ",
                    "             "
                ))
                'V' -> (arrayOf(
                    "oooooo     oooo",
                    " `888.     .8' ",
                    "  `888.   .8'  ",
                    "   `888. .8'   ",
                    "    `888.8'    ",
                    "     `888'     ",
                    "      `8'      ",
                    "               ",
                    "               ",
                    "               "
                ))
                'W' -> (arrayOf(
                    "oooooo   oooooo     oooo",
                    " `888.    `888.     .8' ",
                    "  `888.   .8888.   .8'  ",
                    "   `888  .8'`888. .8'   ",
                    "    `888.8'  `888.8'    ",
                    "     `888'    `888'     ",
                    "      `8'      `8'      ",
                    "                        ",
                    "                        ",
                    "                        "
                ))
                'X' -> (arrayOf(
                    "ooooooo  ooooo",
                    " `8888    d8' ",
                    "   Y888..8P   ",
                    "    `8888'    ",
                    "   .8PY888.   ",
                    "  d8'  `888b  ",
                    "o888o  o88888o",
                    "              ",
                    "              ",
                    "              "
                ))
                'Y' -> (arrayOf(
                    "oooooo   oooo",
                    " `888.   .8' ",
                    "  `888. .8'  ",
                    "   `888.8'   ",
                    "    `888'    ",
                    "     888     ",
                    "    o888o    ",
                    "             ",
                    "             ",
                    "             "
                ))
                'Z' -> (arrayOf(
                    " oooooooooooo",
                    "d'\"\"\"\"\"\"d888'",
                    "      .888P  ",
                    "     d888'   ",
                    "   .888P     ",
                    "  d888'    .P",
                    ".8888888888P ",
                    "             ",
                    "             ",
                    "             "
                ))

                ' ' -> (arrayOf("         ", "         ", "         ", "         ", "         ", "         ", "         ", "         ", "         ", "         "))
                else -> arrayOf("", "", "")
            }

        for (i in newLetter.indices) {
            if (i == 0) {
                nameOne += newLetter[i] + " "
            } else if (i == 1) {
                nameTwo += newLetter[i] + " "
            } else if (i == 2) {
                nameThree += newLetter[i] + " "
            } else if (i == 3) {
                nameFour += newLetter[i] + " "
            } else if (i == 4) {
                nameFive += newLetter[i] + " "
            } else if (i == 5) {
                nameSix += newLetter[i] + " "
            } else if (i == 6) {
                nameSeven += newLetter[i] + " "
            } else if (i == 7) {
                nameEight += newLetter[i] + " "
            } else if (i == 8) {
                nameNine += newLetter[i] + " "
            } else {
                nameTen += newLetter[i] + " "
            }
        }
    }


    val statusOfPerson = readLine()!!.toLowerCase()
    var statusOne: String = ""
    var statusTwo: String = ""
    var statusThree: String = ""

    for (letter in statusOfPerson) {
        val newLetter =

            when (letter) {
                'a' -> (arrayOf("____", "|__|", "|  |"))
                'b' -> (arrayOf("___ ", "|__]", "|__]"))
                'c' -> (arrayOf("____", "|   ", "|___"))
                'd' -> (arrayOf("___ ", "|  \\", "|__/"))
                'e' -> (arrayOf("____", "|___", "|___"))
                'f' -> (arrayOf("____", "|___", "|   "))
                'g' -> (arrayOf("____", "| __", "|__]"))
                'h' -> (arrayOf("_  _", "|__|", "|  |"))
                'i' -> (arrayOf("_", "|", "|"))
                'j' -> (arrayOf(" _", " |", "_|"))
                'k' -> (arrayOf("_  _", "|_/ ", "| \\_"))
                'l' -> (arrayOf("_   ", "|   ", "|___"))
                'm' -> (arrayOf("_  _", "|\\/|", "|  |"))
                'n' -> (arrayOf("_  _", "|\\ |", "| \\|"))
                'o' -> (arrayOf("____", "|  |", "|__|"))
                'p' -> (arrayOf("___ ", "|__]", "|   "))
                'q' -> (arrayOf("____", "|  |", "|_\\|"))
                'r' -> (arrayOf("____", "|__/", "|  \\"))
                's' -> (arrayOf("____", "[__ ", "___]"))
                't' -> (arrayOf("___", " | ", " | "))
                'u' -> (arrayOf("_  _", "|  |", "|__|"))
                'v' -> (arrayOf("_  _", "|  |", " \\/ "))
                'w' -> (arrayOf("_ _ _", "| | |", "|_|_|"))
                'x' -> (arrayOf("_  _", " \\/ ", "_/\\_"))
                'y' -> (arrayOf("_   _", " \\_/ ", "  |  "))
                'z' -> (arrayOf("___ ", "  / ", " /__"))
                ' ' -> (arrayOf("    ", "    ", "    "))
                else -> arrayOf("", "", "")
            }

        for (i in newLetter.indices) {
            if (i == 0) {
                statusOne += newLetter[i] + " "
            } else if (i == 1) {
                statusTwo += newLetter[i] + " "
            } else {
                statusThree += newLetter[i] + " "
            }
        }
    }

    val n = nameOne.length
    val m = statusOne.length

    if (n > m) {

        val pStatus = (n - m) / 2


        println("8".repeat(n + 8))

        println("88  " + nameOne + "  88")
        println("88  " + nameTwo  + "  88")
        println("88  " + nameThree + "  88")
        println("88  " + nameFour + "  88")
        println("88  " + nameFive + "  88")
        println("88  " + nameSix + "  88")
        println("88  " + nameSeven + "  88")
        println("88  " + nameEight + "  88")
        println("88  " + nameNine +  "  88")
        println("88  " + nameTen +  "  88")


        if ((m % 2 == 0 && n % 2 == 0) || (m % 2 != 0 && n % 2 != 0)) {

            println("88 " + " ".repeat(pStatus) + statusOne + " ".repeat(n - pStatus - m) + "  88")
            println("88 " + " ".repeat(pStatus) + statusTwo + " ".repeat(n - pStatus - m) + "  88")
            println("88 " + " ".repeat(pStatus) + statusThree + " ".repeat(n - pStatus - m) + "  88")

        } else {

            println("88  " + " ".repeat(pStatus) + statusOne + " ".repeat(pStatus + 1) + "  88")
            println("88  " + " ".repeat(pStatus) + statusTwo + " ".repeat(pStatus + 1) + "  88")
            println("88  " + " ".repeat(pStatus) + statusThree + " ".repeat(pStatus + 1) + "  88")

        }
        println("8".repeat(n + 8))
    } else {

        val pStatus = (m - n) / 2

        println("8".repeat(m + 8))
        if (m % 2 == 0) {

            println("88  " + " ".repeat(pStatus) + nameOne + " ".repeat(m - n - pStatus) + "  88")
            println("88  " + " ".repeat(pStatus) + nameTwo + " ".repeat(m - n - pStatus) + "  88")
            println("88  " + " ".repeat(pStatus) + nameThree + " ".repeat(m - n - pStatus) + "  88")
            println("88  " + " ".repeat(pStatus) + nameFour + " ".repeat(m - n - pStatus) + "  88")
            println("88  " + " ".repeat(pStatus) + nameFive + " ".repeat(m - n - pStatus) + "  88")
            println("88  " + " ".repeat(pStatus) + nameSix + " ".repeat(m - n - pStatus) + "  88")
            println("88  " + " ".repeat(pStatus) + nameSeven + " ".repeat(m - n - pStatus) + "  88")
            println("88  " + " ".repeat(pStatus) + nameEight + " ".repeat(m - n - pStatus) + "  88")
            println("88  " + " ".repeat(pStatus) + nameNine + " ".repeat(m - n - pStatus) + "  88")
            println("88  " + " ".repeat(pStatus) + nameTen + " ".repeat(m - n - pStatus) + "  88")

        } else {

            println("88  " + " ".repeat(pStatus + 1) + nameOne + " ".repeat(m - n - pStatus - 1) + "  88")
            println("88  " + " ".repeat(pStatus + 1) + nameTwo + " ".repeat(m - n - pStatus - 1) + "  88")
            println("88  " + " ".repeat(pStatus + 1) + nameThree + " ".repeat(m - n - pStatus - 1) + "  88")
            println("88  " + " ".repeat(pStatus + 1) + nameFour + " ".repeat(m - n - pStatus - 1) + "  88")
            println("88  " + " ".repeat(pStatus + 1) + nameFive + " ".repeat(m - n - pStatus - 1) + "  88")
            println("88  " + " ".repeat(pStatus + 1) + nameSix + " ".repeat(m - n - pStatus - 1) + "  88")
            println("88  " + " ".repeat(pStatus + 1) + nameSeven + " ".repeat(m - n - pStatus - 1) + "  88")
            println("88  " + " ".repeat(pStatus + 1) + nameEight + " ".repeat(m - n - pStatus - 1) + "  88")
            println("88  " + " ".repeat(pStatus + 1) + nameNine + " ".repeat(m - n - pStatus - 1) + "  88")
            println("88  " + " ".repeat(pStatus + 1) + nameTen + " ".repeat(m - n - pStatus - 1) + "  88")

        }
        println("88  " + statusOne + "  88")
        println("88  " + statusTwo + "  88")
        println("88  " + statusThree + "  88")
        println("8".repeat(m + 8))
    }
}

