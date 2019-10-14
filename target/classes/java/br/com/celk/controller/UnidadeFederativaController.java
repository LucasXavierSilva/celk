/**
 * 
 */
package br.com.celk.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.celk.exceptions.UnidadeFederativaException;
import br.com.celk.service.UnidadeFederativaService;
import br.com.celk.to.UnidadeFederativaTO;

/**
 * @author Lucas
 *
 */
@Controller
public class UnidadeFederativaController {

	private UnidadeFederativaService unidadeFederativaService;
	Logger logger;
	
	@Autowired(required=true)
	@Qualifier(value="unidadeFederativaService")
	public void setUnidadeFederativaService(UnidadeFederativaService uf){
		this.unidadeFederativaService = uf;
	}

	@RequestMapping(value= "/uf", method = RequestMethod.GET)
	@ResponseBody
	public List<UnidadeFederativaTO> getUFs() throws Exception {
		List<UnidadeFederativaTO> ufs = this.unidadeFederativaService.getUFs();
		return ufs;
	}

	@RequestMapping(value= "/uf/adicionar", method = RequestMethod.POST)
	@ResponseBody
	public UnidadeFederativaTO adicionarUF(@ModelAttribute("uf") UnidadeFederativaTO unidadeFederativaTO) throws Exception {
		try {
			unidadeFederativaTO = this.unidadeFederativaService.adicionarUF(unidadeFederativaTO);
			return unidadeFederativaTO;
		} catch (UnidadeFederativaException e) {
			logger.error("Falha ao adicionar UF: ", e);
			throw new Exception(e);
		}
	}

	@RequestMapping(value= "/uf/deletar", method = RequestMethod.POST)
	@ResponseBody
	public void removerUF(@ModelAttribute("uf") UnidadeFederativaTO unidadeFederativaTO) throws Exception {
		try {
			this.unidadeFederativaService.removerUF(unidadeFederativaTO);
		} catch (UnidadeFederativaException e) {	
			logger.error("Falha ao remover UF: ", e);
			throw new Exception(e);
		}
	}

	@RequestMapping(value= "/uf/deletar", method = RequestMethod.POST)
	@ResponseBody
	public void atualizarUF(@ModelAttribute("uf") UnidadeFederativaTO unidadeFederativaTO) throws Exception {
		try {
			unidadeFederativaTO = this.unidadeFederativaService.atualizarUF(unidadeFederativaTO);
		} catch (UnidadeFederativaException e) {	
			logger.error("Falha ao remover UF: ", e);
			throw new Exception(e);
		}
	}
}
