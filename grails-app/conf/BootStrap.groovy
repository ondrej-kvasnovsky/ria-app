import com.app.Author
import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        if (Environment.current == Environment.DEVELOPMENT) {
            Author raymond = new Author(name: 'Raymond')
            raymond.save(failOnError: true)

            Author pug = new Author(name: 'Pug')
            pug.save(failOnError: true)
        }
    }
    def destroy = {
    }
}
