package fr.su.traducteurtms;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recuperateur {


    static LieuIn recupIn(String parTypeFlux) throws IOException, URISyntaxException {

        Gson gson = new Gson();

        // create a reader
        Reader reader = Files.newBufferedReader(Paths.get(Recuperateur.class.getClassLoader().getResource(parTypeFlux+".json").toURI()));


        LieuIn in = gson.fromJson(reader, LieuIn.class);

        return in ;
    }

}
