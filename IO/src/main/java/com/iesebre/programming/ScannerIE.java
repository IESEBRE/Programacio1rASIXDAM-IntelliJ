package com.iesebre.programming;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerIE {

    private boolean numRead=false;
    private Scanner in;

    public ScannerIE(InputStream input) {
        in = new Scanner(input);
    }

    public int nextInt(){
        numRead=true;
        return in.nextInt();
    }

    public byte nextByte(){
        numRead=true;
        return in.nextByte();
    }

    public short nextShort(){
        numRead=true;
        return in.nextShort();
    }

    public long nextLong(){
        numRead=true;
        return in.nextLong();
    }

    public double nextDouble(){
        numRead=true;
        return in.nextDouble();
    }

    public float nextFloat(){
        numRead=true;
        return in.nextFloat();
    }

    public boolean nextBoolean(){
        numRead=true;
        return in.nextBoolean();
    }

    public String nextLine(){
        if(numRead) in.skip("[\r\n]*").next();
        numRead=false;
        return in.nextLine();
    }


}
