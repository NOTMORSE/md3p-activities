package com.example.activity1

import java.util.*

val book1 = Book(
    "The Hitchhiker's Guide to the Galaxy",
    listOf(Author("Douglas", "Adams", "Anciano", "11 March 1952")),
    1979,
    1,
    "978-0345391803",
    Publisher("Del Rey Books", "New York", "1977"),
    listOf("Introduction", "The Hitchhiker's Guide to the Galaxy", "The Restaurant at the End of the Universe", "Life, the Universe and Everything", "So Long, and Thanks for All the Fish", "Young Zaphod Plays It Safe"),
    224
)

val book2 = Book(
    "To Kill a Mockingbird",
    listOf(Author("Harper", "Lee", "Bercin", "28 April 1926")),
    1960,
    1,
    "978-0446310789",
    Publisher("J. B. Lippincott & Co.", "Philadelphia", "1836"),
    listOf("Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "Chapter 5", "Chapter 6"),
    281
)

val magazine1 = Magazine(
    "Greta Johnsen",
    "TED Talks",
    "April",
    2021,
    listOf(
        Article("Why the secret to success is setting the right goals", "Lorem ipsum dolor sit amet...", Author("John", "Doe", "M.", "2 January 1980")),
        Article("How AI can save our humanity", "Lorem ipsum dolor sit amet...", Author("Jane", "Doe", "null", "10 February 1990")),
        Article("The benefits of meditation and mindfulness", "Lorem ipsum dolor sit amet...", Author("Bob", "Smith", "J.", "15 March 1975"))
    )
)

val magazine2 = Magazine(
    "David Remnick",
    "The New Yorker",
    "January",
    2022,
    listOf(
        Article("The Pandemic and the Prepper", "Lorem ipsum dolor sit amet...", Author("Michael", "Schulman", "", "3 June 1983")),
        Article("The Whistleblower", "Lorem ipsum dolor sit amet...", Author("Sheelah", "Kolhatkar", "", "23 January 1974")),
        Article("Twilight of the Italian Empire", "Lorem ipsum dolor sit amet...", Author("Jia", "Tolentino", "", "18 June 1988"))
    )
)

val newspaper1 = Newspaper(
    name = "New York Times",
    dayPublished = 28,
    monthPublished = "March",
    yearPublished = 2023,
    headline = "Biden Proposes Major Infrastructure Bill",
    articles = listOf(
        Article(
            title = "Biden Proposes $2 Trillion Infrastructure Plan",
            content = "President Biden announced...",
            author = Author(
                firstName = "John",
                lastName = "Doe",
                middleName = "",
                dateOfBirth = "01/01/1970"
            )
        ),
        Article(
            title = "What's Included in Biden's Infrastructure Plan",
            content = "President Biden's...",
            author = Author(
                firstName = "Jane",
                lastName = "Doe",
                middleName = "",
                dateOfBirth = "01/01/1975"
            )
        ),
        Article(
            title = "Critics Blast Biden's Infrastructure Plan",
            content = "While many praised...",
            author = Author(
                firstName = "James",
                lastName = "Smith",
                middleName = "",
                dateOfBirth = "01/01/1980"
            )
        )
    )
)

val newspaper2 = Newspaper(
    name = "The Guardian",
    dayPublished = 27,
    monthPublished = "March",
    yearPublished = 2023,
    headline = "EU leaders agree to impose new sanctions on Russia",
    articles = listOf(
        Article(
            title = "EU leaders announce new sanctions on Russia",
            content = "The sanctions are a response to Russia's recent military buildup on the border with Ukraine.",
            author = Author(
                firstName = "Jon",
                lastName = "Henley",
                middleName = "",
                dateOfBirth = "1971-08-14"
            )
        ),
        Article(
            title = "Russia warns of retaliation against EU sanctions",
            content = "The Russian government has condemned the sanctions and threatened to take retaliatory measures.",
            author = Author(
                firstName = "Andrew",
                lastName = "Roth",
                middleName = "",
                dateOfBirth = "1980-03-22"
            )
        ),
        Article(
            title = "Sanctions show EU's determination to defend Ukraine, says Merkel",
            content = "German Chancellor Angela Merkel praised the sanctions as a signal of the EU's commitment to Ukraine's security.",
            author = Author(
                firstName = "Philip",
                lastName = "Oltermann",
                middleName = "",
                dateOfBirth = "1977-11-19"
            )
        )
    )
)

val author1 = Author("Douglas", "Adams", "Anciano", "11/03/1952")
val author2 = Author("Harper", "Lee", "Bercin", "28/094/1926")


val comic1 = Comic("Watchmen", "September", 1986,
    listOf(Illustrator("Dave", "Gibbons", "Serbi", "14/04/1949"),
        Illustrator("and John", "Higgins", "Darwin", "09/01/1949")),
    Publisher("DC Comics", "1700 Broadway, New York, NY", "1934"))
val comic2 = Comic("Saga", "March", 2012,
    listOf(Illustrator("Fiona", "Staples", "Nerty", "14/03/1978")),
    Publisher("Image Comics", "200 Portland St #400, Boston, MA", "1992"))
val comic3 = Comic("Sandman", "January", 1989,
    listOf(Illustrator("Sam", "Kieth", "Bendict", "11/01/1963"),
        Illustrator("and Mike", "Dringenberg", "Dominic", "14/02/1960")),
    Publisher("Vertigo Comics", "1700 Broadway, New York, NY", "1993"))

val illustrator1 = Illustrator("Dave", "Gibbons", "Serbi", "14/04/1949")
val illustrator2 = Illustrator("Fiona", "Staples", "Nerty", "14/03/1978")
val illustrator3 = Illustrator("Mike", "Dringenberg", "Dominic", "14/02/1960")

val author = Author("Mark", "Twain", "null", "30/11/1835")
val article1 = Article("The Adventures of Tom Sawyer", "The Adventures of Tom Sawyer is a novel by Mark Twain about a young boy growing up along the Mississippi River in the mid-19th century.", author)
val article2 = Article("The War Prayer", "The War Prayer is a short story by Mark Twain that satirizes the hypocrisy of war and the patriotic fervor that often accompanies it.", author)

val publisher = Publisher("Sony Music Entertainment", "25 Madison Ave, New York, NY 10010", "01/01/1929")
val recording = Recording(
    hasVideo = true,
    hasAudio = true,
    length = 240,
    dateRecorded = "01/01/2022",
    title = "Thriller",
    publisher = publisher
)

val publisher1 = Publisher("Penguin Random House", "1745 Broadway, New York, NY 10019", "01/07/2013")
val publisher2 = Publisher("HarperCollins Publishers", "195 Broadway, New York, NY 10007", "01/01/1817")
val publisher3 = Publisher("Macmillan Publishers", "120 Broadway, New York, NY 10271", "01/01/1843")


fun main() {
    val books = listOf(book1, book2)
    val magazines = listOf(magazine1, magazine2)
    val newspapers = listOf(newspaper1, newspaper2)
    val comics = listOf(comic1, comic2, comic3)

    while (true) {
        println("\nList of books/magazines/newspapers/comics:")
        books.forEach { it ->
            println("Book: ${it.title}")
            println("Author(s): ${it.authors.joinToString(", ") { "${it.firstName} ${it.middleName} ${it.lastName} ${it.dateOfBirth}" }}")

        }
        magazines.forEach {
            println("Magazine: ${it.title}")
            println("Editor: ${it.editor}")
        }
        newspapers.forEach {
            println("Newspaper: ${it.name}")
            println("Headline: ${it.headline}")
        }
        comics.forEach { it ->
            println("Comic: ${it.title}")
            println("Illustrator(s): ${it.illustrators.joinToString(", ") { "${it.firstName} ${it.middleName} ${it.lastName} ${it.dateOfBirth}" }}")
            println("Publisher: ${it.publisher.name}")
        }

        print("\nEnter the title of the book/magazine/newspaper/comic you want to search (or type 'exit' to quit): ")
        val searchTerm = readLine()?.lowercase(Locale.getDefault())
        if (searchTerm == "exit") {
            break
        }
        var found = false

        books.find { it.title.lowercase(Locale.getDefault()) == searchTerm }?.let { it ->
            found = true
            println("Book found:")
            println("Title:" + it.title)
            println("Author:" + it.authors.joinToString(", "){ "${it.firstName} ${it.middleName} ${it.lastName} ${it.dateOfBirth}" })
            println("YearPublished:" + it.yearPublished)
            println("Edition:" + it.edition)
            println("ISBN:" + it.isbn)
            println("PublisherName:" + it.publisher.name)
            println("ChapterSize:" + it.chapters.size)
            println("Num of Pages:" + it.numPages)
        }

        magazines.find { it.title.lowercase(Locale.getDefault()) == searchTerm }?.let { it ->
            found = true
            println("Magazine found:")
            println("Title:" + it.title)
            println("Editor:" + it.editor)
            println("MonthPublished:" + it.monthPublished)
            println("YearPublished:" + it.yearPublished)
            println("Articles:" + it.articles.joinToString(", ") { it.title })
        }

        newspapers.find { it.name.lowercase(Locale.getDefault()) == searchTerm }?.let { it ->
            found = true
            println("Newspaper found:")
            println("Name:" + it.name)
            println("DayPublished:" + it.dayPublished)
            println("MonthPublished:" + it.monthPublished)
            println("YearPublished:" + it.yearPublished)
            println("Headline:" + it.headline)
            println("Articles:" + it.articles.joinToString(", ") { it.title })
        }

        comics.find { it.title.lowercase(Locale.getDefault()) == searchTerm }?.let { it ->
            found = true
            println("Comic found:")
            println("Title:" + it.title)
            println("Illustrator(s):" + it.illustrators.joinToString(", ") { "${it.firstName} ${it.middleName} ${it.lastName} ${it.dateOfBirth}" })
            println("MonthPublished:" + it.monthPublished)
            println("YearPublished:" + it.yearPublished)
            println("PublisherName:" + it.publisher.name)
        }

        if (!found) {
            println("No matches found.")
        }
    }
}

