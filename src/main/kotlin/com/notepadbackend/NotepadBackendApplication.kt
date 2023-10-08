package com.notepadbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotepadBackendApplication

fun main(args: Array<String>) {
    runApplication<NotepadBackendApplication>(*args)
}
