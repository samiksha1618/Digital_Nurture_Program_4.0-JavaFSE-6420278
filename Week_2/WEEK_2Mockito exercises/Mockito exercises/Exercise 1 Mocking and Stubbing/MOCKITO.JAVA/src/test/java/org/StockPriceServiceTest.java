package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class StockPriceServiceTest {

    @Test
    public void testFetchPriceReport_withMockedApi() {
        // ARRANGE
        MarketApi mockApi = mock(MarketApi.class);
        String ticker = "ACME";
        when(mockApi.getCurrentPrice(ticker)).thenReturn(123.45);

        StockPriceService service = new StockPriceService(mockApi);

        // ACT
        String report = service.fetchPriceReport(ticker);

        // ASSERT
        assertEquals("Current price of ACME is $123.45", report);

        // VERIFY
        verify(mockApi, times(1)).getCurrentPrice(ticker);
    }
}
