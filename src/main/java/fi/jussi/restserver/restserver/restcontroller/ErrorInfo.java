package fi.jussi.restserver.restserver.restcontroller;

/**
 * Class Description.
 *
 * @author Jussi Pohjolainen
 * @version 2017-10-09
 */
public class ErrorInfo {
    private String errorMsg;

    public ErrorInfo() {}

    public ErrorInfo(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}


