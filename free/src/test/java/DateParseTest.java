import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by free on 1
 *
 *
 * 4-3-1.
 */
public class DateParseTest {
    public static void main(String[] args) throws ParseException {
        String data = "2014-02-29";

        SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd");
        df.parse(data);

        DateLocaleConverter dc = new DateLocaleConverter();
        dc.convert(data);

    }
}
