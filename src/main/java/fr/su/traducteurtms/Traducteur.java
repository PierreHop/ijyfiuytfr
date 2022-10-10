package fr.su.traducteurtms;

public class Traducteur {


    static LieuOut traduire(LieuIn in) {
        LieuOut out;
        switch (in.getTypeFichier()) {
            case "RA":
                out = traduireRA(in);
                break;
            case "RF":
                out = traduireRF(in);
                break;
            default:
                out = null;
                break;
        }
        return out;
    }

    private static LieuOut traduireRA(LieuIn in) {
        LieuOut lieuOutRA = new LieuOut();
        lieuOutRA.setApiLieu("A" + in.getNumPartenaire());
        lieuOutRA.setSuppression(in.getSuppression());
        if (in.getSuppression() == true) {
            lieuOutRA.setData(null);
        } else {
            LieuOutData lieuOutData1 = new LieuOutData();
            lieuOutRA.setData(lieuOutData1);

            lieuOutData1.setNom("A" + in.getNumPartenaire() + " " + in.getLibPartenaire());
            lieuOutData1.setPays(TraducteurPays.traduirePays(in.getCodePays()));

            lieuOutData1.setCodePostal(in.getCodePostal());
            lieuOutData1.setTypeLieu("1");
            switch (in.getCodeEnseigne()) {
                case "HU":
                    lieuOutData1.setFormatLieu("10");
                case "SU":
                    lieuOutData1.setFormatLieu("11");
                case "UE":
                    lieuOutData1.setFormatLieu("12");
                case "UT":
                    lieuOutData1.setFormatLieu("13");
                case "TM":
                    lieuOutData1.setFormatLieu("14");
                case "SE":
                    lieuOutData1.setFormatLieu("15");

            }

        }
        return lieuOutRA;
    }

    private static LieuOut traduireRF(LieuIn in) {
        LieuOut lieuOutRF = new LieuOut();
        lieuOutRF.setApiLieu("F" + in.getNumPartenaire() + "/" + in.getNumCIFLF());
        lieuOutRF.setSuppression(in.getSuppression());
        if (in.getSuppression() == true) {
            lieuOutRF.setData(null);
        } else {
            LieuOutData lieuOutData1 = new LieuOutData();
            lieuOutRF.setData(lieuOutData1);
            String nomComplet = in.getLibPartenaire() + " " + in.getNumPartenaire() + "/" + in.getNumCIFLF();
            if (nomComplet.length() < 30) {
                lieuOutData1.setNom(nomComplet);
            } else {
                lieuOutData1.setNom((nomComplet).substring(0, 30));
            }

            lieuOutData1.setPays(TraducteurPays.traduirePays(in.getCodePays()));

            lieuOutData1.setCodePostal(in.getCodePostal());
            lieuOutData1.setTypeLieu("2");
            lieuOutData1.setFormatLieu("20");

        }

        return lieuOutRF;
    }


}
