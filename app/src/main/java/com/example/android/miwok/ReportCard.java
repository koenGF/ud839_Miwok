package com.example.android.miwok;

/**
 * this class has nothing to do with the rest of the application.
 */
public class ReportCard {
    String studentName;
    int studentNumber;
    double chemistryGrade;
    double mathGrade;
    double biologyGrade;
    double philosophyGrade;
    double physicsGrade;
    double englishLanguageGrade;
    double dutchLanguageGrade;
    double frenchLanguageGrade;
    double germanLanguageGrade;
    double spanishLanguageGrade;
    double historyGrade;
    double geographyGrade;
    double economicsGrade;
    double physicalEducationGrade;
    double artHistoryGrade;

    public ReportCard(String studentName, int studentNumber, double chemistryGrade, double mathGrade, double biologyGrade, double philosophyGrade, double physicsGrade, double englishLanguageGrade, double dutchLanguageGrade, double frenchLanguageGrade, double germanLanguageGrade, double spanishLanguageGrade, double historyGrade, double geographyGrade, double economicsGrade, double physicalEducationGrade, double artHistoryGrade) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.chemistryGrade = chemistryGrade;
        this.mathGrade = mathGrade;
        this.biologyGrade = biologyGrade;
        this.philosophyGrade = philosophyGrade;
        this.physicsGrade = physicsGrade;
        this.englishLanguageGrade = englishLanguageGrade;
        this.dutchLanguageGrade = dutchLanguageGrade;
        this.frenchLanguageGrade = frenchLanguageGrade;
        this.germanLanguageGrade = germanLanguageGrade;
        this.spanishLanguageGrade = spanishLanguageGrade;
        this.historyGrade = historyGrade;
        this.geographyGrade = geographyGrade;
        this.economicsGrade = economicsGrade;
        this.physicalEducationGrade = physicalEducationGrade;
        this.artHistoryGrade = artHistoryGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(double chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(double biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    public double getPhilosophyGrade() {
        return philosophyGrade;
    }

    public void setPhilosophyGrade(double philosophyGrade) {
        this.philosophyGrade = philosophyGrade;
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public double getEnglishLanguageGrade() {
        return englishLanguageGrade;
    }

    public void setEnglishLanguageGrade(double englishLanguageGrade) {
        this.englishLanguageGrade = englishLanguageGrade;
    }

    public double getDutchLanguageGrade() {
        return dutchLanguageGrade;
    }

    public void setDutchLanguageGrade(double dutchLanguageGrade) {
        this.dutchLanguageGrade = dutchLanguageGrade;
    }

    public double getFrenchLanguageGrade() {
        return frenchLanguageGrade;
    }

    public void setFrenchLanguageGrade(double frenchLanguageGrade) {
        this.frenchLanguageGrade = frenchLanguageGrade;
    }

    public double getGermanLanguageGrade() {
        return germanLanguageGrade;
    }

    public void setGermanLanguageGrade(double germanLanguageGrade) {
        this.germanLanguageGrade = germanLanguageGrade;
    }

    public double getSpanishLanguageGrade() {
        return spanishLanguageGrade;
    }

    public void setSpanishLanguageGrade(double spanishLanguageGrade) {
        this.spanishLanguageGrade = spanishLanguageGrade;
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        this.historyGrade = historyGrade;
    }

    public double getGeographyGrade() {
        return geographyGrade;
    }

    public void setGeographyGrade(double geographyGrade) {
        this.geographyGrade = geographyGrade;
    }

    public double getEconomicsGrade() {
        return economicsGrade;
    }

    public void setEconomicsGrade(double economicsGrade) {
        this.economicsGrade = economicsGrade;
    }

    public double getPhysicalEducationGrade() {
        return physicalEducationGrade;
    }

    public void setPhysicalEducationGrade(double physicalEducationGrade) {
        this.physicalEducationGrade = physicalEducationGrade;
    }

    public double getArtHistoryGrade() {
        return artHistoryGrade;
    }

    public void setArtHistoryGrade(double artHistoryGrade) {
        this.artHistoryGrade = artHistoryGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber=" + studentNumber +
                ", chemistryGrade=" + chemistryGrade +
                ", mathGrade=" + mathGrade +
                ", biologyGrade=" + biologyGrade +
                ", philosophyGrade=" + philosophyGrade +
                ", physicsGrade=" + physicsGrade +
                ", englishLanguageGrade=" + englishLanguageGrade +
                ", dutchLanguageGrade=" + dutchLanguageGrade +
                ", frenchLanguageGrade=" + frenchLanguageGrade +
                ", germanLanguageGrade=" + germanLanguageGrade +
                ", spanishLanguageGrade=" + spanishLanguageGrade +
                ", historyGrade=" + historyGrade +
                ", geographyGrade=" + geographyGrade +
                ", economicsGrade=" + economicsGrade +
                ", physicalEducationGrade=" + physicalEducationGrade +
                ", artHistoryGrade=" + artHistoryGrade +
                '}';
    }
}
