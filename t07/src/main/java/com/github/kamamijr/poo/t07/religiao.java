package t07.src.main.java.com.github.kamamijr.poo.t07;

public class Religiao {
    private ArraList devotos;

    public void novoFiel(Devoto d){
        devoto.add(d);
    }
}

public class Devoto(){
    public Devoto (Religiao r){
        r.novoFiel(this);
    }
}
