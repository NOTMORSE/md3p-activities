package com.example.activity1

class Book(val title: String,
           val authors: List<Author>,
           val yearPublished: Int,
           val edition: Int,
           val isbn: String,
           val publisher: Publisher,
           val chapters: List<String>,
           val numPages: Int)

class Magazine(val editor: String,
               val title: String,
               val monthPublished: String,
               val yearPublished: Int,
               val articles: List<Article>)

class Newspaper(val name: String,
                val dayPublished: Int,
                val monthPublished: String,
                val yearPublished: Int,
                val headline: String,
                val articles: List<Article>)

class Author(val firstName: String,
             val lastName: String,
             val middleName: String,
             val dateOfBirth: String)

class Comic(val title: String,
            val monthPublished: String,
            val yearPublished: Int,
            val illustrators: List<Illustrator>,
            val publisher: Publisher)

class Illustrator(val firstName: String,
                  val lastName: String,
                  val middleName: String,
                  val dateOfBirth: String)

class Article(val title: String,
              val content: String?,
              val author: Author)

class Recording(val hasVideo: Boolean,
                val hasAudio: Boolean,
                val length: Int,
                val dateRecorded: String,
                val title: String,
                val publisher: Publisher)

class Publisher(val name: String,
                val address: String,
                val dateEstablished: String)

