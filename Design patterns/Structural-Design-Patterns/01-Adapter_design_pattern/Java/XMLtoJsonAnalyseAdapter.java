class JSONAnalyticsTool {
    private String jsonData;

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public void AnalyzeData() {
        if (jsonData.contains("json")) {
            System.out.println("Analyzing JSON Data - " + jsonData);
        } else {
            System.out.println("Not in the correct format. Can't analyze!");
        }
    }
}

//Now here this Analyse tool is capable of converting the Data into expected format and also process the data Accordingly
interface AnalyticsTool {
    void AnalyzeData();
}

class XMLToJSONAdapter implements AnalyticsTool {
    private JSONAnalyticsTool jsonAnalyticsTool;

    //Comverting process is done in Constructor itself. We can even do this outside
    public XMLToJSONAdapter(String xmlData) {
        System.out.println("Converting the XML Data '" + xmlData + "' to JSON Data!");
        String newData = xmlData + " in json";
        jsonAnalyticsTool = new JSONAnalyticsTool();
        jsonAnalyticsTool.setJsonData(newData);
    }

    //Calling Adaptee processing class and also can log the response and further process here.
    public void AnalyzeData() {
        jsonAnalyticsTool.AnalyzeData();
    }
}

public class XmlToJsonAnalyseAdapter {
    public static void main(String[] args) {
        String xmlData = "Sample Data";
        JSONAnalyticsTool tool1 = new JSONAnalyticsTool();
        tool1.setJsonData(xmlData);
        tool1.AnalyzeData();

        System.out.println("----------------------------------------------");

        AnalyticsTool tool2 = new XMLToJSONAdapter(xmlData);
        tool2.AnalyzeData();
    }
}