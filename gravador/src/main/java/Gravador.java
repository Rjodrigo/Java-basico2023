/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.xuggler.IRational;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

public class Gravador {

    private static final String OUTPUT_FILE = "video.mp4";
    private static final Dimension SCREEN_SIZE = new Dimension(1750, 720);
    private static final int FRAME_RATE = 30;
    private static final long DURATION_IN_SECONDS = 24 * 60 * 60;

    public static void main(String[] args) {
        IMediaWriter mediaWriter = ToolFactory.makeWriter(OUTPUT_FILE);

        mediaWriter.addVideoStream(0, 0,
                IRational.make(FRAME_RATE, 1),
                SCREEN_SIZE.width, SCREEN_SIZE.height);

        long startTime = System.nanoTime();
        long elapsedTime;

        while ((elapsedTime = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - startTime)) < DURATION_IN_SECONDS) {
            BufferedImage screen = getScreenshot();
            mediaWriter.encodeVideo(0, screen, elapsedTime, TimeUnit.SECONDS);
        }

        mediaWriter.close();
    }

    private static BufferedImage getScreenshot() {
        // Implement your screenshot logic here.
        // You may use libraries like AWT or JavaFX for capturing the screen.
        // Ensure the captured image has the same resolution as SCREEN_SIZE.
        // Example: 
        // Robot robot = new Robot();
        // return robot.createScreenCapture(new Rectangle(SCREEN_SIZE));
        return null;
    }
}