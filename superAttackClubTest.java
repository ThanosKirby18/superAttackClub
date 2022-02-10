import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class superAttackClubTest {

    @Test
    void FirstNameLetterACapTrue() {
        superAttackClub tester1 = new superAttackClub();
        tester1.setAtkName("Awe");
        assertTrue(tester1.getAtkName().matches("[A-Z][a-z]+"));
    }

    @Test
    void letterwWithSyntax() {
        superAttackClub tester1 = new superAttackClub();
        tester1.setAtkName("A!");
        assertTrue(tester1.getAtkName().matches("[A-Z][!]"));
    }

    @Test
    void wordWithSyntax() {
        superAttackClub tester1 = new superAttackClub();
        tester1.setAtkName("Hello!");
        assertTrue(tester1.getAtkName().matches("[A-Z][a-z]+[!]"));
    }
    @Test
    void wordWithEndWord() {
        superAttackClub tester1 = new superAttackClub();
        tester1.setAtkName("Helloburn");
        assertTrue(tester1.getAtkName().matches("[A-Z][a-z]+burn$"));
    }
    @Test
    void wordWithEndWordhyphen() {
        superAttackClub tester1 = new superAttackClub();
        tester1.setAtkName("Hello-burn");
        assertTrue(tester1.getAtkName().matches("[A-Z][a-z]+-burn$"));
    }
    @Test
    void hasPhrase() {
        superAttackClub tester1 = new superAttackClub();
        tester1.setAtkName("burn-attack");
        assertTrue(tester1.getAtkName().matches("(burn|attack)-[a-z]+"));
    }
    @Test
    void checksPunct() {
        superAttackClub tester1 = new superAttackClub();
        tester1.setAtkName("!");
        assertTrue(tester1.getAtkName().matches("[\\p{Punct}]"));
    }
    @Test
    void checksWordAndChar() {
        superAttackClub tester1 = new superAttackClub();
        tester1.setAtkName("Sdf!");
        assertTrue(tester1.getAtkName().matches("[\\p{Alpha}]+[\\p{Punct}]"));
    }
    @Test
    void firstSlashLast() {
        superAttackClub tester1 = new superAttackClub();
        tester1.setAtkName("Emiliano Melendrez");
        assertTrue(tester1.getAtkName().matches("[\\p{Alpha}]+[\\p{Space}][\\p{Alpha}]+"));
    }
    @Test
    void number() {
        superAttackClub tester1 = new superAttackClub();
        tester1.setAtkName("123");
        assertTrue(tester1.getAtkName().matches("[\\p{Digit}]+"));
    }


}
