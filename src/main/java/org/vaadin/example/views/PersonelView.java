package org.vaadin.example.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.example.MainLayout;
import org.vaadin.example.models.Personel;
import org.vaadin.example.services.PersonelService;

import java.util.List;

@PageTitle("Personel")
@Route(value = "personel", layout = MainLayout.class)
public class PersonelView extends VerticalLayout {

    private final PersonelService personelService;
    private final Grid<Personel> grid = new Grid<>(Personel.class);
    private final TextField adField = new TextField("Ad");
    private final TextField soyadField = new TextField("Soyad");

    public PersonelView(PersonelService personelService) {
        this.personelService = personelService;

        updateGrid();

        Button addButton = new Button("Ekle", event -> addPersonel());
        HorizontalLayout formLayout = new HorizontalLayout(adField, soyadField, addButton);
        formLayout.setSpacing(true);

       

        add(formLayout, grid);
    }

    private void updateGrid() {
        List<Personel> personelList = personelService.getAllPersonel();
        grid.setItems(personelList);
    }

    private void addPersonel() {
        String ad = adField.getValue();
        String soyad = soyadField.getValue();

        if (!ad.isEmpty() && !soyad.isEmpty()) {
            personelService.addPersonel(new Personel(ad, soyad));
            updateGrid();
            adField.clear();
            soyadField.clear();
        }
    }
}
