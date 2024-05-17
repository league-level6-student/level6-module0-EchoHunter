package _04_jeopardy_api.data_transfer_objects;
import java.util.List;


public class Clue2 {

    private Integer responseCode;
    private List<Results> results;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

}
