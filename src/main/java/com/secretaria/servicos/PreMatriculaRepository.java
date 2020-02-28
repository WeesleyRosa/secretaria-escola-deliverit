package com.secretaria.servicos;

import com.secretaria.dominios.PreMatricula;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PreMatriculaRepository {

    private List<PreMatricula> preMatriculas = new ArrayList<PreMatricula>();

    public PreMatricula save(PreMatricula preMatricula) {
        preMatriculas.add(preMatricula);
        return preMatricula;
    }

    public PreMatricula retornaMatricula(int id) {
        for(PreMatricula preMatri : preMatriculas) {
            if (preMatri.getCandidato().getId().equals(id))
            {
                preMatri.setAvaliado(Boolean.TRUE);
                return preMatri;
            }
        }
        return null;
    }

    public List<PreMatricula> getPreMatriculas() {
        return preMatriculas;
    }

    public void setPreMatriculas(List<PreMatricula> preMatriculas) {
        this.preMatriculas = preMatriculas;
    }
}
