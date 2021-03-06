package tk.hadeslee.Lambda_Expressions.Composing_with_Lambda_Expressions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;

/**
 * Project: java8-examples
 * FileName: YahooFinance
 * Date: 2015-12-04
 * Time: 오전 10:37
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class YahooFinance {
    public static BigDecimal getPrice(final String ticker) {
        try {
            final URL url =
                    new URL("http://ichart.finance.yahoo.com/table.csv?s=" + ticker);

            final BufferedReader reader =
                    new BufferedReader(new InputStreamReader(url.openStream()));
            final String data = reader.lines().skip(1).findFirst().get();
            final String[] dataItems = data.split(",");
            return new BigDecimal(dataItems[dataItems.length - 1]);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
