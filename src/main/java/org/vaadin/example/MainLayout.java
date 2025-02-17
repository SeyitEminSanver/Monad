package org.vaadin.example;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.example.views.MainView;
import org.vaadin.example.views.PersonelView;
import org.vaadin.example.views.HelloMonad;

public class MainLayout extends AppLayout {

    public MainLayout() {
        H1 title = new H1("My App");
        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(), title);
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);

        addToNavbar(header);

        VerticalLayout menu = new VerticalLayout();
       menu.add(new RouterLink("Hello Monad", HelloMonad.class));

        menu.add(new RouterLink("Personel", PersonelView.class));
        menu.add(new RouterLink("About", MainView.class));
        

        addToDrawer(menu);
    }
}
