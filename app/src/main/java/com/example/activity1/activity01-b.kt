package com.example.activity1

import android.os.Build
import androidx.annotation.RequiresApi

import java.time.LocalDate

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    println("Welcome to the library")
    print("Please enter your username: ")
    val name = readln()
    println("Greetings ${name.uppercase()}")
    val date = LocalDate.now()
    println("Here are the available books as of $date")
    println("Fantasy:")
    val book = listOf(
        "The Harry Potter Series by J.K Rowling (2009)\n" +
                "Lord Of The Rings by J.R.R. Tolkein (2014)\n" +
                "Game Of Thrones by George R.R. Martin  (2016)\n" +
                "The Dark Tower Series by Stephen King (2016)\n" +
                "The Name Of The Wind by Patrick Rothfuss (2009)\n" +
                "American Gods by Neil Gaiman  (2015)\n" +
                "Good Omens by Neil Gaiman and Terry Pratchett (2006)")
    val separator1 = ", "
    val result1 = book.joinToString(separator1)
    println(result1)
    println("Romance:")
    val books = listOf(
        "The Proposal by Jasmine Guillory (2018) \n" +
                "The Hating Game by Sally Thorne (2016) \n" +
                "Vision In White by Nora Roberts (2012) \n" +
                "The Kiss Quotient by Helen Hoang (2018) \n" +
                "I Kissed Shara Wheeler by Casey McQuiston"
    )
    val separator2 = ", "
    val result2 = books.joinToString(separator2)
    println(result2)
    println("Horror:")
    val books2 = listOf(
        "Salem's Lot by Stephen King (1975)\n" +
                "Those Across the River by Christopher Buehlman (2011)\n" +
                "The Exorcist by William Peter Blatty (1971)\n" +
                "The Ruins by Scott Smith (2006)\n" +
                "White Is for Witching by Helen Oyeyemi (2009)\n" +
                "The Haunting of Hill House by Shirley Jackson (1959)"
    )
    val separator3 = ", "
    val result3 = books2.joinToString(separator3)
    println(result3)
    println("History:")
    val books3 = listOf(
        "Guns,Germs,and Steel by Jared Diamond (1997)\n" +
                "Genghis Khan and the Making of the Modern World by Jack Weatherford (2004)\n" +
                "The Crusades: The Authoritative History of the War for the Holy Land by Thomas Asbridge (2010)\n" +
                "SPQR: A History of Ancient Rome by Mary Beaard (2015)"
    )
    val separator4 = ", "
    val result4 = books3.joinToString(separator4)
    println(result4)

    println("What book do you want to learn more about? ")
    print("Please enter the book's complete title: ")
    val stringValue: String = readln()

    when (stringValue.lowercase()) {
        "the harry potter series" -> {
            println(
                "J.K. Rowling's \"Harry Potter series\" consists of seven novels.\n" +
                        "Rowling, J.K. Harry Potter, an 11-year-old kid,\n" +
                        "realizes he is the son of famous wizards and will attend Hogwarts School of Witchcraft and Wizardry.\n" +
                        "Harry discovers a whole community of wizards and witches."
            )
        }
        "lord of the rings" -> {
            println(
                "\"The Lord of the Rings\" is the story of Sauron's efforts\n" +
                        "to get the One Ring of Power and thereby conquer Middle-earth.\n" +
                        "Frodo Baggins, a hobbit, holds the Ring after being warned by his buddy Gandalf.\n" +
                        "Frodo goes across Middle-earth with the support of friends from home and new companions he meets \n" +
                        "along the road to destroy the Ring in the fires of Mount Doom before Sauron discovers it (and him)."
            )
        }
        "game of thrones" -> {
            println(
                "\"Game of Thrones\" spans one year and takes place on or near the mythical continent of Westeros.\n" +
                        "The plot begins when King Robert travels to the northern stronghold Winterfell to appoint Ned Stark as his right-hand aide,\n" +
                        "or Hand of the King. Jon Arryn, the previous Hand, died in mysterious circumstances."
            )
        }
        "the dark tower series" -> {
            println(
                "\"The Dark Tower series\" follows Roland Deschain, Mid-lone World's gunslinger,\n" +
                        "as he travels southeast through the post-apocalyptic terrain in quest of The Dark Tower,\n" +
                        "a powerful but elusive magical building."
            )
        }
        "the name of the wind" -> {
            println(
                "\"The story of Kvothe\", from his upbringing in a traveling company \n" +
                        "to his years as a near-feral orphan in a crime-ridden city,\n" +
                        "to his audacious yet successful effort to attend a rigorous and hazardous school of magic."
            )
        }
        "american gods" -> {
            println(
                "\"American Gods\" examines American preoccupation and identity.\n" +
                        "Gaiman's American Gods has a fascinating premise: old gods,\n" +
                        "long forgotten in the United States, are losing power to new gods such as Technology and Media, and a war is building between the two groups."
            )
        }
        "Good omens" -> {
            println(
                "The novel is a comedy about the birth of Satan's offspring and the arrival of the End Times.\n" +
                        "The angel Aziraphale and the demon Crowley strive to impede the arrival of the end times, \n" +
                        "having grown used to their cushy surroundings in England."
            )
        }
        "the proposal" -> {
            println(
                "\"The Proposal\" follows Nik, a freelance journalist, who meets Carlos, an attractive doctor,\n" +
                        "after she rejects her boyfriend's surprise proposal at a Dodgers game.\n" +
                        "Carlos saves Nik from a nosy camera team, and the two become friends."
            )
        }
        "the hating game" -> {
            println(
                "The plot of \"Sally Thorne's\" The Hating Game centres around Lucy Hutton and Joshua Templeman,\n" +
                        "two executive assistants brought together when rival publishing businesses merge,\n" +
                        "resulting in their respective bosses becoming co-CEOs. They spend their days antagonizing and verbally battling with one another."
            )
        }
        "vision in white" -> {
            println(
                "Mackensie Mac Elliot, a wedding photographer, is most at ease behind the lens,\n" +
                        "but her concentration is disrupted minutes before an essential wedding rehearsal\n" +
                        "when she runs into the bride-to-brother...an be's encounter that has them both seeing stars."
            )
        }
        "the kiss quotient" -> {
            println(
                "Stella Lane believes that arithmetic is the only thing that connects the cosmos.\n" +
                        "he creates algorithms to forecast client purchases,\n" +
                        "which has given her more money than she knows what to do with and far less dating experience than the typical thirty-year-old."
            )
        }
        "i kissed shara wheeler" -> {
            println(
                "\"I Kissed Shara Wheeler\" follows Chloe Green,\n" +
                        "who goes to Alabama and is one of the only openly gay students in her very Catholic high school.\n" +
                        "She makes it her only ambition to be valedictorian, with Shara Wheeler, the most popular girl at school, as her only genuine rival."
            )
        }
        "salem's lot" -> {
            println(
                "\"Salem's Lot\" tells the story of a tiny American town overrun by vampires and a heroic band of people\n" +
                        "banding together to combat an ancient evil. The plot revolves around Ben Mears,\n" +
                        "a fairly successful writer who has returned to Jerusalem's Lot to write a novel about his childhood."
            )
        }
        "those across the river" -> {
            println(
                "Failed scholar Frank Nichols and his wife have landed in the tranquil Georgia town of Whitbrow,\n" +
                        "where Frank wants to write a history of his family's old home, the Savoyard Plantation, and the atrocities that transpired there."
            )
        }
        "the exorcist" -> {
            println(
                "William Peter Blatty's horror thriller \"The Exorcist\" was published in 1971.\n" +
                        "The novel tells the story of Regan MacNeil, an eleven-year-old girl who is the daughter\n" +
                        "of a famous actress, and the two priests who try to exorcise the demon."
            )
        }
        "the ruins" -> {
            println(
                "It establishes a suspense that Serling excelled at,\n" +
                        "built by knowing that a situation is spinning out of control in ways beyond the protagonists' grasp,\n" +
                        "as it tells the narrative of four young Americans caught in a hazardous predicament on a vacation to Mayan ruins in Mexico."
            )
        }
        "white is for withcing" -> {
            println(
                "\"White Is for Witching\" is a ghost, vampire, and haunted house story\n" +
                        "that follows a twin called Miranda and her connection with the sentient,\n" +
                        "xenophobic mansion she lives in. In 2011, a French adaptation, Le Blanc va aux sorcières, was released."
            )
        }
        "the haunting of hill house" -> {
            println(
                "Dr. Montague says it's past time for science to establish the presence of the supernatural,\n" +
                        "and Hill House, a haunted estate, is the perfect venue to do it. His experiment will only include serious science and irrefutable proof."
            )
        }
        "guns,germs and steel" -> {
            println(
                "\"Guns, Germs, and Steel\" is a multidisciplinary study that employs anthropological, biological,\n" +
                        "evolutionary, and socio-economic analyses to chart the fates of different peoples throughout human history\n" +
                        "and understand why some groups succeeded to develop and advance, while others haven't."
            )
        }
        "genghis khan and the making of the modern world" -> {
            println(
                "Jack Weatherford, Dewitt Wallace Professor of Anthropology at Macalester College, wrote the history book \n" +
                        "\"Genghis Khan and the Making of the Modern World\". It tells the story of Genghis Khan and his descendants, as well as their impact on European civilisation."
            )
        }
        "the crusaders: the authoritative history of the war for the holy land" -> {
            println(
                "It uncovers the entire horror, passion, and savage splendor of the Crusading era,\n" +
                        "explaining how these holy conflicts transformed the medieval world and why they continue to affect events now."
            )
        }
        "spqr: a history of ancient rome" -> {
            println(
                "\"SPQR\" covers the history of ancient Rome from its founding by Romulus to the reign of Emperor Caracalla,\n" +
                        "who, in the year 202 A.D. granted Roman citizenship to the entire free male population of the empire. This is a very ambitious work and is well worth reading."
            )
        }
        else -> {
            println("ERROR!!, Please follow the instructions")
            println("What book do you want to learn more about? ")
            print("Please enter the book's complete title: ")
            val stringValue2: String = readln()
            when (stringValue2.lowercase()) {
                "the harry potter series" -> {
                    println(
                        "J.K. Rowling's \"Harry Potter series\" consists of seven novels.\n" +
                                "Rowling, J.K. Harry Potter, an 11-year-old kid,\n" +
                                "realizes he is the son of famous wizards and will attend Hogwarts School of Witchcraft and Wizardry.\n" +
                                "Harry discovers a whole community of wizards and witches."
                    )
                }
                "lord of the rings" -> {
                    println(
                        "T\"he Lord of the Rings\" is the story of Sauron's efforts\n" +
                                "to get the One Ring of Power and thereby conquer Middle-earth.\n" +
                                "Frodo Baggins, a hobbit, holds the Ring after being warned by his buddy Gandalf.\n" +
                                "Frodo goes across Middle-earth with the support of friends from home and new companions he meets \n" +
                                "along the road to destroy the Ring in the fires of Mount Doom before Sauron discovers it (and him)."
                    )
                }
                "game of thrones" -> {
                    println(
                        "\"Game of Thrones\" spans one year and takes place on or near the mythical continent of Westeros.\n" +
                                "The plot begins when King Robert travels to the northern stronghold Winterfell to appoint Ned Stark as his right-hand aide,\n" +
                                "or Hand of the King. Jon Arryn, the previous Hand, died in mysterious circumstances."
                    )
                }
                "the dark tower series" -> {
                    println(
                        "\"The Dark Tower series\" follows Roland Deschain, Mid-lone World's gunslinger,\n" +
                                "as he travels southeast through the post-apocalyptic terrain in quest of The Dark Tower,\n" +
                                "a powerful but elusive magical building."
                    )
                }
                "the name of the wind" -> {
                    println(
                        "\"The story of Kvothe\", from his upbringing in a traveling company \n" +
                                "to his years as a near-feral orphan in a crime-ridden city,\n" +
                                "to his audacious yet successful effort to attend a rigorous and hazardous school of magic."
                    )
                }
                "american gods" -> {
                    println(
                        "\"American Gods\" examines American preoccupation and identity.\n" +
                                "Gaiman's American Gods has a fascinating premise: old gods,\n" +
                                "long forgotten in the United States, are losing power to new gods such as Technology and Media, and a war is building between the two groups."
                    )
                }
                "Good omens" -> {
                    println(
                        "The novel is a comedy about the birth of Satan's offspring and the arrival of the End Times.\n" +
                                "The angel Aziraphale and the demon Crowley strive to impede the arrival of the end times, \n" +
                                "having grown used to their cushy surroundings in England."
                    )
                }
                "the proposal" -> {
                    println(
                        "\"The Proposal\" follows Nik, a freelance journalist, who meets Carlos, an attractive doctor,\n" +
                                "after she rejects her boyfriend's surprise proposal at a Dodgers game.\n" +
                                "Carlos saves Nik from a nosy camera team, and the two become friends."
                    )
                }
                "the hating game" -> {
                    println(
                        "The plot of \"Sally Thorne's\" The Hating Game centres around Lucy Hutton and Joshua Templeman,\n" +
                                "two executive assistants brought together when rival publishing businesses merge,\n" +
                                "resulting in their respective bosses becoming co-CEOs. They spend their days antagonizing and verbally battling with one another."
                    )
                }
                "vision in white" -> {
                    println(
                        "Mackensie Mac Elliot, a wedding photographer, is most at ease behind the lens,\n" +
                                "but her concentration is disrupted minutes before an essential wedding rehearsal\n" +
                                "when she runs into the bride-to-brother...an be's encounter that has them both seeing stars."
                    )
                }
                "the kiss quotient" -> {
                    println(
                        "Stella Lane believes that arithmetic is the only thing that connects the cosmos.\n" +
                                "he creates algorithms to forecast client purchases,\n" +
                                "which has given her more money than she knows what to do with and far less dating experience than the typical thirty-year-old."
                    )
                }
                "i kissed shara wheeler" -> {
                    println(
                        "\"I Kissed Shara Wheeler\" follows Chloe Green,\n" +
                                "who goes to Alabama and is one of the only openly gay students in her very Catholic high school.\n" +
                                "She makes it her only ambition to be valedictorian, with Shara Wheeler, the most popular girl at school, as her only genuine rival."
                    )
                }
                "salem's lot" -> {
                    println(
                        "\"Salem's Lot\" tells the story of a tiny American town overrun by vampires and a heroic band of people\n" +
                                "banding together to combat an ancient evil. The plot revolves around Ben Mears,\n" +
                                "a fairly successful writer who has returned to Jerusalem's Lot to write a novel about his childhood."
                    )
                }
                "those across the river" -> {
                    println(
                        "Failed scholar Frank Nichols and his wife have landed in the tranquil Georgia town of Whitbrow,\n" +
                                "where Frank wants to write a history of his family's old home, the Savoyard Plantation, and the atrocities that transpired there."
                    )
                }
                "the exorcist" -> {
                    println(
                        "William Peter Blatty's horror thriller \"The Exorcist\" was published in 1971.\n" +
                                "The novel tells the story of Regan MacNeil, an eleven-year-old girl who is the daughter\n" +
                                "of a famous actress, and the two priests who try to exorcise the demon."
                    )
                }
                "the ruins" -> {
                    println(
                        "It establishes a suspense that Serling excelled at,\n" +
                                "built by knowing that a situation is spinning out of control in ways beyond the protagonists' grasp,\n" +
                                "as it tells the narrative of four young Americans caught in a hazardous predicament on a vacation to Mayan ruins in Mexico."
                    )
                }
                "white is for withcing" -> {
                    println(
                        "\"White Is for Witching\" is a ghost, vampire, and haunted house story\n" +
                                "that follows a twin called Miranda and her connection with the sentient,\n" +
                                "xenophobic mansion she lives in. In 2011, a French adaptation, Le Blanc va aux sorcières, was released."
                    )
                }
                "the haunting of hill house" -> {
                    println(
                        "Dr. Montague says it's past time for science to establish the presence of the supernatural,\n" +
                                "and Hill House, a haunted estate, is the perfect venue to do it. His experiment will only include serious science and irrefutable proof."
                    )
                }
                "guns,germs and steel" -> {
                    println(
                        "\"Guns, Germs, and Steel\" is a multidisciplinary study that employs anthropological, biological,\n" +
                                "evolutionary, and socio-economic analyses to chart the fates of different peoples throughout human history\n" +
                                "and understand why some groups succeeded to develop and advance, while others haven't."
                    )
                }
                "genghis khan and the making of the modern world" -> {
                    println(
                        "Jack Weatherford, Dewitt Wallace Professor of Anthropology at Macalester College, wrote the history book \n" +
                                "\"Genghis Khan and the Making of the Modern World\". It tells the story of Genghis Khan and his descendants, as well as their impact on European civilisation."
                    )
                }
                "the crusaders: the authoritative history of the war for the holy land" -> {
                    println(
                        "It uncovers the entire horror, passion, and savage splendor of the Crusading era,\n" +
                                "explaining how these holy conflicts transformed the medieval world and why they continue to affect events now."
                    )
                }
                "spqr: a history of ancient rome" -> {
                    println(
                        "\"SPQR\" covers the history of ancient Rome from its founding by Romulus to the reign of Emperor Caracalla,\n" +
                                "who, in the year 202 A.D. granted Roman citizenship to the entire free male population of the empire. This is a very ambitious work and is well worth reading."
                    )
                }
            }


        }
    }
}