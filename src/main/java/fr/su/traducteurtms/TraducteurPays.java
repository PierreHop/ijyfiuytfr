package fr.su.traducteurtms;

public class TraducteurPays {
    public static String traduirePays(String paysIn) {

        String paysOut;

        switch (paysIn) {
            case "F":
                paysOut = "FR";
                break;

            case "E":
                paysOut = "ES";
                break;

            case "GB":
                paysOut = "GB";
                break;

            default:
                paysOut = null;
                break;
        }

        return paysOut;

    }
}