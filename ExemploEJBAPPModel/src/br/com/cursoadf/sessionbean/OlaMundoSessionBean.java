package br.com.cursoadf.sessionbean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class OlaMundoSessionBean
 */
@Stateless
@LocalBean
public class OlaMundoSessionBean implements OlaMundoSessionBeanRemote, OlaMundoSessionBeanLocal {

    /**
     * Default constructor. 
     */
    public OlaMundoSessionBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String olaMundo(String nome) {
		return "Seja Bem Vindo(a): " + nome;
	}
    
    

}
