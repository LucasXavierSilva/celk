package br.com.celk.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import br.com.celk.converter.UnidadeFederativaConverter;
import br.com.celk.dao.UnidadeFederativaDAO;
import br.com.celk.exceptions.UnidadeFederativaException;
import br.com.celk.model.UnidadeFederativa;
import br.com.celk.to.UnidadeFederativaTO;

/**
 * Classe representando o Service da entidade {@link UnidadeFederativa}.
 * 
 * @author Lucas
 *
 */
@Service("unidadeFederativaService")
public class UnidadeFederativaService {
	@Inject
	UnidadeFederativaConverter unidadeFederativaConverter;
	@Inject
	UnidadeFederativaDAO unidadeFederativaDAO;

	/**
	 * Atualiza a {@link UnidadeFederativa} de acordo com a
	 * {@link UnidadeFederativaTO} informado.
	 * 
	 * @param unidadeFederativaTO
	 * @return
	 * @throws UnidadeFederativaException
	 */
	public UnidadeFederativaTO adicionarUF(UnidadeFederativaTO unidadeFederativaTO) throws UnidadeFederativaException {
		if (unidadeFederativaTO == null) {
			throw new UnidadeFederativaException("O campo 'Unidade Federativa' deve ser informado!");
		}
		unidadeFederativaTO.setData(LocalDateTime.now());
		UnidadeFederativa unidadeFederativa = unidadeFederativaConverter.toEntity(unidadeFederativaTO);
		unidadeFederativaDAO.salvar(unidadeFederativa);
		return unidadeFederativaConverter.toTO(unidadeFederativa);
	}

	/**
	 * Busca todas as {@link UnidadeFederativa}
	 * 
	 * @return
	 * @throws UnidadeFederativaException
	 */
	public List<UnidadeFederativaTO> getUFs() throws UnidadeFederativaException {
		return unidadeFederativaDAO.getAll();
	}

	/**
	 * Atualiza a {@link UnidadeFederativa} de acordo com a
	 * {@link UnidadeFederativaTO} informado.
	 * 
	 * @param unidadeFederativaTO
	 * @throws UnidadeFederativaException
	 */
	public void removerUF(UnidadeFederativaTO unidadeFederativaTO) throws UnidadeFederativaException {
		if (unidadeFederativaTO == null) {
			throw new UnidadeFederativaException("O campo 'Unidade Federativa' deve ser informado!");
		}
		UnidadeFederativa unidadeFederativa = unidadeFederativaConverter.toEntity(unidadeFederativaTO);
		unidadeFederativaDAO.remover(unidadeFederativa);
	}

	/**
	 * Atualiza a {@link UnidadeFederativa} de acordo com a
	 * {@link UnidadeFederativaTO} informado.
	 * 
	 * @param unidadeFederativaTO
	 * @return
	 * @throws UnidadeFederativaException
	 */
	public UnidadeFederativaTO atualizarUF(UnidadeFederativaTO unidadeFederativaTO) throws UnidadeFederativaException {
		if (unidadeFederativaTO == null) {
			throw new UnidadeFederativaException("O campo 'Unidade Federativa' deve ser informado!");
		}
		unidadeFederativaTO.setData(LocalDateTime.now());
		UnidadeFederativa unidadeFederativa = unidadeFederativaConverter.toEntity(unidadeFederativaTO);
		unidadeFederativaDAO.atualizar(unidadeFederativa);
		return unidadeFederativaConverter.toTO(unidadeFederativa);
	}

}
