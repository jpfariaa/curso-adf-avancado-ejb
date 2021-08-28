package br.com.cursoadf.sessionbean;

import br.com.cursoadf.entity.PacienteEntity;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 * @generated DT_ID=none
 */
@Stateless(name = "brComCursoadfSessionbeanPacienteSessionBean", mappedName = "ExemploEJBAPP-ExemploEJBAPPModel-brComCursoadfSessionbeanPacienteSessionBean")
public class PacienteSessionBean
        implements PacienteSessionBeanLocal, PacienteSessionBeanRemote
{

    /**
     * @generated DT_ID=none
     */
	@Resource
	SessionContext sessionContext;

    /**
     * @generated DT_ID=none
     */
	    @PersistenceContext(unitName="ExemploEJBAPPModel")
        private EntityManager em;

    /**
     * @generated DT_ID=none
     */
    public PacienteSessionBean() {
    }
    
    

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Object queryByRange(String jpqlStmt, int firstResult,
                               int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }

        return query.getResultList();
    }

    /**
     * @generated DT_ID=none
     */
    public PacienteEntity persistPacienteEntity(PacienteEntity pacienteEntity) {
        em.persist(pacienteEntity);
        return pacienteEntity;
    }

    /**
     * @generated DT_ID=none
     */
    public PacienteEntity mergePacienteEntity(PacienteEntity pacienteEntity) {
        return em.merge(pacienteEntity);
    }

    /**
     * @generated DT_ID=none
     */
    public void removePacienteEntity(PacienteEntity pacienteEntity) {
        pacienteEntity = em.find(PacienteEntity.class, pacienteEntity.getCpf());
        em.remove(pacienteEntity);
    }

    /**
     * @generated DT_ID=none
     */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<PacienteEntity> getPacienteEntityFindAll() {
        return em.createNamedQuery("PacienteEntity.findAll").getResultList();
    }

}
