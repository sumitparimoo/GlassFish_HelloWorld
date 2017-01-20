package example;
import com.sun.net.httpserver.HttpServer;
import org.opensaml.xml.util.Base64;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

/**
 * Created by tekhar on 11/28/16.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorld {

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/audio/")
    public void receiveAudio(String content) {
        int i = 0;

        String realContent = content.substring(12, content.length()-2);
        realContent = realContent.replace("\\", "");

        try {

//            File file = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/8-Bit-Noise-1.wav");
//            byte[] bytes = FileUtils.readFileToByteArray(file);

            //import org.opensaml.xml.util.Base64;
//            String encoded = Base64.encodeBytes(bytes);
//            byte[] decoded = Base64.decode(encoded);

            byte[] decoded2 = Base64.decode(realContent);

            File file2 = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename.wav");
            FileOutputStream outputStream = new FileOutputStream(file2, true);
            outputStream.write(decoded2);
            outputStream.close();



        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /*
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }

    public static void main(String[] args) throws IOException {
        //HttpServer server = HttpServerFactory.create("http://localhost:9998/");
        //server.start();

        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9998/helloworld");
        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        //server.stop(0);
        System.out.println("Server stopped");
    }*/

    /*



            /*
            byte[] contentData = content.getBytes("UTF-8");
            byte[] decodedBytes = Base64.decode(contentData, 0, contentData.length);

            File file = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename.wav");
            FileOutputStream outputStream = new FileOutputStream(file, true);
            outputStream.write(contentData);
            outputStream.close();*/

    //File file = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/8-Bit-Noise-1.wav");

    //AudioInputStream stream = AudioSystem.getAudioInputStream(content);

            /*
            byte[] decodedBytes3 = Base64.decodeBase64(content.getBytes("UTF-8"));
            byte[] decodedBytes2 = Base64.decodeBase64(content.getBytes());

            byte[] decodedJava = java.util.Base64.getDecoder().decode(content);
            byte[] decodedJava2 = java.util.Base64.getDecoder().decode(content.getBytes());
            byte[] decodedJava3 = java.util.Base64.getDecoder().decode(content.getBytes("UTF-8"));

            Base64 base64 = new Base64();
            String decodedString = Base64.base64Decode(content);
            byte[] decodedBytesUTF8 = base64.decode(content.getBytes("UTF-8"));
            byte[] decodedBytesUTF8_2 = base64.decode(content);
            byte[] decodedBytes = base64.decode(content.getBytes(""));

            PrintWriter out = new PrintWriter("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename.wav");
            out.print(decodedString);
            out.close();

            File file8 = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename.wav");
            FileOutputStream os8 = new FileOutputStream(file8, true);
            os8.write(decodedJava);
            os8.close();

            File file9 = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename2.wav");
            FileOutputStream os9 = new FileOutputStream(file9, true);
            os9.write(decodedJava2);
            os9.close();

            File file10 = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename3.wav");
            FileOutputStream os10 = new FileOutputStream(file10, true);
            os10.write(decodedJava3);
            os10.close();
*/

            /*
            PrintWriter out2 = new PrintWriter("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename2.wav");
            out2.print(content);
            out2.close();


            File file2 = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename3.wav");
            FileOutputStream os = new FileOutputStream(file2, true);
            os.write(decodedBytes);
            os.close();

            File file3 = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename4.wav");
            FileOutputStream os2 = new FileOutputStream(file3, true);
            os2.write(content.getBytes());
            os2.close();

            File file4 = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename5.wav");
            FileOutputStream os3 = new FileOutputStream(file4, true);
            os3.write(content.getBytes("UTF-8"));
            os3.close();


            File file6 = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename6.wav");
            FileOutputStream os6 = new FileOutputStream(file6, true);
            os6.write(decodedBytes2);
            os6.close();

            File file7 = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename7.wav");
            FileOutputStream os7 = new FileOutputStream(file7, true);
            os7.write(decodedBytes3);
            os7.close();


            File file8 = new File("/Users/tekhar/Personal/Dev/GlassFish_HelloWorld/src/example/filename8.wav");
            FileOutputStream os8 = new FileOutputStream(file8, true);
            os8.write(decodedBytesUTF8_2);
            os8.close();
            */


//            AudioInputStream stream = AudioSystem.getAudioInputStream("UTF-8", content);

}
