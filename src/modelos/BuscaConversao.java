package src.modelos;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class BuscaConversao {

    public void buscaValores(Conversao conversao) throws IOException {

        URL url = new URL("https://v6.exchangerate-api.com/v6/aa62b21a8acc288317bd5289/pair/"
                +conversao.getMoedaBase()+"/"+conversao.getMoedaBuscada()+"/"+conversao.getValorMoedaBase());
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        try {
            request.connect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        conversao.setValorMoedaBuscada(jsonobj.get("conversion_result").getAsFloat());
    }
}