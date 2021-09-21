package com.empresa.proyecto.service;

import com.empresa.proyecto.bean.Rut;
import java.util.ArrayList;
import java.util.List;

public class RutService {

    List<Rut> listaRut = new ArrayList<>();
    
    public RutService() {
    }
    
    public String insertarRut(int digitosRut, int verificadorRut){
        
        Integer M=0,S=1,T=digitosRut;
		for (;T!=0;T=(int) Math.floor(T/=10))
			S=((S+T%10*(9-M++%6))%11);
        
        Rut r = new Rut();
        r.setDigitosRut(digitosRut);
        r.setVerificadorRut(verificadorRut);
        r.setComparadorRut(S-1);
                
        int size = listaRut.size();
        if (size!=0){
            listaRut.clear();
        }
        listaRut.add(r);
        return "Se agrego " + r.getDigitosRut() +"-"+ r.getVerificadorRut()+ "Verificador"+r.getComparadorRut();
    }
    
    public List<Rut> listarRut(){
        return listaRut;
    }

}