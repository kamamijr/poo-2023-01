package com.github.kamamijr.poo.t17;

import java.util.ArrayList;

public class Comite {
    private ArrayList<PessoaParticipanteDeComite> membros;
    private ArrayList<PessoaParticipanteDeComite> presidentes;

    public void adicionarMembro(PessoaParticipanteDeComite novaPessoa){
        Boolean flag = novaPessoa.retornarSituacao();
        if(flag){
            this.presidentes.add(novaPessoa);
        } else {
            this.membros.add(novaPessoa);
        }
    }
}
