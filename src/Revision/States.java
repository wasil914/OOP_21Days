package Revision;

public class States {

    int stateId;
    String stateName;
    String stateLanguage;
    float sexRatio;
    double literacyRate;
    static String Country = "India";

    public States(int stateId, String stateName, String stateLanguage, float sexRatio, double literacyRate) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.stateLanguage = stateLanguage;
        this.sexRatio = sexRatio;
        this.literacyRate = literacyRate;
    }
}
