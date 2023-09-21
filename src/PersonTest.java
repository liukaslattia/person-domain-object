import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person pekka = new Person(554127,
            "Pekka",
            "Puupää",
            "Kuusikatu 6 24412 Urjala",
            "Finland",
            "Finnish",
            "Single",
            19650821
    );

    Person maija = new Person(454178,
            "Maija",
            "Mehiläinen",
            "Mäntykatu 7 24412 Urjala",
            "Finland",
            "Finnish",
            "Single",
            19850823
    );

    @Test
    void newPerson() {
        assertAll(() ->
                        assertEquals("Person{socialSecurityNumber=554127, firstName='Pekka', lastName='Puupää', address='Kuusikatu 6 24412 Urjala', nationality='Finland', nativeLanguage='Finnish', socialStatus='Single', dateOfBirth=19650821, dateOfDeath=0, partnerSocialSecurityNumber=0}"
                                , pekka.toString()),
                () -> assertEquals("Person{socialSecurityNumber=454178, firstName='Maija', lastName='Mehiläinen', address='Mäntykatu 7 24412 Urjala', nationality='Finland', nativeLanguage='Finnish', socialStatus='Single', dateOfBirth=19850823, dateOfDeath=0, partnerSocialSecurityNumber=0}"
                        , maija.toString()));
    }

    @Test
    void married() {
        assertAll(() -> assertEquals("Pekka married Maija"
                        , pekka.married(maija)),
                () ->
                        assertEquals("Person{socialSecurityNumber=554127, firstName='Pekka', lastName='Puupää', address='Kuusikatu 6 24412 Urjala', nationality='Finland', nativeLanguage='Finnish', socialStatus='Married', dateOfBirth=19650821, dateOfDeath=0, partnerSocialSecurityNumber=454178}",
                                pekka.toString()),
                () -> assertEquals("Person{socialSecurityNumber=454178, firstName='Maija', lastName='Mehiläinen', address='Mäntykatu 7 24412 Urjala', nationality='Finland', nativeLanguage='Finnish', socialStatus='Married', dateOfBirth=19850823, dateOfDeath=0, partnerSocialSecurityNumber=454178}"
                        , maija.toString()));
    }

    @Test
    void death() {
        pekka.married(maija);
        assertAll(() ->
                        assertEquals("Pekka has died and social security number 454178 holder is now a widow."
                                , pekka.setDateOfDeath(20130228)),
                () -> assertEquals("Person{socialSecurityNumber=554127, firstName='Pekka', lastName='Puupää', address='Kuusikatu 6 24412 Urjala', nationality='Finland', nativeLanguage='Finnish', socialStatus='Married', dateOfBirth=19650821, dateOfDeath=20130228, partnerSocialSecurityNumber=454178}"
                        , pekka.toString()));
    }

}