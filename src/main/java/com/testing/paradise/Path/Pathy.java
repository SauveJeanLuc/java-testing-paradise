package com.testing.paradise.Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathy {
    public static void main(String[] args) {
        String path = "opt/etrainer/letters/NIYOGITARE PATRICK-44b5ddb166ca45b0a0f073619f1bd313.pdf";
        Path pathDTO = Paths.get(path);
        Path directory = pathDTO.getParent();
        Path fileName = pathDTO.getFileName();
        String dir = String.format("/%s",directory);
        System.out.println("PATHDTO: " + pathDTO.toString());
        System.out.println("Directory: " + dir);
        System.out.println("third component: " + pathDTO.subpath(2,3));
        System.out.println(" File Name: " + fileName.toString());
    }
}
