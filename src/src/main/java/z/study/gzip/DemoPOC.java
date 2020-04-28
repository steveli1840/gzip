package z.study.gzip;

import java.io.*;

/***
 ** Case Created by Xcalibyte, @Jason, 2019
 **/

public class DemoPOC {

  // Build up a null pointer
  public String j_npd_01(int m) {
    if (m > 0) {
      Object t = null;
      return j_npd_02(t);
    } else {
      return j_npd_02(new Object());
    }
  }

  // Dereference, where NullPointerException might occur.
  public String j_npd_02(Object m) {
    return m.toString();
  }

  public static void ids16(final BufferedOutputStream outStream,
                                        final String quantity) throws IOException {
    String xmlString = "<item>\n<description>Widget</description>\n"
      + "<price>500</price>\n" + "<quantity>" + quantity
      + "</quantity></item>";
    outStream.write(xmlString.getBytes());
    outStream.flush();
  }
}
