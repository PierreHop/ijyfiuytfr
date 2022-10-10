package fr.su.traducteurtms;

public class LieuOutData {

    private String nom;
    private String pays;
    private String codePostal;
    private String typeLieu;
    private String formatLieu;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getTypeLieu() {
        return typeLieu;
    }

    public void setTypeLieu(String typeLieu) {
        this.typeLieu = typeLieu;
    }

    public String getFormatLieu() {
        return formatLieu;
    }

    public void setFormatLieu(String formatLieu) {
        this.formatLieu = formatLieu;
    }

    @Override
    public String toString() {
        return "LieuOutData{" +
                "nom='" + nom + '\'' +
                ", pays='" + pays + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", typeLieu='" + typeLieu + '\'' +
                ", formatLieu='" + formatLieu + '\'' +
                '}';
    }
}
