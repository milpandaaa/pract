package ru.itmo.app;

import javax.swing.*;
import java.io.*;
import java.lang.Runtime;
import java.lang.Process;


public class DataBaseDump extends java.util.TimerTask {

    @Override
    public void run() {
            try {
                String executeCmd = DatabaseConnection.dump();
                Process runtimeProcess = Runtime.getRuntime().exec(new String[] {"cmd.exe","/C","cd C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin && "+executeCmd });
                int processComplete = runtimeProcess.waitFor();
                InputStream is = runtimeProcess.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                if (processComplete == 0) {
                    System.out.println("Backup Complete");
                } else {
                    System.out.println("Backup Failure");
                }
            } catch (IOException | InterruptedException ex) {
                System.out.println( "Error at Backuprestore" + ex.getMessage());
            }
    }
}
