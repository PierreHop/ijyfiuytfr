package fr.su.traducteurtms;

public class LieuIn {

    private String typeFichier ;
    private Integer numPartenaire;
    private String codeEntrepot;
    private String codePlateforme;
    private String numCIFLF;
    private String libPartenaire;
    private String codePays;
    private String codePostal;
    private String codeEnseigne;
    private Boolean suppression;

    public String getTypeFichier() {
        return typeFichier;
    }

    public void setTypeFichier(String typeFichier) {
        this.typeFichier = typeFichier;
    }

    public Integer getNumPartenaire() {
        return numPartenaire;
    }

    public void setNumPartenaire(Integer numPartenaire) {
        this.numPartenaire = numPartenaire;
    }

    public String getCodeEntrepot() {
        return codeEntrepot;
    }

    public void setCodeEntrepot(String codeEntrepot) {
        this.codeEntrepot = codeEntrepot;
    }

    public String getCodePlateforme() {
        return codePlateforme;
    }

    public void setCodePlateforme(String codePlateforme) {
        this.codePlateforme = codePlateforme;
    }

    public String getNumCIFLF() {
        return numCIFLF;
    }

    public void setNumCIFLF(String numCIFLF) {
        this.numCIFLF = numCIFLF;
    }

    public String getLibPartenaire() {
        return libPartenaire;
    }

    public void setLibPartenaire(String libPartenaire) {
        this.libPartenaire = libPartenaire;
    }

    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getCodeEnseigne() {
        return codeEnseigne;
    }

    public void setCodeEnseigne(String codeEnseigne) {
        this.codeEnseigne = codeEnseigne;
    }

    public Boolean getSuppression() {
        return suppression;
    }

    public void setSuppression(Boolean suppression) {
        this.suppression = suppression;
    }

    @Override
    public String toString() {
        String idClass = super.toString();
        return idClass +
                " { typeFichier='" + typeFichier + '\'' +
                ", numPartenaire=" + numPartenaire +
                ", codeEntrepot='" + codeEntrepot + '\'' +
                ", codePlateforme=" + codePlateforme +
                ", numCIFLF='" + numCIFLF + '\'' +
                ", libPartenaire='" + libPartenaire + '\'' +
                ", codePays='" + codePays + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", codeEnseigne='" + codeEnseigne + '\'' +
                ", suppression=" + suppression +
                '}';
    }

}
