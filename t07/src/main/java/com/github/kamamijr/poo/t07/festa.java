package t07.src.main.java.com.github.kamamijr.poo.t07;

public class Festa {
    private TreeSet convidados = new TreeSet();

    public void novoConvidado(Convidado c){
        convidados.add(c);
    }
    public Festa(Convidado C){
        convidados.add(c);
    }
}
