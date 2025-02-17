package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.PostConstruct;
import org.vaadin.example.models.Personel;
import org.vaadin.example.services.PersonelService;
import org.vaadin.example.MainLayout;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@PageTitle("Personel Listesi")
@Route(value = "personel", layout = MainLayout.class)
public class PersonelView extends VerticalLayout {

    private final PersonelService personelService;
    private Grid<Personel> grid;
    private TextField searchField;

    @Autowired
    public PersonelView(PersonelService personelService) {
        this.personelService = personelService;

        grid = new Grid<>(Personel.class);
        searchField = new TextField("Ada göre ara");

        searchField.addValueChangeListener(event -> {
            String filter = event.getValue();
            grid.setItems(personelService.searchByName(filter));
        });

        add(searchField, grid);
    }

    @PostConstruct
    private void init() {
        List<Personel> personelList = personelService.getPersonelList();
        grid.setItems(personelList);
        grid.setColumns("ad", "soyad");
    }
}
