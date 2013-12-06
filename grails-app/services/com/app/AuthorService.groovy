package com.app

import grails.transaction.Transactional

@Transactional
class AuthorService {

    List<Author> getAuthors() {
        return Author.list()
    }
}
