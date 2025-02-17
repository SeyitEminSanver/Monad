package org.vaadin.example.services;

import org.springframework.stereotype.Service;
import org.vaadin.example.models.Personel;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonelService {
    private final List<Personel> personelList = new ArrayList<>();

    public PersonelService() {
        // Başlangıç verileri
        personelList.add(new Personel("Ali", "Yılmaz"));
        personelList.add(new Personel("Ayşe", "Demir"));
        personelList.add(new Personel("Mehmet", "Kaya"));
    }

    public List<Personel> getAllPersonel() {
        return new ArrayList<>(personelList);
    }

    public void addPersonel(Personel personel) {
        personelList.add(personel);
    }
}
