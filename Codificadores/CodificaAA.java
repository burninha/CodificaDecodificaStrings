package Codificadores;

public class CodificaAA implements Codifica {
 
    @Override
    public String codifica(String str) {
        return new StringBuilder(str).replaceAll("a","e");.toString();
    }

    @Override
    public String decodifica(String str) {
       
        return new StringBuilder(str).replaceAll("a","e");.toString();
    }

    @Override
    public String getMatriculaAutor() {
        return "Flávia by aa";
    }

    @Override
    public String getNomeAutor() {
        return "Flávia S.";
    }

}