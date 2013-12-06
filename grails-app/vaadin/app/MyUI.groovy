package app

import com.app.Author
import com.app.AuthorService
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.VerticalLayout

import static com.vaadin.grails.Grails.i18n
import static com.vaadin.grails.Grails.get
import static java.util.Locale.ENGLISH

class MyUI extends UI {

    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout()
        layout.setMargin(true)

        AuthorService authorService = get(AuthorService)

        List<Author> authors = authorService.getAuthors()

        for (Author author : authors) {
            Label label = new Label(author.name)
            layout.addComponent(label)
        }

        setContent(layout)
    }
}
