package br.com.celk.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.celk.exceptions.UnidadeFederativaException;
import br.com.celk.model.UnidadeFederativa;
import br.com.celk.to.UnidadeFederativaTO;

/**
 * Classe representando o Service da entidade {@link UnidadeFederativa}.
 * 
 * @author Lucas
 *
 */
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class UnidadeFederativaDAO implements Serializable {
	private static final long serialVersionUID = 1646267391331474403L;
	@Inject
	private static Logger logger;
	private EntityManager entityManager;

	private static final String GET_ALL = "SELECT new br.com.celk.to.UnidadeFederativaTO(uf.id, uf.nome, uf.sigla, uf.data) "
			+ "FROM UnidadeFederativa uf";

	/**
	 * Atualiza a {@link UnidadeFederativa} de acordo com a
	 * {@link UnidadeFederativaTO} informado.
	 * 
	 * @param unidadeFederativa
	 * @throws UnidadeFederativaException
	 */
	public void salvar(UnidadeFederativa unidadeFederativa) throws UnidadeFederativaException {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(unidadeFederativa);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			String msg = "Erro inesperado ao salvar Unidade Federativa";
			logger.error(msg);
			throw new UnidadeFederativaException(msg, e);
		}

	}

	/**
	 * Atualiza a {@link UnidadeFederativa} de acordo com a
	 * {@link UnidadeFederativaTO} informado.
	 * 
	 * @param unidadeFederativa
	 * @throws UnidadeFederativaException
	 */
	public void remover(UnidadeFederativa unidadeFederativa) throws UnidadeFederativaException {
		try {
			entityManager.getTransaction().begin();
			UnidadeFederativa uf = entityManager.find(UnidadeFederativa.class, unidadeFederativa.getId());
			entityManager.remove(uf);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			String msg = "Erro inesperado ao remover Unidade Federativa";
			logger.error(msg);
			throw new UnidadeFederativaException(msg, e);
		}

	}

	/**
	 * Atualiza a {@link UnidadeFederativa} de acordo com a
	 * {@link UnidadeFederativaTO} informado.
	 * 
	 * @param unidadeFederativa
	 * @throws UnidadeFederativaException
	 */
	public void atualizar(UnidadeFederativa unidadeFederativa) throws UnidadeFederativaException {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(unidadeFederativa);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			String msg = "Erro inesperado ao atualizar Unidade Federativa";
			logger.error(msg);
			throw new UnidadeFederativaException(msg, e);
		}

	}

	/**
	 * Busca todas as {@link UnidadeFederativa}
	 * 
	 * @return
	 * @throws UnidadeFederativaException
	 */
	public List<UnidadeFederativaTO> getAll() throws UnidadeFederativaException {
		try {
			entityManager.getTransaction().begin();
			TypedQuery<UnidadeFederativaTO> query = entityManager
					.createQuery(GET_ALL + UnidadeFederativa.class.getName(), UnidadeFederativaTO.class);
			entityManager.getTransaction().commit();
			return query.getResultList();
		} catch (NoResultException e) {
			String msg = "Nenhum registro encontrado";
			logger.error(msg);
			throw new UnidadeFederativaException(msg, e);
		}
	}

}
