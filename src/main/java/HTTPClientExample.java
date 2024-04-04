import javax.net.ssl.*;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.Arrays;

public class HTTPClientExample {

    private static final TrustManager MOCK_TRUST_MANAGER = new X509ExtendedTrustManager() {
        @Override
        public void checkClientTrusted(X509Certificate[] x509Certificates, String s, Socket socket) throws CertificateException {
            System.out.println("checkClientTrusted1 called");
            Arrays.stream(x509Certificates).forEach(x509Certificate -> System.out.println(x509Certificate.getVersion()));
        }

        @Override
        public void checkServerTrusted(X509Certificate[] x509Certificates, String s, Socket socket) throws CertificateException {
            System.out.println("checkServerTrusted1 called");
            Arrays.stream(x509Certificates).forEach(x509Certificate -> System.out.println(x509Certificate.getVersion()));
        }

        @Override
        public void checkClientTrusted(X509Certificate[] x509Certificates, String s, SSLEngine sslEngine) throws CertificateException {
            System.out.println("checkClientTrusted2 called");
            Arrays.stream(x509Certificates).forEach(x509Certificate -> System.out.println(x509Certificate.getVersion()));
        }

        @Override
        public void checkServerTrusted(X509Certificate[] x509Certificates, String s, SSLEngine sslEngine) throws CertificateException {
            System.out.println("checkServerTrusted2 called");
            Arrays.stream(x509Certificates).forEach(x509Certificate -> System.out.println(x509Certificate.getVersion()));
        }

        @Override
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return new java.security.cert.X509Certificate[0];
        }

        @Override
        public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

        }

        @Override
        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
            // empty method
        }
        // ... Other void methods
    };
    public static void main(String[] args) throws IOException, InterruptedException, NoSuchAlgorithmException, KeyManagementException {
        System.out.println(System.currentTimeMillis());
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, new TrustManager[]{MOCK_TRUST_MANAGER}, new SecureRandom());
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(20))
                .sslContext(sslContext)
                .build();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:" + 2500+"/employeesNew/1"))
                .build();
        HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());
        System.out.println(System.currentTimeMillis());
    }
}
