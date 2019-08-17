package com.dandan.Mockito;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dandan On 七月 25 2019
 */
public class SignonDao {

    private PrintStream printStream;

    public SignonDao(PrintStream printStream){
        this.printStream = printStream;
    }

    public PrintStream getPrintStream() {
        return printStream;
    }

    public void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
    }

    public List<Signon> findAll() {
        List<Signon> signons = new ArrayList<Signon>();
        Signon signon = new Signon();
        signon.setName("名称");
        signon.setValue("值");
        signons.add(signon);
        return signons;
    }

}
