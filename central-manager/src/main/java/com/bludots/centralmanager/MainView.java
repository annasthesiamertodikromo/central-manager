package com.bludots.centralmanager;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("") // Dit betekent: bereikbaar op http://localhost:8081/
public class MainView extends VerticalLayout {

    public MainView() {
        add(new H1("Hello BluDots 🚀 – Central Manager is running!"));
    }
}
