package org.vaadin.example.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.example.MainLayout;

@PageTitle("Ana Sayfa")
@Route(value = "", layout = MainLayout.class)
public class MainView extends VerticalLayout {

    public MainView() {
        add(new H1("Merhaba,Task Projeme Hoşgeldiniz!"));
    }
}
