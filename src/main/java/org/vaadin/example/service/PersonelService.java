package org.vaadin.example.services;

import org.springframework.stereotype.Service;
import org.vaadin.example.models.Personel;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonelService {

    private final List<Personel> personelList = Arrays.asList(
            new Personel("100001", "Ahmet", "Yılmaz"),
            new Personel("100002", "Mehmet", "Kaya"),
            new Personel("100003", "Ayşe", "Demir"),
            new Personel("100004", "Fatma", "Çelik"),
            new Personel("100005", "Mustafa", "Arslan"),
            new Personel("100006", "Zeynep", "Öztürk"),
            new Personel("100007", "Ahmet", "Şahin"),
            new Personel("100008", "Emine", "Koç"),
            new Personel("100009", "Hüseyin", "Taş"),
            new Personel("100010", "Elif", "Aydın")
    );

    public List<Personel> getPersonelList() {
        return personelList;
    }

    public List<Personel> searchByName(String name) {
        return personelList.stream()
                .filter(p -> p.getAd().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }
}
