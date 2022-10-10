package fr.su.traducteurtms;

import com.google.gson.JsonSyntaxException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URISyntaxException;

public class App {

    private static final Logger LOGGER = LogManager.getLogger( App.class );

    public static void main(String[] args) {

        try {
            LieuIn in = Recuperateur.recupIn("RF");

            LieuOut out = Traducteur.traduire(in);
            LOGGER.info("Transformation de 'in' en "+out);
        } catch (IOException | URISyntaxException | JsonSyntaxException e ) {
            LOGGER.error("Erreur lecture fichier Json RF", e);
        }

        try {
            LieuIn in = Recuperateur.recupIn("RA");

            LieuOut out = Traducteur.traduire(in);
            System.out.println(out);
        } catch (IOException | URISyntaxException e) {
            System.err.println("erreur lors de la lecture de RA");
        }

    }
}
