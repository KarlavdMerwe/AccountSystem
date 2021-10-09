package za.ac.nwu.ac.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import za.ac.nwu.ac.domain.dto.AccountTransactionDto;

import static org.junit.Assert.*;

public class TestMilesTest {

    private TestMiles testMiles;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Mock
    AccountTransactionDto accountTransactionDto;

    @Test
    public void addMiles() {
        //Long result = testMiles.addMiles(accountTransactionDto.getAmount(), 5);
        //assertEquals("Should be 5005", 5005, result.intValue());
    }

    @Test
    public void subtractMiles() {
        //Long result = testMiles.subtractMiles(accountTransactionDto.getAmount(), 5);
        //assertEquals("Should be 5000", 5000, result.intValue());
    }
}