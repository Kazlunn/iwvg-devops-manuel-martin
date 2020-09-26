package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindUserFamilyNameByImproperFraction() {
        assertEquals(List.of("Fernandez", "Blanco", "López", "Blanco", "Torres"),
                new Searches().findUserFamilyNameByImproperFraction().collect(Collectors.toList()));
    }

    @Test
    void testFindFractionAdditionByUserId() {
        assertEquals(16, new Searches().findFractionAdditionByUserId("4").getNumerator());
        assertEquals(8, new Searches().findFractionAdditionByUserId("4").getDenominator());
    }

}
