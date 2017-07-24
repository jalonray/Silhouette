package com.silhouette.jalon.monitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by JayRay on 24/07/2017.
 * Info:
 */

public class LogCat {
    @interface Level {
        String VERBOSE = "-v";  // 2;
        String DEBUG = "-d";  // 3
        String INFO = "-i";  // 4
        String WARN = "-w";  // 5
        String ERROR = "-e";  // 6
        String ASSERT = "-a";  // 7
    }

    private String log(@Level String level) {
        try {
            Process process = Runtime.getRuntime().exec("logcat " + level);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            StringBuilder log = new StringBuilder();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                log.append(line);
            }
            return log.toString();
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
