package org.vaadin.example.views;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.example.MainLayout;

@PageTitle("Hello Monad")
@Route(value = "hello-monad", layout = MainLayout.class) 
public class HelloMonad extends VerticalLayout {

    public HelloMonad() {
        H1 title = new H1("Merhaba, Ben Seyit Emin Şanver");

       Image profileImage = new Image("/images/ed42542e-6819-4ae1-99e1-12bf470e7f36.jpg", "Seyit Emin Şanver");


        profileImage.setWidth("200px");
     
        Paragraph intro = new Paragraph(
            "Kırıkkale Üniversitesi Bilgisayar Mühendisliği bölümünden 3.14 not ortalaması ile mezun oldum. " +
            "Yazılım geliştirme alanındaki bilgi ve tecrübelerimle firmanızın hedeflerine katkı sağlamak ve ekibinizin bir parçası olmak amacıyla başvuruda bulunuyorum."
        );

        Paragraph experience = new Paragraph(
            "C#, .NET, Python, Node.js, React, React Native, JavaScript, yapay zeka, makine öğrenmesi ve veri tabanı yönetimi gibi alanlarda deneyime sahibim. " +
            "1 yıllık backend geliştirme tecrübemin yanı sıra, Teknofest’te yapay zeka projemle finale kalarak önemli bir başarı elde ettim."
        );

        Paragraph projects = new Paragraph(
            "📌 E-ticaret Çözümleri: İlk iş deneyimimde, .NET kullanarak bir e-ticaret firmasında müşteri sipariş ve tedarikçi yönetimi gibi çözümler geliştirdim.\n\n" +
            "📌 Mobil ve Web Uygulama Geliştirme: Node.js, React ve React Native kullanarak bir arkadaşlık uygulaması geliştirme süreçlerinde yer aldım ve veri tabanı yönetimini üstlendim."
        );

        Paragraph closing = new Paragraph(
            "Firmanızda aktif olarak katkı sağlayabileceğim bir pozisyonda görev almayı ve uzun vadeli değer yaratmayı hedefliyorum. " +
            "Teknik bilgim, problem çözme becerim ve öğrenmeye olan isteğimle ekibinizin bir parçası olmaktan mutluluk duyacağım."
        );

        Paragraph contact = new Paragraph(
            "📞 İletişim: 0505-131-24-97\n📧 Email: seyitemin@example.com"
        );

      
        add(title, profileImage, intro, experience, projects, closing, contact);
    }
}
