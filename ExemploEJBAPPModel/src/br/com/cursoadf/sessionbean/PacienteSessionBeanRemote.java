package br.com.cursoadf.sessionbean;

import br.com.cursoadf.entity.PacienteEntity;
import java.util.List;
import javax.ejb.Remote;


/**
 * @generated DT_ID=none
 */
@Remote
public interface PacienteSessionBeanRemote
{

    /**
     * @generated DT_ID=none
     */
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    /**
     * @generated DT_ID=none
     */
    public PacienteEntity persistPacienteEntity(PacienteEntity pacienteEntity);

    /**
     * @generated DT_ID=none
     */
    public PacienteEntity mergePacienteEntity(PacienteEntity pacienteEntity);

    /**
     * @generated DT_ID=none
     */
    public void removePacienteEntity(PacienteEntity pacienteEntity);

    /**
     * @generated DT_ID=none
     */
    public List<PacienteEntity> getPacienteEntityFindAll();

}
