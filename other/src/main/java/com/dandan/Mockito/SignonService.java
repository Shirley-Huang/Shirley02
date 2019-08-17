package com.dandan.Mockito;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by dandan On 七月 25 2019
 */
public class SignonService {

    private SignonDao signonDao;
    private Boolean flag;
    private PrintStream printStream;

    public SignonDao getSignonDao() {
        return signonDao;
    }

    public void setSignonDao(SignonDao signonDao) {
        this.signonDao = signonDao;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public PrintStream getPrintStream() {
        return printStream;
    }

    public void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
    }

    public SignonService(SignonDao signonDao) {
        this.signonDao = signonDao;
    }

    public SignonService(SignonDao signonDao, Boolean flag) {
        this.signonDao = signonDao;
        this.flag = flag;
    }

    public SignonService(SignonDao signonDao, Boolean flag, PrintStream printStream) {
        this.signonDao = signonDao;
        this.flag = flag;
        this.printStream = printStream;
    }

    public List<Signon> findAll(){
        return signonDao.findAll();
    }

}
