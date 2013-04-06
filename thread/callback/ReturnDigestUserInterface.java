package callback;

import java.io.File;

public class ReturnDigestUserInterface {
    public static void main(String[] args) {
        PollingDigest[] digests = new PollingDigest[args.length];
        for (int i = 0; i < args.length; i++) {
          // Calculate the digest
          File f = new File(args[i]);
          digests[i] = new PollingDigest(f);
          digests[i].start( );
        }

        for (int i = 0; i < args.length; i++) {
          //use polling
          while (true) {
            // Now print the result
            byte[] digest = digests[i].getDigest( );

            //make sure that the thread produce the digest
            if (digest != null) {

              StringBuffer result = new StringBuffer(args[i]);

              result.append(": ");

              for (int j = 0; j < digest.length; j++) {
                  result.append(digest[j] + " ");
              }
              System.out.println(result);
              break;
            }
          }
        }
    }
}
