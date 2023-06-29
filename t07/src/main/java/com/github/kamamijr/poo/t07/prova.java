package t07.src.main.java.com.github.kamamijr.poo.t07;

public class Prova{
    private byte numQuestoes;

    public byte getNumQuestoes(){
        return numQuestoes;
    }

    public void setNumQuestoes(byte n){
        if(n>0){
            numQuestoes=n;
        }
    }

}
