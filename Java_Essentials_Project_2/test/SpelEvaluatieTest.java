

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class SpelEvaluatieTest {
    private static final int MINIMUM_LEEFTIJD = 12;
    private Spel spel;
    private Speler geldigeSpeler;
    private Speler ongeldigeSpeler;

    @Before
    public void setup() {
        Uitgever uitgever = new Uitgever("999 games", "Almere", 1996);
        spel = new BordSpel("Bonanaza", uitgever);
        spel.setMinimumLeeftijd(MINIMUM_LEEFTIJD);
        geldigeSpeler = new Speler("Geldige speler", 1980);
        ongeldigeSpeler = new Speler("Ongeldige speler", LocalDate.now().minusYears(5).getYear());
    }


    @Test
    public void testConstructor() {
        SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
        assertNotNull(evaluatie);
        assertEquals(spel, evaluatie.getSpel());
        assertEquals(geldigeSpeler, evaluatie.getSpeler());
    }

    @Test
    public void testIsGeldigGeeftFalseIndienBeoordelingMaarSpelNull() {
        SpelEvaluatie evaluatie = new SpelEvaluatie(null, geldigeSpeler);
        evaluatie.maaktBeoordeling(5, "We hebben ontzettend veel gelachen.");
        assertFalse(evaluatie.isGeldig());
    }

    @Test
    public void testIsGeldigGeeftFalseIndienBeoordelingMaarSpelerNull() {
        SpelEvaluatie evaluatie = new SpelEvaluatie(spel, null);
        evaluatie.maaktBeoordeling(5, "We hebben ontzettend veel gelachen.");
        assertFalse(evaluatie.isGeldig());
    }

    @Test
    public void testIsGeldigGeeftFalseIndienBeoordelingNogNietGegeven() {
        SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
        assertFalse(evaluatie.isGeldig());
    }

    @Test
    public void testIsGeldigGeeftFalseIndienSpelerJongerDanMinimumLeeftijdSpel() {
        SpelEvaluatie evaluatie = new SpelEvaluatie(spel, ongeldigeSpeler);
        evaluatie.maaktBeoordeling(5, "We hebben ontzettend veel gelachen.");
        assertFalse(evaluatie.isGeldig());
    }

    @Test
    public void testIsGeldigGeeftTrueIndienSpelerMinimumLeeftijdHeeft() {
        geldigeSpeler.setGeboortejaar(LocalDate.now().minusYears(MINIMUM_LEEFTIJD).getYear());
        SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
        evaluatie.maaktBeoordeling(5, "We hebben ontzettend veel gelachen.");
        assertTrue(evaluatie.isGeldig());
    }

    @Test
    public void testIsGeldigGeeftFalseIndienSpelerLeeftijdNietBekend() {
        geldigeSpeler.setGeboortejaar(0);
        SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
        evaluatie.maaktBeoordeling(5, "We hebben ontzettend veel gelachen.");
        assertFalse(evaluatie.isGeldig());
    }

    @Test
    public void testIsGeldigGeeftTrueIndienSpelerOuderDanMinimumLeeftijdSpel() {
        SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
        evaluatie.maaktBeoordeling(5, "We hebben ontzettend veel gelachen.");
        assertTrue(evaluatie.isGeldig());
    }

    @Test
    public void testMaakBeoordelingVultScoreCorrectIn() {
        SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
        assertNull(evaluatie.getScore());
        evaluatie.maaktBeoordeling(5, "We hebben ontzettend veel gelachen.");
        assertNotNull(evaluatie.getScore());
    }

    @Test
    public void testMaakBeoordelingVultMotivatieCorrectIn() {
        String motivatie = "We hebben ontzettend veel gelachen.";
        SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
        assertNull(evaluatie.getMotivatie());
        evaluatie.maaktBeoordeling(5, motivatie);
        assertNotNull(evaluatie.getMotivatie());
        assertEquals(motivatie, evaluatie.getMotivatie());
    }

    @Test
    public void testMaakBeoordelingKanEerdereBeoordelingNietOverschrijven() {
        String motivatie = "We hebben ontzettend veel gelachen.";
        SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
        evaluatie.maaktBeoordeling(5, motivatie);
        evaluatie.maaktBeoordeling(3, "Niet erg spannend.");
        assertEquals(motivatie, evaluatie.getMotivatie());
    }
}
