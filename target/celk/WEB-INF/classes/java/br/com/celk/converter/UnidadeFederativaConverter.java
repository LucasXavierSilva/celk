package br.com.celk.converter;

import br.com.celk.model.UnidadeFederativa;
import br.com.celk.to.UnidadeFederativaTO;

/**
 * @author Lucas
 *
 */
public class UnidadeFederativaConverter {

	/**
	 * Converte {@link UnidadeFederativaTO} para {@link UnidadeFederativa}
	 * @param unidadeFederativaTO
	 * @return
	 */
	public UnidadeFederativa toEntity(UnidadeFederativaTO unidadeFederativaTO) {
		if(unidadeFederativaTO == null) {
			return null;
		}

		UnidadeFederativa unidadeFederativa = new UnidadeFederativa();
		unidadeFederativa.setId(unidadeFederativaTO.getId());
		unidadeFederativa.setNome(unidadeFederativaTO.getNome());
		unidadeFederativa.setSigla(unidadeFederativaTO.getSigla());
		unidadeFederativa.setData(unidadeFederativaTO.getData());

		return unidadeFederativa;
	}

	/**
	 * Converte {@link UnidadeFederativa} para {@link UnidadeFederativaTO}
	 * @param unidadeFederativa
	 * @return
	 */
	public UnidadeFederativaTO toTO(UnidadeFederativa unidadeFederativa) {
		if(unidadeFederativa == null) {
			return null;
		}
	
		return new UnidadeFederativaTO(unidadeFederativa.getId(), unidadeFederativa.getNome(), unidadeFederativa.getSigla(), unidadeFederativa.getData());
	}
}
