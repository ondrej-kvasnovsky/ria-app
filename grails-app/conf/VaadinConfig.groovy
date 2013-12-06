vaadin {

    // Your Vaadin UI classes that extends com.vaadin.ui.UI.
    // The application will be available at e.g. http://localhost:8080/grails-vaadin7-demo/
    mapping = [
            "/client/*": "app.ClientUI",
            "/server/*": "app.ServerUI",
            "/*": "app.MyUI"
    ]

    // Extra mapping in case you need 'reserve' a URL and it shouldn't be mapped to e.g. /* by Vaadin
    // mappingExtras = [
    //         '/console/*'
    // ]

    // This is optional because the servlet is provided by default.
    // servletClass = "com.mycompany.MyGrailsAwareApplicationServlet"

    productionMode = false
}

environments {
    production {
        vaadin {
            productionMode = true
        }
    }
}
