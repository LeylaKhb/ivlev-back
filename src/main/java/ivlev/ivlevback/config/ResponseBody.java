package ivlev.ivlevback.config;

public class ResponseBody {
    private String header;
    private String content;

    private String jwt;

    public ResponseBody(String header, String content) {
        this.header = header;
        this.content = content;
    }

    public ResponseBody(String header, String content, String jwt) {
        this.header = header;
        this.content = content;
        this.jwt = jwt;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
