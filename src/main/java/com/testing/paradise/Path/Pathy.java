package com.testing.paradise.Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathy {
    public static void main(String[] args) {
        String path ="/opt/etrainer/transcripts/Patrick Niyogitare Resume-6c2b114d1f1b4c94976cbd59484250b9.pdf";
        Path pathDTO = Paths.get(path);
//        String directory = String.format("/%s",pathDTO.getParent());
        String fileName = String.format("%s",pathDTO.getFileName());
        String str = pathDTO.subpath(2,3).toString();
        String dir = "";
        String transferLettersDirectory ="SAUVE Jean-Luc";
        switch(str)
        {
            case "transcripts":
                dir = transferLettersDirectory;
                break;
            default:
                dir = "nothing";
        }
        System.out.println(dir);
        System.out.println(fileName);

    }
}
