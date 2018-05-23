package edu.utm.service.usuario;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import edu.utm.bd.domain.Usuario;
import edu.utm.dao.usuario.UsuarioDao;

@Named
public class UsuarioServiceImpl implements UsuarioService {
	@Inject
	UsuarioDao usuarioDao;

	@Override
	public List<Usuario> findAllUsuarios() {
		return usuarioDao.findAllUsuarios();
	}

	@Override
	public void updateUsuario(Usuario usuario) {
		
	}

	@Override
	public Usuario findOneUsuario(Usuario usuario) {
		return usuarioDao.findOneUsuario(usuario);
	}

	@Override
	public void insertUsuario(Usuario usuario) {
		
	}

	@Override
	public void deleteOneUsuario(Usuario usuario) {
		
	}
	
}
