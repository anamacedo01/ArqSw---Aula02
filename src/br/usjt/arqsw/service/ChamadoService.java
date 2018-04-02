package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.ChamadoDAO;
import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;
/**
 * 
 * @author 816114287 - Ana Paula Silva de Macedo - SIN3AN MCA1
 */
@Service
public class ChamadoService {
	private ChamadoDAO dao;
	
	@Autowired
	public ChamadoService(ChamadoDAO dao){
		this.dao = dao;
	}
	
	public ArrayList<Chamado> listarChamados(Fila fila) throws IOException{
		return dao.listarChamados(fila);
	}
	public int cadastrarChamado(String descricao, int idFila) throws IOException{
		return dao.cadastrarChamado(descricao, idFila);
	}

}
