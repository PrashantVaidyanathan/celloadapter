package org.cidarlab.celloadapter;


import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by krishna on 3/20/17.
 */
public class UCF {
    private final String filename;
    private String filetext;
    JSONArray ucfdatamodel;

    public UCF(String filename, String filetext) throws ParseException {
        this.filename = filename;
        this.filetext = filetext;
        JSONParser parser = new JSONParser();
        ucfdatamodel = (JSONArray) parser.parse(filetext);
    }

    public String getFilename() {
        return filename;
    }

    public String getFiletext() {
        return filetext;
    }
}
